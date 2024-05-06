package com.studentschedulleapp.androidclient.domain.repos

import com.studentschedulleapp.androidclient.domain.models.CustomLesson
import com.studentschedulleapp.androidclient.domain.models.Group
import com.studentschedulleapp.androidclient.domain.models.User

interface CustomLessonRepository {

    fun getById(
        accessToken: String,
        id: Long,

        onSuccess: (CustomLesson) -> Unit,
        onNotFound: () -> Unit,
        onExternalError: () -> Unit,
        onInternalError: () -> Unit,
        onUnAuthorized: () -> Unit
    )
    fun getByGroupId(
        accessToken: String,
        id: Long,

        onSuccess: (List<CustomLesson>) -> Unit,
        onExternalError: () -> Unit,
        onInternalError: () -> Unit,
        onUnAuthorized: () -> Unit
    )
    fun create(
        accessToken: String,
        data: CustomLesson,

        onSuccess: (CustomLesson) -> Unit,
        onExternalError: () -> Unit,
        onInternalError: () -> Unit,
        onUnAuthorized: () -> Unit
    )
    fun edit(
        accessToken: String,
        data: CustomLesson,
        editedFields: Set<String>,

        onSuccess: (CustomLesson) -> Unit,
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