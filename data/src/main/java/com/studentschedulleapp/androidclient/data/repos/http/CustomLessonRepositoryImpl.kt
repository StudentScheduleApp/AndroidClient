package com.studentschedulleapp.androidclient.data.repos.http

import com.studentschedulleapp.androidclient.data.api.models.JwtLoginRequest
import com.studentschedulleapp.androidclient.data.api.retrofit.GatewayRetrofitClient
import com.studentschedulleapp.androidclient.data.api.retrofit.services.AuthorizeRetrofitService
import com.studentschedulleapp.androidclient.data.api.retrofit.services.CustomLessonRetrofitService
import com.studentschedulleapp.androidclient.domain.exceptions.ExternalAppException
import com.studentschedulleapp.androidclient.domain.exceptions.InternalAppException
import com.studentschedulleapp.androidclient.domain.exceptions.UserUnAuthorizedException
import com.studentschedulleapp.androidclient.domain.models.CustomLesson
import com.studentschedulleapp.androidclient.domain.models.tokens.Token
import com.studentschedulleapp.androidclient.domain.models.tokens.TokenType
import com.studentschedulleapp.androidclient.domain.models.tokens.UserTokens
import com.studentschedulleapp.androidclient.domain.repos.CustomLessonRepository

class CustomLessonRepositoryImpl : CustomLessonRepository {
    override fun getById(accessToken: String, id: Long): CustomLesson {
        val response = GatewayRetrofitClient.getInstance().create(CustomLessonRetrofitService::class.java).getById(accessToken, "CLIENT_TOKEN", "CLIENT_VERSION", id.toString()).execute()
        if(response.isSuccessful){
            val body = response.body()
            if (!body.isNullOrEmpty()){
                return body[0]
            }
            else
                throw ExternalAppException("'customLesson getById' response body is null")
        }
        else {
            if (response.code() in 500..599)
                throw ExternalAppException("'customLesson getById' request error code: ${response.code()}")
            else if (response.code() == 401)
                throw UserUnAuthorizedException("'customLesson getById' request error code: ${response.code()} (unauthorized)")
            else if (response.code() == 403)
                throw UserUnAuthorizedException("'customLesson getById' request error code: ${response.code()} (forbidden)")
            else
                throw InternalAppException("'customLesson getById' request error code: ${response.code()}")
        }
    }

    override fun getByGroupId(accessToken: String, id: Long): List<CustomLesson> {
        val response = GatewayRetrofitClient.getInstance().create(CustomLessonRetrofitService::class.java).getByGroupId(accessToken, "CLIENT_TOKEN", "CLIENT_VERSION", id).execute()
        if(response.isSuccessful){
            val body = response.body()
            if (body != null){
                return body
            }
            else
                throw ExternalAppException("'customLesson getByGroupId' response body is null")
        }
        else {
            if (response.code() in 500..599)
                throw ExternalAppException("'customLesson getByGroupId' request error code: ${response.code()}")
            else if (response.code() == 401)
                throw UserUnAuthorizedException("'customLesson getByGroupId' request error code: ${response.code()} (unauthorized)")
            else if (response.code() == 403)
                throw UserUnAuthorizedException("'customLesson getByGroupId' request error code: ${response.code()} (forbidden)")
            else
                throw InternalAppException("'customLesson getByGroupId' request error code: ${response.code()}")
        }
    }

    override fun create(accessToken: String, data: CustomLesson): CustomLesson {
        val response = GatewayRetrofitClient.getInstance().create(CustomLessonRetrofitService::class.java).create(accessToken, "CLIENT_TOKEN", "CLIENT_VERSION", data).execute()
        if(response.isSuccessful){
            val body = response.body()
            if (body != null){
                return body
            }
            else
                throw ExternalAppException("'customLesson create' response body is null")
        }
        else {
            if (response.code() in 500..599)
                throw ExternalAppException("'customLesson create' request error code: ${response.code()}")
            else if (response.code() == 401)
                throw UserUnAuthorizedException("'customLesson create' request error code: ${response.code()} (unauthorized)")
            else if (response.code() == 403)
                throw UserUnAuthorizedException("'customLesson create' request error code: ${response.code()} (forbidden)")
            else
                throw InternalAppException("'customLesson create' request error code: ${response.code()}")
        }
    }

    override fun edit(accessToken: String, data: CustomLesson, editedFields: Set<String>): CustomLesson {
        var fields = ""
        for (field in editedFields){
            fields += field + ","
        }
        fields = fields.substring(0, fields.length - 2)
        val response = GatewayRetrofitClient.getInstance().create(CustomLessonRetrofitService::class.java).edit(accessToken, "CLIENT_TOKEN", "CLIENT_VERSION", data, fields).execute()
        if(response.isSuccessful){
            val body = response.body()
            if (body != null){
                return body
            }
            else
                throw ExternalAppException("'customLesson edit' response body is null")
        }
        else {
            if (response.code() in 500..599)
                throw ExternalAppException("'customLesson edit' request error code: ${response.code()}")
            else if (response.code() == 401)
                throw UserUnAuthorizedException("'customLesson edit' request error code: ${response.code()} (unauthorized)")
            else if (response.code() == 403)
                throw UserUnAuthorizedException("'customLesson edit' request error code: ${response.code()} (forbidden)")
            else
                throw InternalAppException("'customLesson edit' request error code: ${response.code()}")
        }
    }

    override fun delete(accessToken: String, id: Long) {
        val response = GatewayRetrofitClient.getInstance().create(CustomLessonRetrofitService::class.java).delete(accessToken, "CLIENT_TOKEN", "CLIENT_VERSION", id.toString()).execute()
        if(response.isSuccessful){
            return
        }
        else {
            if (response.code() in 500..599)
                throw ExternalAppException("'customLesson delete' request error code: ${response.code()}")
            else if (response.code() == 401)
                throw UserUnAuthorizedException("'customLesson delete' request error code: ${response.code()} (unauthorized)")
            else if (response.code() == 403)
                throw UserUnAuthorizedException("'customLesson delete' request error code: ${response.code()} (forbidden)")
            else
                throw InternalAppException("'customLesson delete' request error code: ${response.code()}")
        }
    }
}