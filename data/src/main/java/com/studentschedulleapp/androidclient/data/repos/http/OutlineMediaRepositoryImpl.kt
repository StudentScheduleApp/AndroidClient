package com.studentschedulleapp.androidclient.data.repos.http

import com.studentschedulleapp.androidclient.data.api.retrofit.GatewayRetrofitClient
import com.studentschedulleapp.androidclient.data.api.retrofit.services.OutlineMediaRetrofitService
import com.studentschedulleapp.androidclient.domain.exceptions.ExternalAppException
import com.studentschedulleapp.androidclient.domain.exceptions.InternalAppException
import com.studentschedulleapp.androidclient.domain.exceptions.UserUnAuthorizedException
import com.studentschedulleapp.androidclient.domain.models.OutlineMedia
import com.studentschedulleapp.androidclient.domain.repos.OutlineMediaRepository

class OutlineMediaRepositoryImpl : OutlineMediaRepository {
    override fun getById(accessToken: String, id: Long): OutlineMedia {
        val response = GatewayRetrofitClient.getInstance().create(OutlineMediaRetrofitService::class.java).getById(accessToken, "CLIENT_TOKEN", "CLIENT_VERSION", id.toString()).execute()
        if(response.isSuccessful){
            val body = response.body()
            if (!body.isNullOrEmpty()){
                return body[0]
            }
            else
                throw ExternalAppException("'outlineMedia getById' response body is null")
        }
        else {
            if (response.code() in 500..599)
                throw ExternalAppException("'outlineMedia getById' request error code: ${response.code()}")
            else if (response.code() == 401)
                throw UserUnAuthorizedException("'outlineMedia getById' request error code: ${response.code()} (unauthorized)")
            else if (response.code() == 403)
                throw UserUnAuthorizedException("'outlineMedia getById' request error code: ${response.code()} (forbidden)")
            else
                throw InternalAppException("'outlineMedia getById' request error code: ${response.code()}")
        }
    }

    override fun getByOutlineId(accessToken: String, id: Long): List<OutlineMedia> {
        val response = GatewayRetrofitClient.getInstance().create(OutlineMediaRetrofitService::class.java).getByOutlineId(accessToken, "CLIENT_TOKEN", "CLIENT_VERSION", id).execute()
        if(response.isSuccessful){
            val body = response.body()
            if (body != null){
                return body
            }
            else
                throw ExternalAppException("'outlineMedia getByGroupId' response body is null")
        }
        else {
            if (response.code() in 500..599)
                throw ExternalAppException("'outlineMedia getByGroupId' request error code: ${response.code()}")
            else if (response.code() == 401)
                throw UserUnAuthorizedException("'outlineMedia getByGroupId' request error code: ${response.code()} (unauthorized)")
            else if (response.code() == 403)
                throw UserUnAuthorizedException("'outlineMedia getByGroupId' request error code: ${response.code()} (forbidden)")
            else
                throw InternalAppException("'outlineMedia getByGroupId' request error code: ${response.code()}")
        }
    }

    override fun create(accessToken: String, data: OutlineMedia): OutlineMedia {
        val response = GatewayRetrofitClient.getInstance().create(OutlineMediaRetrofitService::class.java).create(accessToken, "CLIENT_TOKEN", "CLIENT_VERSION", data).execute()
        if(response.isSuccessful){
            val body = response.body()
            if (body != null){
                return body
            }
            else
                throw ExternalAppException("'outlineMedia create' response body is null")
        }
        else {
            if (response.code() in 500..599)
                throw ExternalAppException("'outlineMedia create' request error code: ${response.code()}")
            else if (response.code() == 401)
                throw UserUnAuthorizedException("'outlineMedia create' request error code: ${response.code()} (unauthorized)")
            else if (response.code() == 403)
                throw UserUnAuthorizedException("'outlineMedia create' request error code: ${response.code()} (forbidden)")
            else
                throw InternalAppException("'outlineMedia create' request error code: ${response.code()}")
        }
    }

    override fun edit(accessToken: String, data: OutlineMedia, editedFields: Set<String>): OutlineMedia {
        var fields = ""
        for (field in editedFields){
            fields += field + ","
        }
        fields = fields.substring(0, fields.length - 2)
        val response = GatewayRetrofitClient.getInstance().create(OutlineMediaRetrofitService::class.java).edit(accessToken, "CLIENT_TOKEN", "CLIENT_VERSION", data, fields).execute()
        if(response.isSuccessful){
            val body = response.body()
            if (body != null){
                return body
            }
            else
                throw ExternalAppException("'outlineMedia edit' response body is null")
        }
        else {
            if (response.code() in 500..599)
                throw ExternalAppException("'outlineMedia edit' request error code: ${response.code()}")
            else if (response.code() == 401)
                throw UserUnAuthorizedException("'outlineMedia edit' request error code: ${response.code()} (unauthorized)")
            else if (response.code() == 403)
                throw UserUnAuthorizedException("'outlineMedia edit' request error code: ${response.code()} (forbidden)")
            else
                throw InternalAppException("'outlineMedia edit' request error code: ${response.code()}")
        }
    }

    override fun delete(accessToken: String, id: Long) {
        val response = GatewayRetrofitClient.getInstance().create(OutlineMediaRetrofitService::class.java).delete(accessToken, "CLIENT_TOKEN", "CLIENT_VERSION", id.toString()).execute()
        if(response.isSuccessful){
            return
        }
        else {
            if (response.code() in 500..599)
                throw ExternalAppException("'outlineMedia delete' request error code: ${response.code()}")
            else if (response.code() == 401)
                throw UserUnAuthorizedException("'outlineMedia delete' request error code: ${response.code()} (unauthorized)")
            else if (response.code() == 403)
                throw UserUnAuthorizedException("'outlineMedia delete' request error code: ${response.code()} (forbidden)")
            else
                throw InternalAppException("'outlineMedia delete' request error code: ${response.code()}")
        }
    }
}