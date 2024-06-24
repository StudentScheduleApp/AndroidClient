package com.studentschedulleapp.androidclient.data.repos.sqlite

import android.content.Context
import com.studentschedulleapp.androidclient.data.sqlite.RefreshTokenDBManager
import com.studentschedulleapp.androidclient.domain.models.tokens.Token
import com.studentschedulleapp.androidclient.domain.repos.RefreshTokenRepository

class RefreshTokenRepositoryImpl(context: Context) : RefreshTokenRepository {
    private val manager = RefreshTokenDBManager(context)
    override fun getRefreshTokenByUID(uid: Long): Token? {
        val tokens = manager.getTokens()
        tokens.find { it.userId == uid }?.let {
            return it
        }
        return null
    }

    override fun saveRefreshToken(refreshToken: Token) {
        manager.clear()
        manager.saveToken(refreshToken)
    }
}