package com.studentschedulleapp.androidclient.data.api.retrofit.services

import com.studentschedulleapp.androidclient.data.api.AUTH
import com.studentschedulleapp.androidclient.data.api.models.JwtLoginRequest
import com.studentschedulleapp.androidclient.data.api.models.JwtRefreshRequest
import com.studentschedulleapp.androidclient.data.api.models.JwtRegisterRequest
import com.studentschedulleapp.androidclient.data.api.models.JwtResponse
import com.studentschedulleapp.androidclient.data.api.models.VerifyEmailRequest
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

interface AuthorizeRetrofitService {
    @POST(AUTH.LOGIN_PATH)
    fun login(
        @Header("Client-Token") clientToken: String,
        @Header("Client-Version") clientVersion: String,
        @Body request: JwtLoginRequest
    ): Call<JwtResponse>
    @POST(AUTH.REGISTER_PATH)
    fun register(
        @Header("Client-Token") clientToken: String,
        @Header("Client-Version") clientVersion: String,
        @Body request: JwtRegisterRequest
    ): Call<Void>
    @POST(AUTH.VERIFY_PATH)
    fun verify(
        @Header("Client-Token") clientToken: String,
        @Header("Client-Version") clientVersion: String,
        @Body request: VerifyEmailRequest
    ): Call<JwtResponse>
    @POST(AUTH.REFRESH_PATH)
    fun refresh(
        @Header("Client-Token") clientToken: String,
        @Header("Client-Version") clientVersion: String,
        @Body request: JwtRefreshRequest
    ): Call<JwtResponse>

}