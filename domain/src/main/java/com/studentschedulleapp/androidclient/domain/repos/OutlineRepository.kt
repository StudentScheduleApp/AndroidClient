package com.studentschedulleapp.androidclient.domain.repos

import com.studentschedulleapp.androidclient.domain.exceptions.EntityNotFoundException
import com.studentschedulleapp.androidclient.domain.exceptions.ExternalAppException
import com.studentschedulleapp.androidclient.domain.exceptions.InternalAppException
import com.studentschedulleapp.androidclient.domain.exceptions.UserUnAuthorizedException
import com.studentschedulleapp.androidclient.domain.models.CustomLesson
import com.studentschedulleapp.androidclient.domain.models.Group
import com.studentschedulleapp.androidclient.domain.models.Outline
import com.studentschedulleapp.androidclient.domain.models.User

interface OutlineRepository {
    @Throws(
        ExternalAppException::class,
        InternalAppException::class,
        UserUnAuthorizedException::class)
    fun getById(accessToken: String, id: Long): Outline
    @Throws(
        ExternalAppException::class,
        InternalAppException::class,
        UserUnAuthorizedException::class)
    fun getBySpecificLessonId(accessToken: String, id: Long): List<Outline>
    @Throws(
        ExternalAppException::class,
        InternalAppException::class,
        UserUnAuthorizedException::class)
    fun getByUserId(accessToken: String, id: Long): List<Outline>
    @Throws(
        ExternalAppException::class,
        InternalAppException::class,
        UserUnAuthorizedException::class)
    fun create(accessToken: String, data: Outline): Outline
    @Throws(
        ExternalAppException::class,
        InternalAppException::class,
        UserUnAuthorizedException::class,
        EntityNotFoundException::class)
    fun edit(accessToken: String, data: Outline, editedFields: Set<String>): Outline
    @Throws(
        ExternalAppException::class,
        InternalAppException::class,
        UserUnAuthorizedException::class,
        EntityNotFoundException::class)
    fun delete(accessToken: String, id: Long)

}