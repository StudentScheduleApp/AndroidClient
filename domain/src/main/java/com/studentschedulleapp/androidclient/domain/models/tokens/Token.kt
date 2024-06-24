package com.studentschedulleapp.androidclient.domain.models.tokens;

data class Token (
    var userId: Long,
    var type: TokenType,
    var token: String,
    var validity: Long
)
