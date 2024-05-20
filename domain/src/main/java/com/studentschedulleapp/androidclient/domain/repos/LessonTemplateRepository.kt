package com.studentschedulleapp.androidclient.domain.repos

import com.studentschedulleapp.androidclient.domain.exceptions.EntityNotFoundException
import com.studentschedulleapp.androidclient.domain.exceptions.ExternalAppException
import com.studentschedulleapp.androidclient.domain.exceptions.InternalAppException
import com.studentschedulleapp.androidclient.domain.exceptions.UserUnAuthorizedException
import com.studentschedulleapp.androidclient.domain.models.CustomLesson
import com.studentschedulleapp.androidclient.domain.models.Group
import com.studentschedulleapp.androidclient.domain.models.LessonTemplate
import com.studentschedulleapp.androidclient.domain.models.User

interface LessonTemplateRepository {
    @Throws(
        ExternalAppException::class,
        InternalAppException::class,
        UserUnAuthorizedException::class)
    fun getById(accessToken: String, id: Long): LessonTemplate
    @Throws(
        ExternalAppException::class,
        InternalAppException::class,
        UserUnAuthorizedException::class)
    fun getByScheduleTemplateId(accessToken: String, id: Long): List<LessonTemplate>
    @Throws(
        ExternalAppException::class,
        InternalAppException::class,
        UserUnAuthorizedException::class)
    fun create(accessToken: String, data: LessonTemplate): LessonTemplate
    @Throws(
        ExternalAppException::class,
        InternalAppException::class,
        UserUnAuthorizedException::class,
        EntityNotFoundException::class)
    fun edit(accessToken: String, data: LessonTemplate, editedFields: Set<String>): LessonTemplate
    @Throws(
        ExternalAppException::class,
        InternalAppException::class,
        UserUnAuthorizedException::class,
        EntityNotFoundException::class)
    fun delete(accessToken: String, id: Long)

}