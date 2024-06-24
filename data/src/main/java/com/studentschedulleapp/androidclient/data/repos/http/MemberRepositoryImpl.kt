package com.studentschedulleapp.androidclient.data.repos.http

import com.studentschedulleapp.androidclient.data.api.retrofit.GatewayRetrofitClient
import com.studentschedulleapp.androidclient.data.api.retrofit.services.MemberRetrofitService
import com.studentschedulleapp.androidclient.domain.exceptions.ExternalAppException
import com.studentschedulleapp.androidclient.domain.exceptions.InternalAppException
import com.studentschedulleapp.androidclient.domain.exceptions.UserUnAuthorizedException
import com.studentschedulleapp.androidclient.domain.models.Member
import com.studentschedulleapp.androidclient.domain.repos.MemberRepository

class MemberRepositoryImpl : MemberRepository {
    override fun getById(accessToken: String, id: Long): Member {
        val response = GatewayRetrofitClient.getInstance().create(MemberRetrofitService::class.java).getById(accessToken, "CLIENT_TOKEN", "CLIENT_VERSION", id.toString()).execute()
        if(response.isSuccessful){
            val body = response.body()
            if (!body.isNullOrEmpty()){
                return body[0]
            }
            else
                throw ExternalAppException("'member getById' response body is null")
        }
        else {
            if (response.code() in 500..599)
                throw ExternalAppException("'member getById' request error code: ${response.code()}")
            else if (response.code() == 401)
                throw UserUnAuthorizedException("'member getById' request error code: ${response.code()} (unauthorized)")
            else if (response.code() == 403)
                throw UserUnAuthorizedException("'member getById' request error code: ${response.code()} (forbidden)")
            else
                throw InternalAppException("'member getById' request error code: ${response.code()}")
        }
    }

    override fun getByGroupId(accessToken: String, id: Long): List<Member> {
        val response = GatewayRetrofitClient.getInstance().create(MemberRetrofitService::class.java).getByGroupId(accessToken, "CLIENT_TOKEN", "CLIENT_VERSION", id).execute()
        if(response.isSuccessful){
            val body = response.body()
            if (body != null){
                return body
            }
            else
                throw ExternalAppException("'member getByGroupId' response body is null")
        }
        else {
            if (response.code() in 500..599)
                throw ExternalAppException("'member getByGroupId' request error code: ${response.code()}")
            else if (response.code() == 401)
                throw UserUnAuthorizedException("'member getByGroupId' request error code: ${response.code()} (unauthorized)")
            else if (response.code() == 403)
                throw UserUnAuthorizedException("'member getByGroupId' request error code: ${response.code()} (forbidden)")
            else
                throw InternalAppException("'member getByGroupId' request error code: ${response.code()}")
        }
    }

    override fun getByUserId(accessToken: String, id: Long): List<Member> {
        val response = GatewayRetrofitClient.getInstance().create(MemberRetrofitService::class.java).getByUserId(accessToken, "CLIENT_TOKEN", "CLIENT_VERSION", id).execute()
        if(response.isSuccessful){
            val body = response.body()
            if (body != null){
                return body
            }
            else
                throw ExternalAppException("'member getByGroupId' response body is null")
        }
        else {
            if (response.code() in 500..599)
                throw ExternalAppException("'member getByGroupId' request error code: ${response.code()}")
            else if (response.code() == 401)
                throw UserUnAuthorizedException("'member getByGroupId' request error code: ${response.code()} (unauthorized)")
            else if (response.code() == 403)
                throw UserUnAuthorizedException("'member getByGroupId' request error code: ${response.code()} (forbidden)")
            else
                throw InternalAppException("'member getByGroupId' request error code: ${response.code()}")
        }
    }

    override fun create(accessToken: String, data: Member): Member {
        val response = GatewayRetrofitClient.getInstance().create(MemberRetrofitService::class.java).create(accessToken, "CLIENT_TOKEN", "CLIENT_VERSION", data).execute()
        if(response.isSuccessful){
            val body = response.body()
            if (body != null){
                return body
            }
            else
                throw ExternalAppException("'member create' response body is null")
        }
        else {
            if (response.code() in 500..599)
                throw ExternalAppException("'member create' request error code: ${response.code()}")
            else if (response.code() == 401)
                throw UserUnAuthorizedException("'member create' request error code: ${response.code()} (unauthorized)")
            else if (response.code() == 403)
                throw UserUnAuthorizedException("'member create' request error code: ${response.code()} (forbidden)")
            else
                throw InternalAppException("'member create' request error code: ${response.code()}")
        }
    }

    override fun edit(accessToken: String, data: Member, editedFields: Set<String>): Member {
        var fields = ""
        for (field in editedFields){
            fields += field + ","
        }
        fields = fields.substring(0, fields.length - 2)
        val response = GatewayRetrofitClient.getInstance().create(MemberRetrofitService::class.java).edit(accessToken, "CLIENT_TOKEN", "CLIENT_VERSION", data, fields).execute()
        if(response.isSuccessful){
            val body = response.body()
            if (body != null){
                return body
            }
            else
                throw ExternalAppException("'member edit' response body is null")
        }
        else {
            if (response.code() in 500..599)
                throw ExternalAppException("'member edit' request error code: ${response.code()}")
            else if (response.code() == 401)
                throw UserUnAuthorizedException("'member edit' request error code: ${response.code()} (unauthorized)")
            else if (response.code() == 403)
                throw UserUnAuthorizedException("'member edit' request error code: ${response.code()} (forbidden)")
            else
                throw InternalAppException("'member edit' request error code: ${response.code()}")
        }
    }

    override fun delete(accessToken: String, id: Long) {
        val response = GatewayRetrofitClient.getInstance().create(MemberRetrofitService::class.java).delete(accessToken, "CLIENT_TOKEN", "CLIENT_VERSION", id.toString()).execute()
        if(response.isSuccessful){
            return
        }
        else {
            if (response.code() in 500..599)
                throw ExternalAppException("'member delete' request error code: ${response.code()}")
            else if (response.code() == 401)
                throw UserUnAuthorizedException("'member delete' request error code: ${response.code()} (unauthorized)")
            else if (response.code() == 403)
                throw UserUnAuthorizedException("'member delete' request error code: ${response.code()} (forbidden)")
            else
                throw InternalAppException("'member delete' request error code: ${response.code()}")
        }
    }
}