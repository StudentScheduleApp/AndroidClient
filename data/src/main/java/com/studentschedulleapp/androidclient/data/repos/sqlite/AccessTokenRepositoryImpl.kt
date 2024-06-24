package com.studentschedulleapp.androidclient.data.repos.sqlite

import android.content.Context
import com.studentschedulleapp.androidclient.data.sqlite.AccessTokenDBManager
import com.studentschedulleapp.androidclient.data.sqlite.RefreshTokenDBManager
import com.studentschedulleapp.androidclient.domain.models.tokens.Token
import com.studentschedulleapp.androidclient.domain.repos.AccessTokenRepository

class AccessTokenRepositoryImpl(context: Context) : AccessTokenRepository {
    private val manager = AccessTokenDBManager(context)
    override fun getAccessTokenByUID(uid: Long): Token? {
        val tokens = manager.getTokens()
        tokens.find { it.userId == uid }?.let {
            return it
        }
        return null
    }

    override fun saveAccessToken(accessToken: Token) {
        manager.clear()
        manager.saveToken(accessToken)
    }
}