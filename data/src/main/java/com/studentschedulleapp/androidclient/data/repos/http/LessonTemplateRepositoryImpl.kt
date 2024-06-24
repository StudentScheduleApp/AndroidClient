package com.studentschedulleapp.androidclient.data.repos.http

import com.studentschedulleapp.androidclient.data.api.retrofit.GatewayRetrofitClient
import com.studentschedulleapp.androidclient.data.api.retrofit.services.CustomLessonRetrofitService
import com.studentschedulleapp.androidclient.data.api.retrofit.services.LessonTemplateRetrofitService
import com.studentschedulleapp.androidclient.domain.exceptions.ExternalAppException
import com.studentschedulleapp.androidclient.domain.exceptions.InternalAppException
import com.studentschedulleapp.androidclient.domain.exceptions.UserUnAuthorizedException
import com.studentschedulleapp.androidclient.domain.models.LessonTemplate
import com.studentschedulleapp.androidclient.domain.repos.LessonTemplateRepository

class LessonTemplateRepositoryImpl : LessonTemplateRepository {
    override fun getById(accessToken: String, id: Long): LessonTemplate {
        val response = GatewayRetrofitClient.getInstance().create(LessonTemplateRetrofitService::class.java).getById(accessToken, "CLIENT_TOKEN", "CLIENT_VERSION", id.toString()).execute()
        if(response.isSuccessful){
            val body = response.body()
            if (!body.isNullOrEmpty()){
                return body[0]
            }
            else
                throw ExternalAppException("'lessonTemplate getById' response body is null")
        }
        else {
            if (response.code() in 500..599)
                throw ExternalAppException("'lessonTemplate getById' request error code: ${response.code()}")
            else if (response.code() == 401)
                throw UserUnAuthorizedException("'lessonTemplate getById' request error code: ${response.code()} (unauthorized)")
            else if (response.code() == 403)
                throw UserUnAuthorizedException("'lessonTemplate getById' request error code: ${response.code()} (forbidden)")
            else
                throw InternalAppException("'lessonTemplate getById' request error code: ${response.code()}")
        }
    }

    override fun getByScheduleTemplateId(accessToken: String, id: Long): List<LessonTemplate> {
        val response = GatewayRetrofitClient.getInstance().create(LessonTemplateRetrofitService::class.java).getByScheduleTemplateId(accessToken, "CLIENT_TOKEN", "CLIENT_VERSION", id).execute()
        if(response.isSuccessful){
            val body = response.body()
            if (body != null){
                return body
            }
            else
                throw ExternalAppException("'lessonTemplate getByGroupId' response body is null")
        }
        else {
            if (response.code() in 500..599)
                throw ExternalAppException("'lessonTemplate getByGroupId' request error code: ${response.code()}")
            else if (response.code() == 401)
                throw UserUnAuthorizedException("'lessonTemplate getByGroupId' request error code: ${response.code()} (unauthorized)")
            else if (response.code() == 403)
                throw UserUnAuthorizedException("'lessonTemplate getByGroupId' request error code: ${response.code()} (forbidden)")
            else
                throw InternalAppException("'lessonTemplate getByGroupId' request error code: ${response.code()}")
        }
    }

    override fun create(accessToken: String, data: LessonTemplate): LessonTemplate {
        val response = GatewayRetrofitClient.getInstance().create(LessonTemplateRetrofitService::class.java).create(accessToken, "CLIENT_TOKEN", "CLIENT_VERSION", data).execute()
        if(response.isSuccessful){
            val body = response.body()
            if (body != null){
                return body
            }
            else
                throw ExternalAppException("'lessonTemplate create' response body is null")
        }
        else {
            if (response.code() in 500..599)
                throw ExternalAppException("'lessonTemplate create' request error code: ${response.code()}")
            else if (response.code() == 401)
                throw UserUnAuthorizedException("'lessonTemplate create' request error code: ${response.code()} (unauthorized)")
            else if (response.code() == 403)
                throw UserUnAuthorizedException("'lessonTemplate create' request error code: ${response.code()} (forbidden)")
            else
                throw InternalAppException("'lessonTemplate create' request error code: ${response.code()}")
        }
    }

    override fun edit(accessToken: String, data: LessonTemplate, editedFields: Set<String>): LessonTemplate {
        var fields = ""
        for (field in editedFields){
            fields += field + ","
        }
        fields = fields.substring(0, fields.length - 2)
        val response = GatewayRetrofitClient.getInstance().create(LessonTemplateRetrofitService::class.java).edit(accessToken, "CLIENT_TOKEN", "CLIENT_VERSION", data, fields).execute()
        if(response.isSuccessful){
            val body = response.body()
            if (body != null){
                return body
            }
            else
                throw ExternalAppException("'lessonTemplate edit' response body is null")
        }
        else {
            if (response.code() in 500..599)
                throw ExternalAppException("'lessonTemplate edit' request error code: ${response.code()}")
            else if (response.code() == 401)
                throw UserUnAuthorizedException("'lessonTemplate edit' request error code: ${response.code()} (unauthorized)")
            else if (response.code() == 403)
                throw UserUnAuthorizedException("'lessonTemplate edit' request error code: ${response.code()} (forbidden)")
            else
                throw InternalAppException("'lessonTemplate edit' request error code: ${response.code()}")
        }
    }

    override fun delete(accessToken: String, id: Long) {
        val response = GatewayRetrofitClient.getInstance().create(LessonTemplateRetrofitService::class.java).delete(accessToken, "CLIENT_TOKEN", "CLIENT_VERSION", id.toString()).execute()
        if(response.isSuccessful){
            return
        }
        else {
            if (response.code() in 500..599)
                throw ExternalAppException("'lessonTemplate delete' request error code: ${response.code()}")
            else if (response.code() == 401)
                throw UserUnAuthorizedException("'lessonTemplate delete' request error code: ${response.code()} (unauthorized)")
            else if (response.code() == 403)
                throw UserUnAuthorizedException("'lessonTemplate delete' request error code: ${response.code()} (forbidden)")
            else
                throw InternalAppException("'lessonTemplate delete' request error code: ${response.code()}")
        }
    }
}