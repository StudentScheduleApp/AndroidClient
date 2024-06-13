package com.studentschedulleapp.androidclient.data.api.retrofit.services

import com.studentschedulleapp.androidclient.data.api.CUSTOM_LESSON
import com.studentschedulleapp.androidclient.data.api.SCHEDULE_TEMPLATE
import com.studentschedulleapp.androidclient.domain.models.CustomLesson
import com.studentschedulleapp.androidclient.domain.models.ScheduleTemplate
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface ScheduleTemplateRetrofitService {
    @GET(SCHEDULE_TEMPLATE.ID_PATH + "/{ids}")
    fun getById(
        @Header("User-Token") accessToken: String,
        @Header("Client-Token") clientToken: String,
        @Header("Client-Version") clientVersion: String,
        @Path("ids") ids: String
    ): Call<List<ScheduleTemplate>>
    @GET(SCHEDULE_TEMPLATE.GROUP_PATH + "/{id}")
    fun getByGroupId(
        @Header("User-Token") accessToken: String,
        @Header("Client-Token") clientToken: String,
        @Header("Client-Version") clientVersion: String,
        @Path("id") id: Long
    ): Call<List<ScheduleTemplate>>
    @POST(SCHEDULE_TEMPLATE.CREATE_PATH)
    fun create(
        @Header("User-Token") accessToken: String,
        @Header("Client-Token") clientToken: String,
        @Header("Client-Version") clientVersion: String,
        @Path("id") id: Long
    ): Call<List<ScheduleTemplate>>
    @PATCH(SCHEDULE_TEMPLATE.EDIT_PATH)
    fun edit(
        @Header("User-Token") accessToken: String,
        @Header("Client-Token") clientToken: String,
        @Header("Client-Version") clientVersion: String,
        @Body request: ScheduleTemplate,
        @Query("params") params: String
    ): Call<ScheduleTemplate>
    @DELETE(SCHEDULE_TEMPLATE.DELETE_PATH + "/{ids}")
    fun delete(
        @Header("User-Token") accessToken: String,
        @Header("Client-Token") clientToken: String,
        @Header("Client-Version") clientVersion: String,
        @Path("ids") ids: String
    ): Call<Void>

}