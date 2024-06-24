package com.studentschedulleapp.androidclient.domain.repos

import com.studentschedulleapp.androidclient.domain.models.tokens.Token
import com.studentschedulleapp.androidclient.domain.models.tokens.UserTokens

interface AccessTokenRepository {
    fun getAccessTokenByUID(uid: Long): Token?
    fun saveAccessToken(accessToken: Token)
}