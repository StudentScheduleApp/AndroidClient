package com.studentschedulleapp.androidclient.domain.models;

data class SpecificLesson (
   var id: Long,
   var groupId: Long,
   var lessonId: Long,
   var time: Long,
   var canceled: Boolean,
   var comment: String
)