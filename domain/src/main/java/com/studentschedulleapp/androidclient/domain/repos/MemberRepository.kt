package com.studentschedulleapp.androidclient.domain.repos

import com.studentschedulleapp.androidclient.domain.exceptions.EntityNotFoundException
import com.studentschedulleapp.androidclient.domain.exceptions.ExternalAppException
import com.studentschedulleapp.androidclient.domain.exceptions.InternalAppException
import com.studentschedulleapp.androidclient.domain.exceptions.UserUnAuthorizedException
import com.studentschedulleapp.androidclient.domain.models.CustomLesson
import com.studentschedulleapp.androidclient.domain.models.Group
import com.studentschedulleapp.androidclient.domain.models.Member
import com.studentschedulleapp.androidclient.domain.models.User

interface MemberRepository {
    @Throws(
        ExternalAppException::class,
        InternalAppException::class,
        UserUnAuthorizedException::class)
    fun getById(accessToken: String, id: Long, ): Member
    @Throws(
        ExternalAppException::class,
        InternalAppException::class,
        UserUnAuthorizedException::class)
    fun getByGroupId(accessToken: String, id: Long): List<Member>
    @Throws(
        ExternalAppException::class,
        InternalAppException::class,
        UserUnAuthorizedException::class)
    fun getByUserId(accessToken: String, id: Long): List<Member>
    @Throws(
        ExternalAppException::class,
        InternalAppException::class,
        UserUnAuthorizedException::class)
    fun create(accessToken: String, data: Member): Member
    @Throws(
        ExternalAppException::class,
        InternalAppException::class,
        UserUnAuthorizedException::class,
        EntityNotFoundException::class)
    fun edit(accessToken: String, data: Member, editedFields: Set<String>): Member
    @Throws(
        ExternalAppException::class,
        InternalAppException::class,
        UserUnAuthorizedException::class,
        EntityNotFoundException::class)
    fun delete(accessToken: String, id: Long)

}