package com.studentschedulleapp.androidclient.domain.repos

import com.studentschedulleapp.androidclient.domain.models.User

interface UserRepository {

    fun getById(
        id: Long,

        onSuccess: (User) -> Unit,
        onNotFound: () -> Unit,
        onServerError: () -> Unit,
        onClientError: () -> Unit,
        onUnAuthorized: () -> Unit
    )
    fun getByEmail(
        email: String,

        onSuccess: (User) -> Unit,
        onNotFound: () -> Unit,
        onServerError: () -> Unit,
        onClientError: () -> Unit,
        onUnAuthorized: () -> Unit
    )

   // fun edit(
   //     data: User,

   //     onSuccess: (User) -> Unit,
   //     onNotFound: () -> Unit,
   //     onServerError: () -> Unit,
   //     onClientError: () -> Unit,
   //     onUnAuthorized: () -> Unit
   // )

}