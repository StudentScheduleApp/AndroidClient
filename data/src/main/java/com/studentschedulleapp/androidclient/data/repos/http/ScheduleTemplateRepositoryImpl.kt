package com.studentschedulleapp.androidclient.data.repos.http

import com.studentschedulleapp.androidclient.data.api.retrofit.GatewayRetrofitClient
import com.studentschedulleapp.androidclient.data.api.retrofit.services.ScheduleTemplateRetrofitService
import com.studentschedulleapp.androidclient.domain.exceptions.ExternalAppException
import com.studentschedulleapp.androidclient.domain.exceptions.InternalAppException
import com.studentschedulleapp.androidclient.domain.exceptions.UserUnAuthorizedException
import com.studentschedulleapp.androidclient.domain.models.ScheduleTemplate
import com.studentschedulleapp.androidclient.domain.repos.ScheduleTemplateRepository

class ScheduleTemplateRepositoryImpl : ScheduleTemplateRepository {
    override fun getById(accessToken: String, id: Long): ScheduleTemplate {
        val response = GatewayRetrofitClient.getInstance().create(ScheduleTemplateRetrofitService::class.java).getById(accessToken, "CLIENT_TOKEN", "CLIENT_VERSION", id.toString()).execute()
        if(response.isSuccessful){
            val body = response.body()
            if (!body.isNullOrEmpty()){
                return body[0]
            }
            else
                throw ExternalAppException("'scheduleTemplate getById' response body is null")
        }
        else {
            if (response.code() in 500..599)
                throw ExternalAppException("'scheduleTemplate getById' request error code: ${response.code()}")
            else if (response.code() == 401)
                throw UserUnAuthorizedException("'scheduleTemplate getById' request error code: ${response.code()} (unauthorized)")
            else if (response.code() == 403)
                throw UserUnAuthorizedException("'scheduleTemplate getById' request error code: ${response.code()} (forbidden)")
            else
                throw InternalAppException("'scheduleTemplate getById' request error code: ${response.code()}")
        }
    }

    override fun getByGroupId(accessToken: String, id: Long): List<ScheduleTemplate> {
        val response = GatewayRetrofitClient.getInstance().create(ScheduleTemplateRetrofitService::class.java).getByGroupId(accessToken, "CLIENT_TOKEN", "CLIENT_VERSION", id).execute()
        if(response.isSuccessful){
            val body = response.body()
            if (body != null){
                return body
            }
            else
                throw ExternalAppException("'scheduleTemplate getByGroupId' response body is null")
        }
        else {
            if (response.code() in 500..599)
                throw ExternalAppException("'scheduleTemplate getByGroupId' request error code: ${response.code()}")
            else if (response.code() == 401)
                throw UserUnAuthorizedException("'scheduleTemplate getByGroupId' request error code: ${response.code()} (unauthorized)")
            else if (response.code() == 403)
                throw UserUnAuthorizedException("'scheduleTemplate getByGroupId' request error code: ${response.code()} (forbidden)")
            else
                throw InternalAppException("'scheduleTemplate getByGroupId' request error code: ${response.code()}")
        }
    }

    override fun create(accessToken: String, data: ScheduleTemplate): ScheduleTemplate {
        val response = GatewayRetrofitClient.getInstance().create(ScheduleTemplateRetrofitService::class.java).create(accessToken, "CLIENT_TOKEN", "CLIENT_VERSION", data).execute()
        if(response.isSuccessful){
            val body = response.body()
            if (body != null){
                return body
            }
            else
                throw ExternalAppException("'scheduleTemplate create' response body is null")
        }
        else {
            if (response.code() in 500..599)
                throw ExternalAppException("'scheduleTemplate create' request error code: ${response.code()}")
            else if (response.code() == 401)
                throw UserUnAuthorizedException("'scheduleTemplate create' request error code: ${response.code()} (unauthorized)")
            else if (response.code() == 403)
                throw UserUnAuthorizedException("'scheduleTemplate create' request error code: ${response.code()} (forbidden)")
            else
                throw InternalAppException("'scheduleTemplate create' request error code: ${response.code()}")
        }
    }

    override fun edit(accessToken: String, data: ScheduleTemplate, editedFields: Set<String>): ScheduleTemplate {
        var fields = ""
        for (field in editedFields){
            fields += field + ","
        }
        fields = fields.substring(0, fields.length - 2)
        val response = GatewayRetrofitClient.getInstance().create(ScheduleTemplateRetrofitService::class.java).edit(accessToken, "CLIENT_TOKEN", "CLIENT_VERSION", data, fields).execute()
        if(response.isSuccessful){
            val body = response.body()
            if (body != null){
                return body
            }
            else
                throw ExternalAppException("'scheduleTemplate edit' response body is null")
        }
        else {
            if (response.code() in 500..599)
                throw ExternalAppException("'scheduleTemplate edit' request error code: ${response.code()}")
            else if (response.code() == 401)
                throw UserUnAuthorizedException("'scheduleTemplate edit' request error code: ${response.code()} (unauthorized)")
            else if (response.code() == 403)
                throw UserUnAuthorizedException("'scheduleTemplate edit' request error code: ${response.code()} (forbidden)")
            else
                throw InternalAppException("'scheduleTemplate edit' request error code: ${response.code()}")
        }
    }

    override fun delete(accessToken: String, id: Long) {
        val response = GatewayRetrofitClient.getInstance().create(ScheduleTemplateRetrofitService::class.java).delete(accessToken, "CLIENT_TOKEN", "CLIENT_VERSION", id.toString()).execute()
        if(response.isSuccessful){
            return
        }
        else {
            if (response.code() in 500..599)
                throw ExternalAppException("'scheduleTemplate delete' request error code: ${response.code()}")
            else if (response.code() == 401)
                throw UserUnAuthorizedException("'scheduleTemplate delete' request error code: ${response.code()} (unauthorized)")
            else if (response.code() == 403)
                throw UserUnAuthorizedException("'scheduleTemplate delete' request error code: ${response.code()} (forbidden)")
            else
                throw InternalAppException("'scheduleTemplate delete' request error code: ${response.code()}")
        }
    }
}