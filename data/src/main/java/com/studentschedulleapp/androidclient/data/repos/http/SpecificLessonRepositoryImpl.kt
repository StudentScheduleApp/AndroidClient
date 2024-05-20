package com.studentschedulleapp.androidclient.data.repos.http

import com.studentschedulleapp.androidclient.domain.models.SpecificLesson
import com.studentschedulleapp.androidclient.domain.repos.SpecificLessonRepository

class SpecificLessonRepositoryImpl : SpecificLessonRepository {
    override fun getById(accessToken: String, id: Long): SpecificLesson {
        TODO("Not yet implemented")
    }

    override fun getByGroupId(accessToken: String, id: Long): List<SpecificLesson> {
        TODO("Not yet implemented")
    }

    override fun create(accessToken: String, data: SpecificLesson): SpecificLesson {
        TODO("Not yet implemented")
    }

    override fun edit(
        accessToken: String,
        data: SpecificLesson,
        editedFields: Set<String>
    ): SpecificLesson {
        TODO("Not yet implemented")
    }

    override fun delete(accessToken: String, id: Long) {
        TODO("Not yet implemented")
    }
}