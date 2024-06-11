package com.studentschedulleapp.androidclient.data.api.retrofit.services

import com.studentschedulleapp.androidclient.domain.models.tokens.UserTokens
import retrofit2.Call
import retrofit2.http.Header

interface AuthorizeRetrofitService {
    fun login(
        @Header("Client-Token") clientToken: String,
        @Header("Client-Version") clientVersion: String,
        login: String,
        password: String
    )
    fun register(
        @Header("Client-Token") clientToken: String,
        @Header("Client-Version") clientVersion: String,
        login: String,
        password: String
    )
    fun verify(
        @Header("Client-Token") clientToken: String,
        @Header("Client-Version") clientVersion: String,
        login: String,
        code: Long
    ): UserTokens
    fun refresh(
        @Header("Client-Token") clientToken: String,
        @Header("Client-Version") clientVersion: String,
        refreshToken: String
    ): UserTokens

}