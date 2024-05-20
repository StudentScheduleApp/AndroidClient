package com.studentschedulleapp.androidclient.data.repos.http

import com.studentschedulleapp.androidclient.domain.models.OutlineMediaComment
import com.studentschedulleapp.androidclient.domain.repos.OutlineMediaCommentRepository

class OutlineMediaCommentRepositoryImpl : OutlineMediaCommentRepository {
    override fun getById(accessToken: String, id: Long): OutlineMediaComment {
        TODO("Not yet implemented")
    }

    override fun getByOutlineMediaId(accessToken: String, id: Long): List<OutlineMediaComment> {
        TODO("Not yet implemented")
    }

    override fun create(accessToken: String, data: OutlineMediaComment): OutlineMediaComment {
        TODO("Not yet implemented")
    }

    override fun edit(
        accessToken: String,
        data: OutlineMediaComment,
        editedFields: Set<String>
    ): OutlineMediaComment {
        TODO("Not yet implemented")
    }

    override fun delete(accessToken: String, id: Long) {
        TODO("Not yet implemented")
    }
}