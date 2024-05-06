package com.studentschedulleapp.androidclient.domain.repos

import com.studentschedulleapp.androidclient.domain.models.CustomLesson
import com.studentschedulleapp.androidclient.domain.models.Group
import com.studentschedulleapp.androidclient.domain.models.LessonTemplate
import com.studentschedulleapp.androidclient.domain.models.User

interface LessonTemplateRepository {

    fun getById(
        accessToken: String,
        id: Long,

        onSuccess: (LessonTemplate) -> Unit,
        onNotFound: () -> Unit,
        onExternalError: () -> Unit,
        onInternalError: () -> Unit,
        onUnAuthorized: () -> Unit
    )
    fun getByScheduleTemplateId(
        accessToken: String,
        id: Long,

        onSuccess: (List<LessonTemplate>) -> Unit,
        onExternalError: () -> Unit,
        onInternalError: () -> Unit,
        onUnAuthorized: () -> Unit
    )
    fun create(
        accessToken: String,
        data: LessonTemplate,

        onSuccess: (LessonTemplate) -> Unit,
        onExternalError: () -> Unit,
        onInternalError: () -> Unit,
        onUnAuthorized: () -> Unit
    )
    fun edit(
        accessToken: String,
        data: LessonTemplate,
        editedFields: Set<String>,

        onSuccess: (LessonTemplate) -> Unit,
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