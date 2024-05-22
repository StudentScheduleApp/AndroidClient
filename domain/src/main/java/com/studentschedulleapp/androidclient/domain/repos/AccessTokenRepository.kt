package com.studentschedulleapp.androidclient.domain.repos

import com.studentschedulleapp.androidclient.domain.models.tokens.Token
import com.studentschedulleapp.androidclient.domain.models.tokens.UserTokens

interface AccessTokenRepository {
    fun getAccessTokenByUID(uid: Int): Token
    fun saveAccessToken(accessToken: Token?)
}