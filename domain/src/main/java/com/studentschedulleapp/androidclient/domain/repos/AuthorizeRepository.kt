package com.studentschedulleapp.androidclient.domain.repos

import com.studentschedulleapp.androidclient.domain.models.tokens.UserTokens


interface AuthorizeRepository {

    fun login(email: String,
              password: String,

              onSuccess: () -> Unit,
              onInvalidCredentials: () -> Unit,
              onExternalError: () -> Unit,
              onInternalError: () -> Unit,
              onUnAuthorized: () -> Unit
    )
    fun register(
        email: String,
        password: String,

        onSuccess: () -> Unit,
        onInvalidEmail: () -> Unit,
        onUsedEmail: () -> Unit,
        onExternalError: () -> Unit,
        onInternalError: () -> Unit,
        onUnAuthorized: () -> Unit
    )
    fun verify(
        email: String,
        code: Long,

        onSuccess: (UserTokens) -> Unit,
        onInvalidCode: () -> Unit,
        onExternalError: () -> Unit,
        onInternalError: () -> Unit,
        onUnAuthorized: () -> Unit
    )
    fun refresh(
        refreshToken: String,

        onSuccess: (UserTokens) -> Unit,
        onInvalidRefreshToken: () -> Unit,
        onExternalError: () -> Unit,
        onInternalError: () -> Unit,
        onUnAuthorized: () -> Unit
    )
}