package com.studentschedulleapp.androidclient.data.repos.http

import com.studentschedulleapp.androidclient.domain.models.User
import com.studentschedulleapp.androidclient.domain.repos.UserRepository

class UserRepositoryImpl : UserRepository {
    override fun getById(accessToken: String, id: Long): User {
        TODO("Not yet implemented")
    }

    override fun getByEmail(accessToken: String, email: String): User {
        TODO("Not yet implemented")
    }

    override fun edit(accessToken: String, data: User, editedFields: Set<String>): User {
        TODO("Not yet implemented")
    }
}