package com.studentschedulleapp.androidclient.data.repos.http

import com.studentschedulleapp.androidclient.data.api.retrofit.GatewayRetrofitClient
import com.studentschedulleapp.androidclient.domain.models.tokens.UserTokens
import com.studentschedulleapp.androidclient.domain.repos.AuthorizeRepository

class AuthorizeRepositoryImpl : AuthorizeRepository {
    override fun login(login: String, password: String) {

    }

    override fun register(login: String, password: String) {
        TODO("Not yet implemented")
    }

    override fun verify(login: String, code: Long): UserTokens {
        TODO("Not yet implemented")
    }

    override fun refresh(refreshToken: String): UserTokens {
        TODO("Not yet implemented")
    }
}