package com.studentschedulleapp.androidclient.domain.repos

import com.studentschedulleapp.androidclient.domain.models.tokens.Token

interface RefreshTokenRepository {
    fun getRefreshTokenByUID(uid: Int): Token
    fun saveRefreshToken(refreshToken: Token?)
}