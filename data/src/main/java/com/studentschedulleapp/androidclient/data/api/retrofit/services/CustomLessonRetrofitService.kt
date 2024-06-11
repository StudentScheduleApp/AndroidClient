package com.studentschedulleapp.androidclient.data.api.retrofit.services

import com.studentschedulleapp.androidclient.domain.models.CustomLesson
import retrofit2.http.Header

interface CustomLessonRetrofitService {
    fun getById(
        @Header("User-Token") accessToken: String,
        @Header("Client-Token") clientToken: String,
        @Header("Client-Version") clientVersion: String,
        id: Long
    ): CustomLesson
    fun getByGroupId(@Header("User-Token") accessToken: String, @Header("Client-Token") clientToken: String, @Header("Client-Version") clientVersion: String, id: Long): List<CustomLesson>
    fun create(
        @Header("User-Token") accessToken: String,
        @Header("Client-Token") clientToken: String,
        @Header("Client-Version") clientVersion: String,
        data: CustomLesson
    ): CustomLesson
    fun edit(
        @Header("User-Token") accessToken: String,
        @Header("Client-Token") clientToken: String,
        @Header("Client-Version") clientVersion: String,
        data: CustomLesson,
        editedFields: Set<String>
    ): CustomLesson
    fun delete(
        @Header("User-Token") accessToken: String,
        @Header("Client-Token") clientToken: String,
        @Header("Client-Version") clientVersion: String,
        id: Long
    )

}