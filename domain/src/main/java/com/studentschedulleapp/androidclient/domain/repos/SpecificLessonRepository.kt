package com.studentschedulleapp.androidclient.domain.repos

import com.studentschedulleapp.androidclient.domain.exceptions.EntityNotFoundException
import com.studentschedulleapp.androidclient.domain.exceptions.ExternalAppException
import com.studentschedulleapp.androidclient.domain.exceptions.InternalAppException
import com.studentschedulleapp.androidclient.domain.exceptions.UserUnAuthorizedException
import com.studentschedulleapp.androidclient.domain.models.CustomLesson
import com.studentschedulleapp.androidclient.domain.models.Group
import com.studentschedulleapp.androidclient.domain.models.ScheduleTemplate
import com.studentschedulleapp.androidclient.domain.models.SpecificLesson
import com.studentschedulleapp.androidclient.domain.models.User

interface SpecificLessonRepository {

    @Throws(
        ExternalAppException::class,
        InternalAppException::class,
        UserUnAuthorizedException::class,
        EntityNotFoundException::class)
    fun getById(accessToken: String, id: Long): SpecificLesson
    @Throws(
        ExternalAppException::class,
        InternalAppException::class,
        UserUnAuthorizedException::class)
    fun getByGroupId(accessToken: String, id: Long): List<SpecificLesson>
    @Throws(
        ExternalAppException::class,
        InternalAppException::class,
        UserUnAuthorizedException::class)
    fun create(accessToken: String, data: SpecificLesson): SpecificLesson
    @Throws(
        ExternalAppException::class,
        InternalAppException::class,
        UserUnAuthorizedException::class,
        EntityNotFoundException::class)
    fun edit(accessToken: String, data: SpecificLesson, editedFields: Set<String>): SpecificLesson
    @Throws(
        ExternalAppException::class,
        InternalAppException::class,
        UserUnAuthorizedException::class,
        EntityNotFoundException::class)
    fun delete(accessToken: String, id: Long)

}