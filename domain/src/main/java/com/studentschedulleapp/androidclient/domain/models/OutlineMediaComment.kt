package com.studentschedulleapp.androidclient.domain.models;

data class OutlineMediaComment (
    var id: Long,
    var text: String,
    var userId: Long,
    var timestamp: Long,
    var mediaId: Long,
    var questionCommentId: Long
)