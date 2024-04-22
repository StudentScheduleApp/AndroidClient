package com.studentschedulleapp.androidclient.domain.repos

import com.studentschedulleapp.androidclient.domain.models.CustomLesson
import com.studentschedulleapp.androidclient.domain.models.Group
import com.studentschedulleapp.androidclient.domain.models.OutlineMediaComment
import com.studentschedulleapp.androidclient.domain.models.User

interface OutlineMediaCommentRepository {

    fun getById(
        id: Long,

        onSuccess: (OutlineMediaComment) -> Unit,
        onNotFound: () -> Unit,
        onServerError: () -> Unit,
        onClientError: () -> Unit,
        onUnAuthorized: () -> Unit
    )
    fun getByOutlineMediaId(
        id: Long,

        onSuccess: (List<OutlineMediaComment>) -> Unit,
        onServerError: () -> Unit,
        onClientError: () -> Unit,
        onUnAuthorized: () -> Unit
    )
    fun create(
        data: OutlineMediaComment,

        onSuccess: (OutlineMediaComment) -> Unit,
        onServerError: () -> Unit,
        onClientError: () -> Unit,
        onUnAuthorized: () -> Unit
    )
    fun edit(
        data: OutlineMediaComment,

        onSuccess: (OutlineMediaComment) -> Unit,
        onNotFound: () -> Unit,
        onServerError: () -> Unit,
        onClientError: () -> Unit,
        onUnAuthorized: () -> Unit
    )
    fun delete(
        id: Long,

        onSuccess: () -> Unit,
        onNotFound: () -> Unit,
        onServerError: () -> Unit,
        onClientError: () -> Unit,
        onUnAuthorized: () -> Unit
    )

}