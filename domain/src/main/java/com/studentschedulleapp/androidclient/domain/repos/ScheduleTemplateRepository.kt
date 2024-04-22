package com.studentschedulleapp.androidclient.domain.repos

import com.studentschedulleapp.androidclient.domain.models.CustomLesson
import com.studentschedulleapp.androidclient.domain.models.Group
import com.studentschedulleapp.androidclient.domain.models.ScheduleTemplate
import com.studentschedulleapp.androidclient.domain.models.User

interface ScheduleTemplateRepository {

    fun getById(
        id: Long,

        onSuccess: (ScheduleTemplate) -> Unit,
        onNotFound: () -> Unit,
        onServerError: () -> Unit,
        onClientError: () -> Unit,
        onUnAuthorized: () -> Unit
    )
    fun getByGroupId(
        id: Long,

        onSuccess: (List<ScheduleTemplate>) -> Unit,
        onServerError: () -> Unit,
        onClientError: () -> Unit,
        onUnAuthorized: () -> Unit
    )
    fun create(
        data: ScheduleTemplate,

        onSuccess: (ScheduleTemplate) -> Unit,
        onServerError: () -> Unit,
        onClientError: () -> Unit,
        onUnAuthorized: () -> Unit
    )
    fun edit(
        data: ScheduleTemplate,

        onSuccess: (ScheduleTemplate) -> Unit,
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