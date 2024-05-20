package com.studentschedulleapp.androidclient.data.repos.http

import com.studentschedulleapp.androidclient.domain.models.LessonTemplate
import com.studentschedulleapp.androidclient.domain.repos.LessonTemplateRepository

class LessonTemplateRepositoryImpl : LessonTemplateRepository {
    override fun getById(accessToken: String, id: Long): LessonTemplate {
        TODO("Not yet implemented")
    }

    override fun getByScheduleTemplateId(accessToken: String, id: Long): List<LessonTemplate> {
        TODO("Not yet implemented")
    }

    override fun create(accessToken: String, data: LessonTemplate): LessonTemplate {
        TODO("Not yet implemented")
    }

    override fun edit(accessToken: String, data: LessonTemplate, editedFields: Set<String>): LessonTemplate {
        TODO("Not yet implemented")
    }

    override fun delete(accessToken: String, id: Long) {
        TODO("Not yet implemented")
    }
}