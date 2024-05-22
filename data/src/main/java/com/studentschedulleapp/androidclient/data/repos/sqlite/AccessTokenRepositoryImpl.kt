package com.studentschedulleapp.androidclient.data.repos.sqlite

import com.studentschedulleapp.androidclient.domain.models.tokens.Token
import com.studentschedulleapp.androidclient.domain.repos.AccessTokenRepository

class AccessTokenRepositoryImpl : AccessTokenRepository {
    override fun getAccessTokenByUID(uid: Int): Token {
        TODO("Not yet implemented")
    }

    override fun saveAccessToken(accessToken: Token?) {
        TODO("Not yet implemented")
    }
}