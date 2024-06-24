package com.studentschedulleapp.androidclient.data.repos.http

import com.studentschedulleapp.androidclient.data.api.retrofit.GatewayRetrofitClient
import com.studentschedulleapp.androidclient.data.api.retrofit.services.OutlineMediaCommentRetrofitService
import com.studentschedulleapp.androidclient.domain.exceptions.ExternalAppException
import com.studentschedulleapp.androidclient.domain.exceptions.InternalAppException
import com.studentschedulleapp.androidclient.domain.exceptions.UserUnAuthorizedException
import com.studentschedulleapp.androidclient.domain.models.OutlineMediaComment
import com.studentschedulleapp.androidclient.domain.repos.OutlineMediaCommentRepository

class OutlineMediaCommentRepositoryImpl : OutlineMediaCommentRepository {
    override fun getById(accessToken: String, id: Long): OutlineMediaComment {
        val response = GatewayRetrofitClient.getInstance().create(OutlineMediaCommentRetrofitService::class.java).getById(accessToken, "CLIENT_TOKEN", "CLIENT_VERSION", id.toString()).execute()
        if(response.isSuccessful){
            val body = response.body()
            if (!body.isNullOrEmpty()){
                return body[0]
            }
            else
                throw ExternalAppException("'outlineMediaComment getById' response body is null")
        }
        else {
            if (response.code() in 500..599)
                throw ExternalAppException("'outlineMediaComment getById' request error code: ${response.code()}")
            else if (response.code() == 401)
                throw UserUnAuthorizedException("'outlineMediaComment getById' request error code: ${response.code()} (unauthorized)")
            else if (response.code() == 403)
                throw UserUnAuthorizedException("'outlineMediaComment getById' request error code: ${response.code()} (forbidden)")
            else
                throw InternalAppException("'outlineMediaComment getById' request error code: ${response.code()}")
        }
    }

    override fun getByOutlineMediaId(accessToken: String, id: Long): List<OutlineMediaComment> {
        val response = GatewayRetrofitClient.getInstance().create(OutlineMediaCommentRetrofitService::class.java).getByOutlineMediaId(accessToken, "CLIENT_TOKEN", "CLIENT_VERSION", id).execute()
        if(response.isSuccessful){
            val body = response.body()
            if (body != null){
                return body
            }
            else
                throw ExternalAppException("'outlineMediaComment getByGroupId' response body is null")
        }
        else {
            if (response.code() in 500..599)
                throw ExternalAppException("'outlineMediaComment getByGroupId' request error code: ${response.code()}")
            else if (response.code() == 401)
                throw UserUnAuthorizedException("'outlineMediaComment getByGroupId' request error code: ${response.code()} (unauthorized)")
            else if (response.code() == 403)
                throw UserUnAuthorizedException("'outlineMediaComment getByGroupId' request error code: ${response.code()} (forbidden)")
            else
                throw InternalAppException("'outlineMediaComment getByGroupId' request error code: ${response.code()}")
        }
    }

    override fun create(accessToken: String, data: OutlineMediaComment): OutlineMediaComment {
        val response = GatewayRetrofitClient.getInstance().create(OutlineMediaCommentRetrofitService::class.java).create(accessToken, "CLIENT_TOKEN", "CLIENT_VERSION", data).execute()
        if(response.isSuccessful){
            val body = response.body()
            if (body != null){
                return body
            }
            else
                throw ExternalAppException("'outlineMediaComment create' response body is null")
        }
        else {
            if (response.code() in 500..599)
                throw ExternalAppException("'outlineMediaComment create' request error code: ${response.code()}")
            else if (response.code() == 401)
                throw UserUnAuthorizedException("'outlineMediaComment create' request error code: ${response.code()} (unauthorized)")
            else if (response.code() == 403)
                throw UserUnAuthorizedException("'outlineMediaComment create' request error code: ${response.code()} (forbidden)")
            else
                throw InternalAppException("'outlineMediaComment create' request error code: ${response.code()}")
        }
    }

    override fun edit(accessToken: String, data: OutlineMediaComment, editedFields: Set<String>): OutlineMediaComment {
        var fields = ""
        for (field in editedFields){
            fields += field + ","
        }
        fields = fields.substring(0, fields.length - 2)
        val response = GatewayRetrofitClient.getInstance().create(OutlineMediaCommentRetrofitService::class.java).edit(accessToken, "CLIENT_TOKEN", "CLIENT_VERSION", data, fields).execute()
        if(response.isSuccessful){
            val body = response.body()
            if (body != null){
                return body
            }
            else
                throw ExternalAppException("'outlineMediaComment edit' response body is null")
        }
        else {
            if (response.code() in 500..599)
                throw ExternalAppException("'outlineMediaComment edit' request error code: ${response.code()}")
            else if (response.code() == 401)
                throw UserUnAuthorizedException("'outlineMediaComment edit' request error code: ${response.code()} (unauthorized)")
            else if (response.code() == 403)
                throw UserUnAuthorizedException("'outlineMediaComment edit' request error code: ${response.code()} (forbidden)")
            else
                throw InternalAppException("'outlineMediaComment edit' request error code: ${response.code()}")
        }
    }

    override fun delete(accessToken: String, id: Long) {
        val response = GatewayRetrofitClient.getInstance().create(OutlineMediaCommentRetrofitService::class.java).delete(accessToken, "CLIENT_TOKEN", "CLIENT_VERSION", id.toString()).execute()
        if(response.isSuccessful){
            return
        }
        else {
            if (response.code() in 500..599)
                throw ExternalAppException("'outlineMediaComment delete' request error code: ${response.code()}")
            else if (response.code() == 401)
                throw UserUnAuthorizedException("'outlineMediaComment delete' request error code: ${response.code()} (unauthorized)")
            else if (response.code() == 403)
                throw UserUnAuthorizedException("'outlineMediaComment delete' request error code: ${response.code()} (forbidden)")
            else
                throw InternalAppException("'outlineMediaComment delete' request error code: ${response.code()}")
        }
    }
}