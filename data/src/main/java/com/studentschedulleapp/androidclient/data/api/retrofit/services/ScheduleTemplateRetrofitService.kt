package com.studentschedulleapp.androidclient.data.api.retrofit.services

import com.studentschedulleapp.androidclient.domain.models.ScheduleTemplate
import retrofit2.http.Header

interface ScheduleTemplateRetrofitService {
    fun getById(
        @Header("User-Token") accessToken: String,
        @Header("Client-Token") clientToken: String,
        @Header("Client-Version") clientVersion: String,
        id: Long
    ): ScheduleTemplate
    fun getByGroupId(
        @Header("User-Token") accessToken: String,
        @Header("Client-Token") clientToken: String,
        @Header("Client-Version") clientVersion: String,
        id: Long
    ): List<ScheduleTemplate>
    fun create(
        @Header("User-Token") accessToken: String,
        @Header("Client-Token") clientToken: String,
        @Header("Client-Version") clientVersion: String,
        data: ScheduleTemplate
    ): ScheduleTemplate
    fun edit(
        @Header("User-Token") accessToken: String,
        @Header("Client-Token") clientToken: String,
        @Header("Client-Version") clientVersion: String,
        data: ScheduleTemplate,
        editedFields: Set<String>
    ): ScheduleTemplate
    fun delete(
        @Header("User-Token") accessToken: String,
        @Header("Client-Token") clientToken: String,
        @Header("Client-Version") clientVersion: String,
        id: Long
    )

}