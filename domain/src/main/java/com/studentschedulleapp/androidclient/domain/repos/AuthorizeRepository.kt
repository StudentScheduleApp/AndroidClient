package com.studentschedulleapp.androidclient.domain.repos

import com.studentschedulleapp.androidclient.domain.models.UserTokens


interface AuthorizeRepository {

    fun login(email: String,
              password: String,

              onSuccess: () -> Unit,
              onInvalidCredentials: () -> Unit,
              onServerError: () -> Unit,
              onClientError: () -> Unit,
              onUnAuthorized: () -> Unit
    )
    fun register(
        email: String,
        password: String,

        onSuccess: () -> Unit,
        onInvalidEmail: () -> Unit,
        onUsedEmail: () -> Unit,
        onServerError: () -> Unit,
        onClientError: () -> Unit,
        onUnAuthorized: () -> Unit
    )
    fun verify(
        email: String,
        code: Long,

        onSuccess: (UserTokens) -> Unit,
        onInvalidCode: () -> Unit,
        onServerError: () -> Unit,
        onClientError: () -> Unit,
        onUnAuthorized: () -> Unit
    )
    fun refresh(
        refreshToken: String,

        onSuccess: (UserTokens) -> Unit,
        onInvalidRefreshToken: () -> Unit,
        onServerError: () -> Unit,
        onClientError: () -> Unit,
        onUnAuthorized: () -> Unit
    )
}