package com.studentschedulleapp.androidclient.data.api.retrofit.services

import com.studentschedulleapp.androidclient.data.api.CUSTOM_LESSON
import com.studentschedulleapp.androidclient.data.api.LESSON_TEMPLATE
import com.studentschedulleapp.androidclient.domain.models.CustomLesson
import com.studentschedulleapp.androidclient.domain.models.LessonTemplate
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface LessonTemplateRetrofitService {
    @GET(LESSON_TEMPLATE.ID_PATH + "/{ids}")
    fun getById(
        @Header("User-Token") accessToken: String,
        @Header("Client-Token") clientToken: String,
        @Header("Client-Version") clientVersion: String,
        @Path("ids") ids: String
    ): Call<List<LessonTemplate>>
    @GET(LESSON_TEMPLATE.SCHEDULE_TEMPLATE_PATH + "/{id}")
    fun getByScheduleTemplateId(
        @Header("User-Token") accessToken: String,
        @Header("Client-Token") clientToken: String,
        @Header("Client-Version") clientVersion: String,
        @Path("id") id: Long
    ): Call<List<LessonTemplate>>
    @POST(LESSON_TEMPLATE.CREATE_PATH)
    fun create(
        @Header("User-Token") accessToken: String,
        @Header("Client-Token") clientToken: String,
        @Header("Client-Version") clientVersion: String,
        @Body request: LessonTemplate
    ): Call<LessonTemplate>
    @PATCH(LESSON_TEMPLATE.EDIT_PATH)
    fun edit(
        @Header("User-Token") accessToken: String,
        @Header("Client-Token") clientToken: String,
        @Header("Client-Version") clientVersion: String,
        @Body request: LessonTemplate,
        @Query("params") params: String
    ): Call<LESSON_TEMPLATE>
    @DELETE(LESSON_TEMPLATE.DELETE_PATH + "/{ids}")
    fun delete(
        @Header("User-Token") accessToken: String,
        @Header("Client-Token") clientToken: String,
        @Header("Client-Version") clientVersion: String,
        @Path("ids") ids: String
    ): Call<Void>

}