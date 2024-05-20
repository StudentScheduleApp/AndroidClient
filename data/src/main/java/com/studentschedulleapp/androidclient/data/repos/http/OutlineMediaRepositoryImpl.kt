package com.studentschedulleapp.androidclient.data.repos.http

import com.studentschedulleapp.androidclient.domain.models.OutlineMedia
import com.studentschedulleapp.androidclient.domain.repos.OutlineMediaRepository

class OutlineMediaRepositoryImpl : OutlineMediaRepository {
    override fun getById(accessToken: String, id: Long): OutlineMedia {
        TODO("Not yet implemented")
    }

    override fun getByGroupId(accessToken: String, id: Long): List<OutlineMedia> {
        TODO("Not yet implemented")
    }

    override fun create(accessToken: String, data: OutlineMedia): OutlineMedia {
        TODO("Not yet implemented")
    }

    override fun edit(accessToken: String, data: OutlineMedia, editedFields: Set<String>): OutlineMedia {
        TODO("Not yet implemented")
    }

    override fun delete(accessToken: String, id: Long) {
        TODO("Not yet implemented")
    }
}