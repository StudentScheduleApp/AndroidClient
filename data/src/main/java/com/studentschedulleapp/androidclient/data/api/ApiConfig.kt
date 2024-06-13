package com.studentschedulleapp.androidclient.data.api

import com.studentschedulleapp.androidclient.BuildConfig

object API{

    val GATEWAY_URL = BuildConfig.secrets["API.GATEWAY_URL"].toString()
    val TOKEN = BuildConfig.secrets["API.TOKEN"].toString()
}

object AUTH{

    const val REGISTER_PATH = "/auth/register/"
    const val VERIFY_PATH = "/auth/verify/"
    const val REFRESH_PATH = "/auth/refresh/"
    const val LOGIN_PATH = "/auth/login/"
}
object USER{

    const val ID_PATH = "/users/id/"
    const val EMAIL_PATH = "/users/email/"
    const val EDIT_PATH = "/users/edit/"
    const val CREATE_PATH = "/members/create/"
    const val DELETE_PATH = "/members/delete/"
}
object MEMBER{

    const val ID_PATH = "/members/id/"
    const val GROUP_PATH = "/members/group/"
    const val USER_PATH = "/members/user/"
    const val EDIT_PATH = "/members/edit/"
    const val CREATE_PATH = "/members/create/"
    const val DELETE_PATH = "/members/delete/"
}

object GROUP{

    const val ID_PATH = "/groups/id/"
    const val CREATE_PATH = "/groups/create/"
    const val EDIT_PATH = "/groups/edit/"
    const val DELETE_PATH = "/groups/delete/"
}
object OUTLINE{

    const val ID_PATH = "/outlines/id/"
    const val CREATE_PATH = "/outlines/create/"
    const val EDIT_PATH = "/outlines/edit/"
    const val DELETE_PATH = "/outlines/delete/"
    const val SPECIFIC_LESSON_PATH = "/outlines/specificLesson/"
    const val USER_PATH = "/outlines/user/"
}
object SCHEDULE_TEMPLATE{

    const val ID_PATH = "/scheduleTemplates/id/"
    const val GROUP_PATH = "/scheduleTemplates/group/"
    const val DELETE_PATH = "/scheduleTemplates/delete/"
    const val CREATE_PATH = "/scheduleTemplates/create/"
    const val EDIT_PATH = "/scheduleTemplates/edit/"
}
object SPECIFIC_LESSON{

    const val ID_PATH = "/specificLesson/id/"
    const val GROUP_PATH = "/specificLesson/group/"
    const val CREATE_PATH = "/specificLesson/create/"
    const val EDIT_PATH = "/specificLesson/edit/"
    const val DELETE_PATH = "/specificLesson/delete/"

}
object OUTLINE_MEDIA{

    const val ID_PATH =  "/outlineMedias/id/"
    const val OUTLINE_PATH =  "/outlineMedias/outline/"
    const val CREATE_PATH =  "/outlineMedias/create/"
    const val DELETE_PATH =  "/outlineMedias/delete/"
    const val EDIT_PATH =  "/outlineMedias/edit/"
}
object OUTLINE_MEDIA_COMMENT{

    const val ID_PATH = "/outlineMediaComments/id/"
    const val OUTLINE_MEDIA_PATH = "/outlineMediaComments/outlineMedia/"
    const val CREATE_PATH = "/outlineMediaComments/create/"
    const val EDIT_PATH = "/outlineMediaComments/edit/"
    const val DELETE_PATH = "/outlineMediaComments/delete/"
}
object LESSON_TEMPLATE{

    const val ID_PATH = "/lessonTemplates/id/"
    const val SCHEDULE_TEMPLATE_PATH = "/lessonTemplates/scheduleTemplate/"
    const val CREATE_PATH = "/lessonTemplates/create/"
    const val EDIT_PATH = "/lessonTemplates/edit/"
    const val DELETE_PATH = "/lessonTemplates/delete/"
}
object CUSTOM_LESSON{

    const val ID_PATH = "/customLessons/id/"
    const val GROUP_PATH = "/customLessons/group/"
    const val CREATE_PATH = "/customLessons/create/"
    const val EDIT_PATH = "/customLessons/edit/"
    const val DELETE_PATH = "/customLessons/delete/"

}
