package com.studentschedulleapp.androidclient.domain.repos

import com.studentschedulleapp.androidclient.domain.models.CustomLesson
import com.studentschedulleapp.androidclient.domain.models.Group
import com.studentschedulleapp.androidclient.domain.models.OutlineMedia
import com.studentschedulleapp.androidclient.domain.models.User

interface OutlineMediaRepository {

    fun getById(
        id: Long,

        onSuccess: (OutlineMedia) -> Unit,
        onNotFound: () -> Unit,
        onServerError: () -> Unit,
        onClientError: () -> Unit,
        onUnAuthorized: () -> Unit
    )
    fun getByGroupId(
        id: Long,

        onSuccess: (List<OutlineMedia>) -> Unit,
        onServerError: () -> Unit,
        onClientError: () -> Unit,
        onUnAuthorized: () -> Unit
    )
    fun create(
        data: OutlineMedia,

        onSuccess: (OutlineMedia) -> Unit,
        onServerError: () -> Unit,
        onClientError: () -> Unit,
        onUnAuthorized: () -> Unit
    )
    fun edit(
        data: OutlineMedia,

        onSuccess: (OutlineMedia) -> Unit,
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