package com.studentschedulleapp.androidclient.domain.repos

import com.studentschedulleapp.androidclient.domain.models.CustomLesson
import com.studentschedulleapp.androidclient.domain.models.Group
import com.studentschedulleapp.androidclient.domain.models.Member
import com.studentschedulleapp.androidclient.domain.models.User

interface MemberRepository {

    fun getById(
        accessToken: String,
        id: Long,

        onSuccess: (Member) -> Unit,
        onNotFound: () -> Unit,
        onExternalError: () -> Unit,
        onInternalError: () -> Unit,
        onUnAuthorized: () -> Unit
    )
    fun getByGroupId(
        accessToken: String,
        id: Long,

        onSuccess: (List<Member>) -> Unit,
        onExternalError: () -> Unit,
        onInternalError: () -> Unit,
        onUnAuthorized: () -> Unit
    )
    fun getByUserId(
        accessToken: String,
        id: Long,

        onSuccess: (List<Member>) -> Unit,
        onExternalError: () -> Unit,
        onInternalError: () -> Unit,
        onUnAuthorized: () -> Unit
    )
    fun create(
        accessToken: String,
        data: Member,

        onSuccess: (Member) -> Unit,
        onExternalError: () -> Unit,
        onInternalError: () -> Unit,
        onUnAuthorized: () -> Unit
    )
    fun edit(
        accessToken: String,
        data: Member,
        editedFields: Set<String>,

        onSuccess: (Member) -> Unit,
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