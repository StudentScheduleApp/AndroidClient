package com.studentschedulleapp.androidclient.domain.repos

import com.studentschedulleapp.androidclient.domain.models.tokens.Token

interface RefreshTokenRepository {
    fun getRefreshTokenByUID(uid: Long): Token?
    fun saveRefreshToken(refreshToken: Token)
}