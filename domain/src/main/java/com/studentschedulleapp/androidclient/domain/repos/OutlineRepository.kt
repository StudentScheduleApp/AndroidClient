package com.studentschedulleapp.androidclient.domain.repos

import com.studentschedulleapp.androidclient.domain.models.CustomLesson
import com.studentschedulleapp.androidclient.domain.models.Group
import com.studentschedulleapp.androidclient.domain.models.Outline
import com.studentschedulleapp.androidclient.domain.models.User

interface OutlineRepository {

    fun getById(
        id: Long,

        onSuccess: (Outline) -> Unit,
        onNotFound: () -> Unit,
        onServerError: () -> Unit,
        onClientError: () -> Unit,
        onUnAuthorized: () -> Unit
    )
    fun getBySpecificLessonId(
        id: Long,

        onSuccess: (List<Outline>) -> Unit,
        onServerError: () -> Unit,
        onClientError: () -> Unit,
        onUnAuthorized: () -> Unit
    )
    fun getByUserId(
        id: Long,

        onSuccess: (List<Outline>) -> Unit,
        onServerError: () -> Unit,
        onClientError: () -> Unit,
        onUnAuthorized: () -> Unit
    )
    fun create(
        data: Outline,

        onSuccess: (Outline) -> Unit,
        onServerError: () -> Unit,
        onClientError: () -> Unit,
        onUnAuthorized: () -> Unit
    )
    fun edit(
        data: Outline,

        onSuccess: (Outline) -> Unit,
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