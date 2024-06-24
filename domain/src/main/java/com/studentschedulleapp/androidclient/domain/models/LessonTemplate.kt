package com.studentschedulleapp.androidclient.domain.models;

data class LessonTemplate (
    var idval: Long,
    var scheduleTemplateId: Long,
    var lessonId: Long,
    var timeval: Long,
    var comment: String
)