package com.studentschedulleapp.androidclient.data.repos.http

import com.studentschedulleapp.androidclient.domain.models.ScheduleTemplate
import com.studentschedulleapp.androidclient.domain.repos.ScheduleTemplateRepository

class ScheduleTemplateRepositoryImpl : ScheduleTemplateRepository {
    override fun getById(accessToken: String, id: Long): ScheduleTemplate {
        TODO("Not yet implemented")
    }

    override fun getByGroupId(accessToken: String, id: Long): List<ScheduleTemplate> {
        TODO("Not yet implemented")
    }

    override fun create(accessToken: String, data: ScheduleTemplate): ScheduleTemplate {
        TODO("Not yet implemented")
    }

    override fun edit(accessToken: String, data: ScheduleTemplate, editedFields: Set<String>): ScheduleTemplate {
        TODO("Not yet implemented")
    }

    override fun delete(accessToken: String, id: Long) {
        TODO("Not yet implemented")
    }
}