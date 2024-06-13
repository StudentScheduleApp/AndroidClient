package com.studentschedulleapp.androidclient.data.api.retrofit.services

import com.studentschedulleapp.androidclient.data.api.CUSTOM_LESSON
import com.studentschedulleapp.androidclient.data.api.OUTLINE_MEDIA
import com.studentschedulleapp.androidclient.domain.models.CustomLesson
import com.studentschedulleapp.androidclient.domain.models.OutlineMedia
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface OutlineMediaRetrofitService {
    @GET(OUTLINE_MEDIA.ID_PATH + "/{ids}")
    fun getById(
        @Header("User-Token") accessToken: String,
        @Header("Client-Token") clientToken: String,
        @Header("Client-Version") clientVersion: String,
        @Path("ids") ids: String
    ): Call<List<OutlineMedia>>
    @GET(OUTLINE_MEDIA.OUTLINE_PATH + "/{id}")
    fun getByOutlineId(
        @Header("User-Token") accessToken: String,
        @Header("Client-Token") clientToken: String,
        @Header("Client-Version") clientVersion: String,
        @Path("id") id: Long
    ): Call<List<OutlineMedia>>
    @POST(OUTLINE_MEDIA.CREATE_PATH)
    fun create(
        @Header("User-Token") accessToken: String,
        @Header("Client-Token") clientToken: String,
        @Header("Client-Version") clientVersion: String,
        @Body request: OutlineMedia
    ): Call<OutlineMedia>
    @POST(OUTLINE_MEDIA.EDIT_PATH)
    fun edit(
        @Header("User-Token") accessToken: String,
        @Header("Client-Token") clientToken: String,
        @Header("Client-Version") clientVersion: String,
        @Body request: OutlineMedia,
        @Query("params") params: String
    ): Call<OutlineMedia>
    @DELETE(OUTLINE_MEDIA.DELETE_PATH + "/{ids}")
    fun delete(
        @Header("User-Token") accessToken: String,
        @Header("Client-Token") clientToken: String,
        @Header("Client-Version") clientVersion: String,
        @Path("ids") ids: String
    ): Call<Void>

}