package com.studentschedulleapp.androidclient.data.api.models;

data class JwtRegisterRequest (
    var email: String,
    var password: String,
    var firstName: String,
    var lastName: String
)