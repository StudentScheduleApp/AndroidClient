package com.studentschedulleapp.androidclient.domain.repos

import com.studentschedulleapp.androidclient.domain.exceptions.EntityNotFoundException
import com.studentschedulleapp.androidclient.domain.exceptions.ExternalAppException
import com.studentschedulleapp.androidclient.domain.exceptions.InternalAppException
import com.studentschedulleapp.androidclient.domain.exceptions.UserUnAuthorizedException
import com.studentschedulleapp.androidclient.domain.models.CustomLesson
import com.studentschedulleapp.androidclient.domain.models.Group
import com.studentschedulleapp.androidclient.domain.models.OutlineMediaComment
import com.studentschedulleapp.androidclient.domain.models.User

interface OutlineMediaCommentRepository {
    @Throws(
        ExternalAppException::class,
        InternalAppException::class,
        UserUnAuthorizedException::class)
    fun getById(accessToken: String, id: Long,): OutlineMediaComment
    @Throws(
        ExternalAppException::class,
        InternalAppException::class,
        UserUnAuthorizedException::class)
    fun getByOutlineMediaId(accessToken: String, id: Long): List<OutlineMediaComment>
    @Throws(
        ExternalAppException::class,
        InternalAppException::class,
        UserUnAuthorizedException::class)
    fun create(accessToken: String, data: OutlineMediaComment, ): OutlineMediaComment
    @Throws(
        ExternalAppException::class,
        InternalAppException::class,
        UserUnAuthorizedException::class,
        EntityNotFoundException::class)
    fun edit(accessToken: String, data: OutlineMediaComment, editedFields: Set<String>, ): OutlineMediaComment
    @Throws(
        ExternalAppException::class,
        InternalAppException::class,
        UserUnAuthorizedException::class,
        EntityNotFoundException::class)
    fun delete(accessToken: String, id: Long)

}