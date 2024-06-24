package com.studentschedulleapp.androidclient.domain.models;

data class ScheduleTemplate (
    var id: Long,
    var groupId: Long,
    var name: String,
    var timeStart: Long,
    var timeStop: Long,
    var comment : String
)