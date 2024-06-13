package com.studentschedulleapp.androidclient.data.api.retrofit.services

import com.studentschedulleapp.androidclient.data.api.CUSTOM_LESSON
import com.studentschedulleapp.androidclient.data.api.SPECIFIC_LESSON
import com.studentschedulleapp.androidclient.domain.models.CustomLesson
import com.studentschedulleapp.androidclient.domain.models.SpecificLesson
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface SpecificLessonRetrofitService {
    @GET(SPECIFIC_LESSON.ID_PATH + "/{ids}")
    fun getById(
        @Header("User-Token") accessToken: String,
        @Header("Client-Token") clientToken: String,
        @Header("Client-Version") clientVersion: String,
        @Path("ids") ids: String
    ): Call<List<SpecificLesson>>
    @GET(SPECIFIC_LESSON.GROUP_PATH + "/{id}")
    fun getByGroupId(
        @Header("User-Token") accessToken: String,
        @Header("Client-Token") clientToken: String,
        @Header("Client-Version") clientVersion: String,
        @Path("id") id: Long
    ): Call<List<SpecificLesson>>
    @POST(SPECIFIC_LESSON.CREATE_PATH)
    fun create(
        @Header("User-Token") accessToken: String,
        @Header("Client-Token") clientToken: String,
        @Header("Client-Version") clientVersion: String,
        @Body request: SpecificLesson
    ): Call<SpecificLesson>
    @PATCH(SPECIFIC_LESSON.EDIT_PATH)
    fun edit(
        @Header("User-Token") accessToken: String,
        @Header("Client-Token") clientToken: String,
        @Header("Client-Version") clientVersion: String,
        @Body request: SpecificLesson,
        @Query("params") params: String
    ): Call<SpecificLesson>
    @DELETE(SPECIFIC_LESSON.DELETE_PATH + "/{ids}")
    fun delete(
        @Header("User-Token") accessToken: String,
        @Header("Client-Token") clientToken: String,
        @Header("Client-Version") clientVersion: String,
        @Path("ids") ids: String
    ): Call<Void>

}