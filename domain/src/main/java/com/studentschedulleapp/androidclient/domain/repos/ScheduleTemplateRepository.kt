package com.studentschedulleapp.androidclient.domain.repos

import com.studentschedulleapp.androidclient.domain.models.CustomLesson
import com.studentschedulleapp.androidclient.domain.models.Group
import com.studentschedulleapp.androidclient.domain.models.ScheduleTemplate
import com.studentschedulleapp.androidclient.domain.models.User

interface ScheduleTemplateRepository {

    fun getById(
        accessToken: String,
        id: Long,

        onSuccess: (ScheduleTemplate) -> Unit,
        onNotFound: () -> Unit,
        onExternalError: () -> Unit,
        onInternalError: () -> Unit,
        onUnAuthorized: () -> Unit
    )
    fun getByGroupId(
        accessToken: String,
        id: Long,

        onSuccess: (List<ScheduleTemplate>) -> Unit,
        onExternalError: () -> Unit,
        onInternalError: () -> Unit,
        onUnAuthorized: () -> Unit
    )
    fun create(
        accessToken: String,
        data: ScheduleTemplate,

        onSuccess: (ScheduleTemplate) -> Unit,
        onExternalError: () -> Unit,
        onInternalError: () -> Unit,
        onUnAuthorized: () -> Unit
    )
    fun edit(
        accessToken: String,
        data: ScheduleTemplate,
        editedFields: Set<String>,

        onSuccess: (ScheduleTemplate) -> Unit,
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