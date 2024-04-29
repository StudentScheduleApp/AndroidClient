package com.studentschedulleapp.androidclient.domain.repos

import com.studentschedulleapp.androidclient.domain.models.User

interface UserRepository {

    fun getById(
        accessToken: String,
        id: Long,

        onSuccess: (User) -> Unit,
        onNotFound: () -> Unit,
        onServerError: () -> Unit,
        onClientError: () -> Unit,
        onUnAuthorized: () -> Unit
    )
    fun getByEmail(
        accessToken: String,
        email: String,

        onSuccess: (User) -> Unit,
        onNotFound: () -> Unit,
        onServerError: () -> Unit,
        onClientError: () -> Unit,
        onUnAuthorized: () -> Unit
    )

    fun edit(
        accessToken: String,
        data: User,
        editedFields: Set<String>,

        onSuccess: (User) -> Unit,
        onNotFound: () -> Unit,
        onServerError: () -> Unit,
        onClientError: () -> Unit,
        onUnAuthorized: () -> Unit
    )

}