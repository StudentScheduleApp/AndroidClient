package com.studentschedulleapp.androidclient.data.repos.http

import com.studentschedulleapp.androidclient.data.api.retrofit.GatewayRetrofitClient
import com.studentschedulleapp.androidclient.data.api.retrofit.services.OutlineRetrofitService
import com.studentschedulleapp.androidclient.domain.exceptions.ExternalAppException
import com.studentschedulleapp.androidclient.domain.exceptions.InternalAppException
import com.studentschedulleapp.androidclient.domain.exceptions.UserUnAuthorizedException
import com.studentschedulleapp.androidclient.domain.models.Outline
import com.studentschedulleapp.androidclient.domain.repos.OutlineRepository

class OutlineRepositoryImpl : OutlineRepository {
    override fun getById(accessToken: String, id: Long): Outline {
        val response = GatewayRetrofitClient.getInstance().create(OutlineRetrofitService::class.java).getById(accessToken, "CLIENT_TOKEN", "CLIENT_VERSION", id.toString()).execute()
        if(response.isSuccessful){
            val body = response.body()
            if (!body.isNullOrEmpty()){
                return body[0]
            }
            else
                throw ExternalAppException("'outline getById' response body is null")
        }
        else {
            if (response.code() in 500..599)
                throw ExternalAppException("'outline getById' request error code: ${response.code()}")
            else if (response.code() == 401)
                throw UserUnAuthorizedException("'outline getById' request error code: ${response.code()} (unauthorized)")
            else if (response.code() == 403)
                throw UserUnAuthorizedException("'outline getById' request error code: ${response.code()} (forbidden)")
            else
                throw InternalAppException("'outline getById' request error code: ${response.code()}")
        }
    }

    override fun getBySpecificLessonId(accessToken: String, id: Long): List<Outline> {
        val response = GatewayRetrofitClient.getInstance().create(OutlineRetrofitService::class.java).getBySpecificLessonId(accessToken, "CLIENT_TOKEN", "CLIENT_VERSION", id).execute()
        if(response.isSuccessful){
            val body = response.body()
            if (body != null){
                return body
            }
            else
                throw ExternalAppException("'outline getByGroupId' response body is null")
        }
        else {
            if (response.code() in 500..599)
                throw ExternalAppException("'outline getByGroupId' request error code: ${response.code()}")
            else if (response.code() == 401)
                throw UserUnAuthorizedException("'outline getByGroupId' request error code: ${response.code()} (unauthorized)")
            else if (response.code() == 403)
                throw UserUnAuthorizedException("'outline getByGroupId' request error code: ${response.code()} (forbidden)")
            else
                throw InternalAppException("'outline getByGroupId' request error code: ${response.code()}")
        }
    }

    override fun getByUserId(accessToken: String, id: Long): List<Outline> {
        val response = GatewayRetrofitClient.getInstance().create(OutlineRetrofitService::class.java).getByUserId(accessToken, "CLIENT_TOKEN", "CLIENT_VERSION", id).execute()
        if(response.isSuccessful){
            val body = response.body()
            if (body != null){
                return body
            }
            else
                throw ExternalAppException("'outline getByGroupId' response body is null")
        }
        else {
            if (response.code() in 500..599)
                throw ExternalAppException("'outline getByGroupId' request error code: ${response.code()}")
            else if (response.code() == 401)
                throw UserUnAuthorizedException("'outline getByGroupId' request error code: ${response.code()} (unauthorized)")
            else if (response.code() == 403)
                throw UserUnAuthorizedException("'outline getByGroupId' request error code: ${response.code()} (forbidden)")
            else
                throw InternalAppException("'outline getByGroupId' request error code: ${response.code()}")
        }
    }

    override fun create(accessToken: String, data: Outline): Outline {
        val response = GatewayRetrofitClient.getInstance().create(OutlineRetrofitService::class.java).create(accessToken, "CLIENT_TOKEN", "CLIENT_VERSION", data).execute()
        if(response.isSuccessful){
            val body = response.body()
            if (body != null){
                return body
            }
            else
                throw ExternalAppException("'outline create' response body is null")
        }
        else {
            if (response.code() in 500..599)
                throw ExternalAppException("'outline create' request error code: ${response.code()}")
            else if (response.code() == 401)
                throw UserUnAuthorizedException("'outline create' request error code: ${response.code()} (unauthorized)")
            else if (response.code() == 403)
                throw UserUnAuthorizedException("'outline create' request error code: ${response.code()} (forbidden)")
            else
                throw InternalAppException("'outline create' request error code: ${response.code()}")
        }
    }

    override fun edit(accessToken: String, data: Outline, editedFields: Set<String>): Outline {
        var fields = ""
        for (field in editedFields){
            fields += field + ","
        }
        fields = fields.substring(0, fields.length - 2)
        val response = GatewayRetrofitClient.getInstance().create(OutlineRetrofitService::class.java).edit(accessToken, "CLIENT_TOKEN", "CLIENT_VERSION", data, fields).execute()
        if(response.isSuccessful){
            val body = response.body()
            if (body != null){
                return body
            }
            else
                throw ExternalAppException("'outline edit' response body is null")
        }
        else {
            if (response.code() in 500..599)
                throw ExternalAppException("'outline edit' request error code: ${response.code()}")
            else if (response.code() == 401)
                throw UserUnAuthorizedException("'outline edit' request error code: ${response.code()} (unauthorized)")
            else if (response.code() == 403)
                throw UserUnAuthorizedException("'outline edit' request error code: ${response.code()} (forbidden)")
            else
                throw InternalAppException("'outline edit' request error code: ${response.code()}")
        }
    }

    override fun delete(accessToken: String, id: Long) {
        val response = GatewayRetrofitClient.getInstance().create(OutlineRetrofitService::class.java).delete(accessToken, "CLIENT_TOKEN", "CLIENT_VERSION", id.toString()).execute()
        if(response.isSuccessful){
            return
        }
        else {
            if (response.code() in 500..599)
                throw ExternalAppException("'outline delete' request error code: ${response.code()}")
            else if (response.code() == 401)
                throw UserUnAuthorizedException("'outline delete' request error code: ${response.code()} (unauthorized)")
            else if (response.code() == 403)
                throw UserUnAuthorizedException("'outline delete' request error code: ${response.code()} (forbidden)")
            else
                throw InternalAppException("'outline delete' request error code: ${response.code()}")
        }
    }
}