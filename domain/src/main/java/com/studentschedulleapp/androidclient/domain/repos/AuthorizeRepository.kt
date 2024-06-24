package com.studentschedulleapp.androidclient.domain.repos

import com.studentschedulleapp.androidclient.domain.exceptions.EmailIsUsedException
import com.studentschedulleapp.androidclient.domain.exceptions.ExternalAppException
import com.studentschedulleapp.androidclient.domain.exceptions.InternalAppException
import com.studentschedulleapp.androidclient.domain.exceptions.InvalidCredentialsException
import com.studentschedulleapp.androidclient.domain.exceptions.InvalidEmailException
import com.studentschedulleapp.androidclient.domain.exceptions.UserUnAuthorizedException
import com.studentschedulleapp.androidclient.domain.models.tokens.UserTokens


interface AuthorizeRepository {
    @Throws(
        ExternalAppException::class,
        InternalAppException::class,
        UserUnAuthorizedException::class,
        InvalidCredentialsException::class)
    fun login(login: String, password: String): UserTokens
    @Throws(
        ExternalAppException::class,
        InternalAppException::class,
        UserUnAuthorizedException::class,
        EmailIsUsedException::class,
        InvalidEmailException::class)
    fun register(login: String, password: String, firstName: String, lastName: String)
    @Throws(
        ExternalAppException::class,
        InternalAppException::class,
        UserUnAuthorizedException::class,
        InvalidCredentialsException::class)
    fun verify(login: String, code: Long): UserTokens
    @Throws(
        ExternalAppException::class,
        InternalAppException::class,
        UserUnAuthorizedException::class,
        InvalidCredentialsException::class)
    fun refresh(refreshToken: String): UserTokens
}