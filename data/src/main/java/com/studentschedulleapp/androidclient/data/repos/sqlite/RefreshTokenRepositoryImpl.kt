package com.studentschedulleapp.androidclient.data.repos.sqlite

import com.studentschedulleapp.androidclient.domain.models.tokens.Token
import com.studentschedulleapp.androidclient.domain.repos.RefreshTokenRepository

class RefreshTokenRepositoryImpl : RefreshTokenRepository {
    override fun getRefreshTokenByUID(uid: Int): Token {
        TODO("Not yet implemented")
    }

    override fun saveRefreshToken(refreshToken: Token?) {
        TODO("Not yet implemented")
    }
}