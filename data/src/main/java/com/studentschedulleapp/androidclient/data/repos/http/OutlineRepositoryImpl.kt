package com.studentschedulleapp.androidclient.data.repos.http

import com.studentschedulleapp.androidclient.domain.models.Outline
import com.studentschedulleapp.androidclient.domain.repos.OutlineRepository

class OutlineRepositoryImpl : OutlineRepository {
    override fun getById(accessToken: String, id: Long): Outline {
        TODO("Not yet implemented")
    }

    override fun getBySpecificLessonId(accessToken: String, id: Long): List<Outline> {
        TODO("Not yet implemented")
    }

    override fun getByUserId(accessToken: String, id: Long): List<Outline> {
        TODO("Not yet implemented")
    }

    override fun create(accessToken: String, data: Outline): Outline {
        TODO("Not yet implemented")
    }

    override fun edit(accessToken: String, data: Outline, editedFields: Set<String>): Outline {
        TODO("Not yet implemented")
    }

    override fun delete(accessToken: String, id: Long) {
        TODO("Not yet implemented")
    }
}