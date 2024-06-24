package com.studentschedulleapp.androidclient.data.repos.http

import com.studentschedulleapp.androidclient.data.api.retrofit.GatewayRetrofitClient
import com.studentschedulleapp.androidclient.data.api.retrofit.services.UserRetrofitService
import com.studentschedulleapp.androidclient.domain.exceptions.ExternalAppException
import com.studentschedulleapp.androidclient.domain.exceptions.InternalAppException
import com.studentschedulleapp.androidclient.domain.exceptions.UserUnAuthorizedException
import com.studentschedulleapp.androidclient.domain.models.User
import com.studentschedulleapp.androidclient.domain.repos.UserRepository

class UserRepositoryImpl : UserRepository {
    override fun getById(accessToken: String, id: Long): User {
        val response = GatewayRetrofitClient.getInstance().create(UserRetrofitService::class.java).getById(accessToken, "CLIENT_TOKEN", "CLIENT_VERSION", id.toString()).execute()
        if(response.isSuccessful){
            val body = response.body()
            if (!body.isNullOrEmpty()){
                return body[0]
            }
            else
                throw ExternalAppException("'user getById' response body is null")
        }
        else {
            if (response.code() in 500..599)
                throw ExternalAppException("'user getById' request error code: ${response.code()}")
            else if (response.code() == 401)
                throw UserUnAuthorizedException("'user getById' request error code: ${response.code()} (unauthorized)")
            else if (response.code() == 403)
                throw UserUnAuthorizedException("'user getById' request error code: ${response.code()} (forbidden)")
            else
                throw InternalAppException("'user getById' request error code: ${response.code()}")
        }
    }

    override fun getByEmail(accessToken: String, email: String): User {
        val response = GatewayRetrofitClient.getInstance().create(UserRetrofitService::class.java).getById(accessToken, "CLIENT_TOKEN", "CLIENT_VERSION", email).execute()
        if(response.isSuccessful){
            val body = response.body()
            if (!body.isNullOrEmpty()){
                return body[0]
            }
            else
                throw ExternalAppException("'user getById' response body is null")
        }
        else {
            if (response.code() in 500..599)
                throw ExternalAppException("'user getById' request error code: ${response.code()}")
            else if (response.code() == 401)
                throw UserUnAuthorizedException("'user getById' request error code: ${response.code()} (unauthorized)")
            else if (response.code() == 403)
                throw UserUnAuthorizedException("'user getById' request error code: ${response.code()} (forbidden)")
            else
                throw InternalAppException("'user getById' request error code: ${response.code()}")
        }
    }

    override fun edit(accessToken: String, data: User, editedFields: Set<String>): User {
        var fields = ""
        for (field in editedFields){
            fields += field + ","
        }
        fields = fields.substring(0, fields.length - 2)
        val response = GatewayRetrofitClient.getInstance().create(UserRetrofitService::class.java).edit(accessToken, "CLIENT_TOKEN", "CLIENT_VERSION", data, fields).execute()
        if(response.isSuccessful){
            val body = response.body()
            if (body != null){
                return body
            }
            else
                throw ExternalAppException("'user edit' response body is null")
        }
        else {
            if (response.code() in 500..599)
                throw ExternalAppException("'user edit' request error code: ${response.code()}")
            else if (response.code() == 401)
                throw UserUnAuthorizedException("'user edit' request error code: ${response.code()} (unauthorized)")
            else if (response.code() == 403)
                throw UserUnAuthorizedException("'user edit' request error code: ${response.code()} (forbidden)")
            else
                throw InternalAppException("'user edit' request error code: ${response.code()}")
        }
    }
}