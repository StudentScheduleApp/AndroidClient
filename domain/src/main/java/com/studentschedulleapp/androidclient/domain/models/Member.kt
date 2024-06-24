package com.studentschedulleapp.androidclient.domain.models;

data class Member (
    var id: Long,
    var groupId: Long,
    var userId: Long,
    var roles: List<MemberRole>
)
