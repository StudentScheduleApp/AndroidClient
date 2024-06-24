package com.studentschedulleapp.androidclient.domain.models;

data class User (
    var id: Long,
    var email: String,
    var password: String,
    var firstName: String,
    var lastName: String,
    var banned: Boolean,
    var avaUrl: String,
    var roles: List<Role>
)
