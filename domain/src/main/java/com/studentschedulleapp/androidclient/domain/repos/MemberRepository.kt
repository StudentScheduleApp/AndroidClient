package com.studentschedulleapp.androidclient.domain.repos

import com.studentschedulleapp.androidclient.domain.models.CustomLesson
import com.studentschedulleapp.androidclient.domain.models.Group
import com.studentschedulleapp.androidclient.domain.models.Member
import com.studentschedulleapp.androidclient.domain.models.User

interface MemberRepository {

    fun getById(
        id: Long,

        onSuccess: (Member) -> Unit,
        onNotFound: () -> Unit,
        onServerError: () -> Unit,
        onClientError: () -> Unit,
        onUnAuthorized: () -> Unit
    )
    fun getByGroupId(
        id: Long,

        onSuccess: (List<Member>) -> Unit,
        onServerError: () -> Unit,
        onClientError: () -> Unit,
        onUnAuthorized: () -> Unit
    )
    fun getByUserId(
        id: Long,

        onSuccess: (List<Member>) -> Unit,
        onServerError: () -> Unit,
        onClientError: () -> Unit,
        onUnAuthorized: () -> Unit
    )
    fun create(
        data: Member,

        onSuccess: (Member) -> Unit,
        onServerError: () -> Unit,
        onClientError: () -> Unit,
        onUnAuthorized: () -> Unit
    )
    fun edit(
        data: Member,

        onSuccess: (Member) -> Unit,
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