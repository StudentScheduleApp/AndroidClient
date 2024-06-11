package com.studentschedulleapp.androidclient.data.repos.http

import com.studentschedulleapp.androidclient.domain.models.Group
import com.studentschedulleapp.androidclient.domain.repos.GroupRepository

class GroupRepositoryImpl : GroupRepository {
    override fun getById(accessToken: String, id: Long): Group {
        TODO("Not yet implemented")
    }

    override fun create(accessToken: String, data: Group): Group {
        TODO("Not yet implemented")
    }

    override fun edit(accessToken: String, data: Group, editedFields: Set<String>): Group {
        TODO("Not yet implemented")
    }

    override fun delete(accessToken: String, id: Long) {
        TODO("Not yet implemented")
    }
}