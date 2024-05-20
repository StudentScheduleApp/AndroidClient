package com.studentschedulleapp.androidclient.data.repos.http

import com.studentschedulleapp.androidclient.domain.models.CustomLesson
import com.studentschedulleapp.androidclient.domain.repos.CustomLessonRepository

class CustomLessonRepositoryImpl : CustomLessonRepository {
    override fun getById(accessToken: String, id: Long): CustomLesson {
        TODO("Not yet implemented")
    }

    override fun getByGroupId(accessToken: String, id: Long): List<CustomLesson> {
        TODO("Not yet implemented")
    }

    override fun create(accessToken: String, data: CustomLesson): CustomLesson {
        TODO("Not yet implemented")
    }

    override fun edit(accessToken: String, data: CustomLesson, editedFields: Set<String>): CustomLesson {
        TODO("Not yet implemented")
    }

    override fun delete(accessToken: String, id: Long) {
        TODO("Not yet implemented")
    }
}