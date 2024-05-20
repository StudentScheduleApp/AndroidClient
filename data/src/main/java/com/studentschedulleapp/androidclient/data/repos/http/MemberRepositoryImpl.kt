package com.studentschedulleapp.androidclient.data.repos.http

import com.studentschedulleapp.androidclient.domain.models.Member
import com.studentschedulleapp.androidclient.domain.repos.MemberRepository

class MemberRepositoryImpl : MemberRepository {
    override fun getById(accessToken: String, id: Long): Member {
        TODO("Not yet implemented")
    }

    override fun getByGroupId(accessToken: String, id: Long): List<Member> {
        TODO("Not yet implemented")
    }

    override fun getByUserId(accessToken: String, id: Long): List<Member> {
        TODO("Not yet implemented")
    }

    override fun create(accessToken: String, data: Member): Member {
        TODO("Not yet implemented")
    }

    override fun edit(accessToken: String, data: Member, editedFields: Set<String>): Member {
        TODO("Not yet implemented")
    }

    override fun delete(accessToken: String, id: Long) {
        TODO("Not yet implemented")
    }
}