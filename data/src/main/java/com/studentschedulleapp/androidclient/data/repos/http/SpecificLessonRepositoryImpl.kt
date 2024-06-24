package com.studentschedulleapp.androidclient.data.repos.http

import com.studentschedulleapp.androidclient.data.api.retrofit.GatewayRetrofitClient
import com.studentschedulleapp.androidclient.data.api.retrofit.services.SpecificLessonRetrofitService
import com.studentschedulleapp.androidclient.domain.exceptions.ExternalAppException
import com.studentschedulleapp.androidclient.domain.exceptions.InternalAppException
import com.studentschedulleapp.androidclient.domain.exceptions.UserUnAuthorizedException
import com.studentschedulleapp.androidclient.domain.models.SpecificLesson
import com.studentschedulleapp.androidclient.domain.repos.SpecificLessonRepository

class SpecificLessonRepositoryImpl : SpecificLessonRepository {
    override fun getById(accessToken: String, id: Long): SpecificLesson {
        val response = GatewayRetrofitClient.getInstance().create(SpecificLessonRetrofitService::class.java).getById(accessToken, "CLIENT_TOKEN", "CLIENT_VERSION", id.toString()).execute()
        if(response.isSuccessful){
            val body = response.body()
            if (!body.isNullOrEmpty()){
                return body[0]
            }
            else
                throw ExternalAppException("'specificLesson getById' response body is null")
        }
        else {
            if (response.code() in 500..599)
                throw ExternalAppException("'specificLesson getById' request error code: ${response.code()}")
            else if (response.code() == 401)
                throw UserUnAuthorizedException("'specificLesson getById' request error code: ${response.code()} (unauthorized)")
            else if (response.code() == 403)
                throw UserUnAuthorizedException("'specificLesson getById' request error code: ${response.code()} (forbidden)")
            else
                throw InternalAppException("'specificLesson getById' request error code: ${response.code()}")
        }
    }

    override fun getByGroupId(accessToken: String, id: Long): List<SpecificLesson> {
        val response = GatewayRetrofitClient.getInstance().create(SpecificLessonRetrofitService::class.java).getByGroupId(accessToken, "CLIENT_TOKEN", "CLIENT_VERSION", id).execute()
        if(response.isSuccessful){
            val body = response.body()
            if (body != null){
                return body
            }
            else
                throw ExternalAppException("'specificLesson getByGroupId' response body is null")
        }
        else {
            if (response.code() in 500..599)
                throw ExternalAppException("'specificLesson getByGroupId' request error code: ${response.code()}")
            else if (response.code() == 401)
                throw UserUnAuthorizedException("'specificLesson getByGroupId' request error code: ${response.code()} (unauthorized)")
            else if (response.code() == 403)
                throw UserUnAuthorizedException("'specificLesson getByGroupId' request error code: ${response.code()} (forbidden)")
            else
                throw InternalAppException("'specificLesson getByGroupId' request error code: ${response.code()}")
        }
    }

    override fun create(accessToken: String, data: SpecificLesson): SpecificLesson {
        val response = GatewayRetrofitClient.getInstance().create(SpecificLessonRetrofitService::class.java).create(accessToken, "CLIENT_TOKEN", "CLIENT_VERSION", data).execute()
        if(response.isSuccessful){
            val body = response.body()
            if (body != null){
                return body
            }
            else
                throw ExternalAppException("'specificLesson create' response body is null")
        }
        else {
            if (response.code() in 500..599)
                throw ExternalAppException("'specificLesson create' request error code: ${response.code()}")
            else if (response.code() == 401)
                throw UserUnAuthorizedException("'specificLesson create' request error code: ${response.code()} (unauthorized)")
            else if (response.code() == 403)
                throw UserUnAuthorizedException("'specificLesson create' request error code: ${response.code()} (forbidden)")
            else
                throw InternalAppException("'specificLesson create' request error code: ${response.code()}")
        }
    }

    override fun edit(accessToken: String, data: SpecificLesson, editedFields: Set<String>): SpecificLesson {
        var fields = ""
        for (field in editedFields){
            fields += field + ","
        }
        fields = fields.substring(0, fields.length - 2)
        val response = GatewayRetrofitClient.getInstance().create(SpecificLessonRetrofitService::class.java).edit(accessToken, "CLIENT_TOKEN", "CLIENT_VERSION", data, fields).execute()
        if(response.isSuccessful){
            val body = response.body()
            if (body != null){
                return body
            }
            else
                throw ExternalAppException("'specificLesson edit' response body is null")
        }
        else {
            if (response.code() in 500..599)
                throw ExternalAppException("'specificLesson edit' request error code: ${response.code()}")
            else if (response.code() == 401)
                throw UserUnAuthorizedException("'specificLesson edit' request error code: ${response.code()} (unauthorized)")
            else if (response.code() == 403)
                throw UserUnAuthorizedException("'specificLesson edit' request error code: ${response.code()} (forbidden)")
            else
                throw InternalAppException("'specificLesson edit' request error code: ${response.code()}")
        }
    }

    override fun delete(accessToken: String, id: Long) {
        val response = GatewayRetrofitClient.getInstance().create(SpecificLessonRetrofitService::class.java).delete(accessToken, "CLIENT_TOKEN", "CLIENT_VERSION", id.toString()).execute()
        if(response.isSuccessful){
            return
        }
        else {
            if (response.code() in 500..599)
                throw ExternalAppException("'specificLesson delete' request error code: ${response.code()}")
            else if (response.code() == 401)
                throw UserUnAuthorizedException("'specificLesson delete' request error code: ${response.code()} (unauthorized)")
            else if (response.code() == 403)
                throw UserUnAuthorizedException("'specificLesson delete' request error code: ${response.code()} (forbidden)")
            else
                throw InternalAppException("'specificLesson delete' request error code: ${response.code()}")
        }
    }
}