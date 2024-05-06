package com.studentschedulleapp.androidclient.domain.repos

import com.studentschedulleapp.androidclient.domain.models.Group
import com.studentschedulleapp.androidclient.domain.models.User

interface GroupRepository {

    fun getById(
        accessToken: String,
        id: Long,

        onSuccess: (Group) -> Unit,
        onNotFound: () -> Unit,
        onExternalError: () -> Unit,
        onInternalError: () -> Unit,
        onUnAuthorized: () -> Unit
    )
    fun create(
        accessToken: String,
        data: Group,

        onSuccess: (Group) -> Unit,
        onExternalError: () -> Unit,
        onInternalError: () -> Unit,
        onUnAuthorized: () -> Unit
    )
    fun edit(
        accessToken: String,
        data: Group,
        editedFields: Set<String>,

        onSuccess: (Group) -> Unit,
        onNotFound: () -> Unit,
        onExternalError: () -> Unit,
        onInternalError: () -> Unit,
        onUnAuthorized: () -> Unit
    )
    fun delete(
        accessToken: String,
        id: Long,

        onSuccess: () -> Unit,
        onNotFound: () -> Unit,
        onExternalError: () -> Unit,
        onInternalError: () -> Unit,
        onUnAuthorized: () -> Unit
    )

}