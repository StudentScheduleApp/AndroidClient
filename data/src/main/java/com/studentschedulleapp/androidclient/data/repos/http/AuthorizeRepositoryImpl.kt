package com.studentschedulleapp.androidclient.data.repos.http

import com.studentschedulleapp.androidclient.data.api.models.JwtLoginRequest
import com.studentschedulleapp.androidclient.data.api.models.JwtRefreshRequest
import com.studentschedulleapp.androidclient.data.api.models.JwtRegisterRequest
import com.studentschedulleapp.androidclient.data.api.models.VerifyEmailRequest
import com.studentschedulleapp.androidclient.data.api.retrofit.GatewayRetrofitClient
import com.studentschedulleapp.androidclient.data.api.retrofit.services.AuthorizeRetrofitService
import com.studentschedulleapp.androidclient.domain.exceptions.ExternalAppException
import com.studentschedulleapp.androidclient.domain.exceptions.InternalAppException
import com.studentschedulleapp.androidclient.domain.exceptions.UserUnAuthorizedException
import com.studentschedulleapp.androidclient.domain.models.tokens.Token
import com.studentschedulleapp.androidclient.domain.models.tokens.TokenType
import com.studentschedulleapp.androidclient.domain.models.tokens.UserTokens
import com.studentschedulleapp.androidclient.domain.repos.AuthorizeRepository

class AuthorizeRepositoryImpl : AuthorizeRepository {
    override fun login(login: String, password: String): UserTokens {
        val response = GatewayRetrofitClient.getInstance().create(AuthorizeRetrofitService::class.java).login("CLIENT_TOKEN", "CLIENT_VERSION", JwtLoginRequest(login, password)).execute()
        if(response.isSuccessful){
            val body = response.body()
            if (body != null){
                return UserTokens(Token(body.id, TokenType.ACCESS, body.accessToken, body.accessTokenValidity), Token(body.id, TokenType.REFRESH, body.refreshToken, body.refreshTokenValidity))
            }
            else
                throw ExternalAppException("'login' response body is null")
        }
        else {
            if (response.code() in 500..599)
                throw ExternalAppException("'login' request error code: ${response.code()}")
            else if (response.code() == 401)
                throw UserUnAuthorizedException("'login' request error code: ${response.code()} (unauthorized)")
            else if (response.code() == 403)
                throw UserUnAuthorizedException("'login' request error code: ${response.code()} (forbidden)")
            else
                throw InternalAppException("'login' request error code: ${response.code()}")
        }
    }

    override fun register(login: String, password: String, firstName: String, lastName: String) {
        val response = GatewayRetrofitClient.getInstance().create(AuthorizeRetrofitService::class.java).register("CLIENT_TOKEN", "CLIENT_VERSION", JwtRegisterRequest(login, password, firstName, lastName)).execute()
        if(response.isSuccessful){
            return
        }
        else {
            if (response.code() in 500..599)
                throw ExternalAppException("'register' request error code: ${response.code()}")
            else if (response.code() == 401)
                throw UserUnAuthorizedException("'register' request error code: ${response.code()} (unauthorized)")
            else if (response.code() == 403)
                throw UserUnAuthorizedException("'register' request error code: ${response.code()} (forbidden)")
            else
                throw InternalAppException("'register' request error code: ${response.code()}")
        }
    }

    override fun verify(login: String, code: Long): UserTokens {
        val response = GatewayRetrofitClient.getInstance().create(AuthorizeRetrofitService::class.java).verify("CLIENT_TOKEN", "CLIENT_VERSION", VerifyEmailRequest(login, code)).execute()
        if(response.isSuccessful){
            val body = response.body()
            if (body != null){
                return UserTokens(Token(body.id, TokenType.ACCESS, body.accessToken, body.accessTokenValidity), Token(body.id, TokenType.REFRESH, body.refreshToken, body.refreshTokenValidity))
            }
            else
                throw ExternalAppException("'verify' response body is null")
        }
        else {
            if (response.code() in 500..599)
                throw ExternalAppException("'verify' request error code: ${response.code()}")
            else if (response.code() == 401)
                throw UserUnAuthorizedException("'verify' request error code: ${response.code()} (unauthorized)")
            else if (response.code() == 403)
                throw UserUnAuthorizedException("'verify' request error code: ${response.code()} (forbidden)")
            else
                throw InternalAppException("'verify' request error code: ${response.code()}")
        }
    }

    override fun refresh(refreshToken: String): UserTokens {
        val response = GatewayRetrofitClient.getInstance().create(AuthorizeRetrofitService::class.java).refresh("CLIENT_TOKEN", "CLIENT_VERSION", JwtRefreshRequest(refreshToken)).execute()
        if(response.isSuccessful){
            val body = response.body()
            if (body != null){
                return UserTokens(Token(body.id, TokenType.ACCESS, body.accessToken, body.accessTokenValidity), Token(body.id, TokenType.REFRESH, body.refreshToken, body.refreshTokenValidity))
            }
            else
                throw ExternalAppException("'refresh' response body is null")
        }
        else {
            if (response.code() in 500..599)
                throw ExternalAppException("'refresh' request error code: ${response.code()}")
            else if (response.code() == 401)
                throw UserUnAuthorizedException("'refresh' request error code: ${response.code()} (unauthorized)")
            else if (response.code() == 403)
                throw UserUnAuthorizedException("'refresh' request error code: ${response.code()} (forbidden)")
            else
                throw InternalAppException("'refresh' request error code: ${response.code()}")
        }
    }
}