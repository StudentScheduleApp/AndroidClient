package com.studentschedulleapp.androidclient.data.api.retrofit.services

import com.studentschedulleapp.androidclient.data.api.CUSTOM_LESSON
import com.studentschedulleapp.androidclient.data.api.GROUP
import com.studentschedulleapp.androidclient.domain.models.CustomLesson
import com.studentschedulleapp.androidclient.domain.models.Group
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface GroupRetrofitService {
    @GET(GROUP.ID_PATH + "/{ids}")
    fun getById(
        @Header("User-Token") accessToken: String,
        @Header("Client-Token") clientToken: String,
        @Header("Client-Version") clientVersion: String,
        @Path("ids") ids: String
    ): Call<List<Group>>
    @POST(GROUP.CREATE_PATH)
    fun create(
        @Header("User-Token") accessToken: String,
        @Header("Client-Token") clientToken: String,
        @Header("Client-Version") clientVersion: String,
        @Body request: Group
    ): Call<Group>
    @PATCH(GROUP.EDIT_PATH)
    fun edit(
        @Header("User-Token") accessToken: String,
        @Header("Client-Token") clientToken: String,
        @Header("Client-Version") clientVersion: String,
        @Body request: Group,
        @Query("params") params: String
    ): Call<Group>
    @DELETE(GROUP.DELETE_PATH + "/{ids}")
    fun delete(
        @Header("User-Token") accessToken: String,
        @Header("Client-Token") clientToken: String,
        @Header("Client-Version") clientVersion: String,
        @Path("ids") ids: String
    ): Call<Void>

}