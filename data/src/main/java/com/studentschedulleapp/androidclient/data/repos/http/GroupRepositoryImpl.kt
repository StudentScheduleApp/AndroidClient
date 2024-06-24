package com.studentschedulleapp.androidclient.data.repos.http

import com.studentschedulleapp.androidclient.data.api.retrofit.GatewayRetrofitClient
import com.studentschedulleapp.androidclient.data.api.retrofit.services.GroupRetrofitService
import com.studentschedulleapp.androidclient.domain.exceptions.ExternalAppException
import com.studentschedulleapp.androidclient.domain.exceptions.InternalAppException
import com.studentschedulleapp.androidclient.domain.exceptions.UserUnAuthorizedException
import com.studentschedulleapp.androidclient.domain.models.Group
import com.studentschedulleapp.androidclient.domain.repos.GroupRepository

class GroupRepositoryImpl : GroupRepository {
    override fun getById(accessToken: String, id: Long): Group {
        val response = GatewayRetrofitClient.getInstance().create(GroupRetrofitService::class.java).getById(accessToken, "CLIENT_TOKEN", "CLIENT_VERSION", id.toString()).execute()
        if(response.isSuccessful){
            val body = response.body()
            if (!body.isNullOrEmpty()){
                return body[0]
            }
            else
                throw ExternalAppException("'group getById' response body is null")
        }
        else {
            if (response.code() in 500..599)
                throw ExternalAppException("'group getById' request error code: ${response.code()}")
            else if (response.code() == 401)
                throw UserUnAuthorizedException("'group getById' request error code: ${response.code()} (unauthorized)")
            else if (response.code() == 403)
                throw UserUnAuthorizedException("'group getById' request error code: ${response.code()} (forbidden)")
            else
                throw InternalAppException("'group getById' request error code: ${response.code()}")
        }
    }

    override fun create(accessToken: String, data: Group): Group {
        val response = GatewayRetrofitClient.getInstance().create(GroupRetrofitService::class.java).create(accessToken, "CLIENT_TOKEN", "CLIENT_VERSION", data).execute()
        if(response.isSuccessful){
            val body = response.body()
            if (body != null){
                return body
            }
            else
                throw ExternalAppException("'group create' response body is null")
        }
        else {
            if (response.code() in 500..599)
                throw ExternalAppException("'group create' request error code: ${response.code()}")
            else if (response.code() == 401)
                throw UserUnAuthorizedException("'group create' request error code: ${response.code()} (unauthorized)")
            else if (response.code() == 403)
                throw UserUnAuthorizedException("'group create' request error code: ${response.code()} (forbidden)")
            else
                throw InternalAppException("'group create' request error code: ${response.code()}")
        }
    }

    override fun edit(accessToken: String, data: Group, editedFields: Set<String>): Group {
        var fields = ""
        for (field in editedFields){
            fields += field + ","
        }
        fields = fields.substring(0, fields.length - 2)
        val response = GatewayRetrofitClient.getInstance().create(GroupRetrofitService::class.java).edit(accessToken, "CLIENT_TOKEN", "CLIENT_VERSION", data, fields).execute()
        if(response.isSuccessful){
            val body = response.body()
            if (body != null){
                return body
            }
            else
                throw ExternalAppException("'group edit' response body is null")
        }
        else {
            if (response.code() in 500..599)
                throw ExternalAppException("'group edit' request error code: ${response.code()}")
            else if (response.code() == 401)
                throw UserUnAuthorizedException("'group edit' request error code: ${response.code()} (unauthorized)")
            else if (response.code() == 403)
                throw UserUnAuthorizedException("'group edit' request error code: ${response.code()} (forbidden)")
            else
                throw InternalAppException("'group edit' request error code: ${response.code()}")
        }
    }

    override fun delete(accessToken: String, id: Long) {
        val response = GatewayRetrofitClient.getInstance().create(GroupRetrofitService::class.java).delete(accessToken, "CLIENT_TOKEN", "CLIENT_VERSION", id.toString()).execute()
        if(response.isSuccessful){
            return
        }
        else {
            if (response.code() in 500..599)
                throw ExternalAppException("'group delete' request error code: ${response.code()}")
            else if (response.code() == 401)
                throw UserUnAuthorizedException("'group delete' request error code: ${response.code()} (unauthorized)")
            else if (response.code() == 403)
                throw UserUnAuthorizedException("'group delete' request error code: ${response.code()} (forbidden)")
            else
                throw InternalAppException("'group delete' request error code: ${response.code()}")
        }
    }
}