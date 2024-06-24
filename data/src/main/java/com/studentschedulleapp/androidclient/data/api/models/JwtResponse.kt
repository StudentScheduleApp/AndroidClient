package com.studentschedulleapp.androidclient.data.api.models;

data class JwtResponse (
    var type: String = "Bearer",
    var id: Long,
    var accessToken: String,
    var refreshToken: String,
    var accessTokenValidity: Long,
    var refreshTokenValidity: Long
)
