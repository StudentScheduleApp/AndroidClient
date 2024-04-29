package com.studentschedulleapp.androidclient.data.api

import com.studentschedulleapp.androidclient.BuildConfig

object API{

    val BASE_URL = BuildConfig.secrets["API.BASE_URL"].toString()
    val TOKEN = BuildConfig.secrets["API.TOKEN"].toString()
}

object AUTH{

    val REGISTER_PATH = BuildConfig.secrets["AUTH.REGISTER_PATH"].toString()
    val VERIFY_PATH = BuildConfig.secrets["AUTH.VERIFY_PATH"].toString()
    val REFRESH_PATH = BuildConfig.secrets["AUTH.REFRESH_PATH"].toString()
    val LOGIN_PATH = BuildConfig.secrets["AUTH.LOGIN_PATH"].toString()
}
object USER{

    val ID_PATH = BuildConfig.secrets["USER.ID_PATH"].toString()
    val EDIT_PATH = BuildConfig.secrets["USER.EDIT_PATH"].toString()
}
object MEMBER{

    val ID_PATH = BuildConfig.secrets["MEMBER.ID_PATH"].toString()
    val GROUP_PATH = BuildConfig.secrets["MEMBER.GROUP_PATH"].toString()
    val USER_PATH = BuildConfig.secrets["MEMBER.USER_PATH"].toString()
    val EDIT_PATH = BuildConfig.secrets["MEMBER.EDIT_PATH"].toString()
    val CREATE_PATH = BuildConfig.secrets["MEMBER.CREATE_PATH"].toString()
    val DELETE_PATH = BuildConfig.secrets["MEMBER.DELETE_PATH"].toString()
}

object GROUP{

    val ID_PATH = BuildConfig.secrets["GROUP.ID_PATH"].toString()
    val CREATE_PATH = BuildConfig.secrets["GROUP.CREATE_PATH"].toString()
    val EDIT_PATH = BuildConfig.secrets["GROUP.EDIT_PATH"].toString()
    val DELETE_PATH = BuildConfig.secrets["GROUP.DELETE_PATH"].toString()
}
object OUTLINE{

    val ID_PATH = BuildConfig.secrets["OUTLINE.ID_PATH"].toString()
    val CREATE_PATH = BuildConfig.secrets["OUTLINE.CREATE_PATH"].toString()
    val EDIT_PATH = BuildConfig.secrets["OUTLINE.EDIT_PATH"].toString()
    val DELETE_PATH = BuildConfig.secrets["OUTLINE.DELETE_PATH"].toString()
    val SPECIFIC_LESSON_PATH = BuildConfig.secrets["OUTLINE.SPECIFIC_LESSON_PATH"].toString()
    val USER_PATH = BuildConfig.secrets["OUTLINE.USER_PATH"].toString()
}
object SCHEDULE_TEMPLATE{

    val ID_PATH = BuildConfig.secrets["SCHEDULE_TEMPLATE.ID_PATH"].toString()
    val GROUP_PATH = BuildConfig.secrets["SCHEDULE_TEMPLATE.GROUP_PATH"].toString()
    val DELETE_PATH = BuildConfig.secrets["SCHEDULE_TEMPLATE.DELETE_PATH"].toString()
    val CREATE_PATH = BuildConfig.secrets["SCHEDULE_TEMPLATE.CREATE_PATH"].toString()
    val EDIT_PATH = BuildConfig.secrets["SCHEDULE_TEMPLATE.EDIT_PATH"].toString()
}
object SPECIFIC_LESSON{

    val ID_PATH = BuildConfig.secrets["SPECIFIC_LESSON.ID_PATH"].toString()
    val GROUP_PATH = BuildConfig.secrets["SPECIFIC_LESSON.GROUP_PATH"].toString()
    val CREATE_PATH = BuildConfig.secrets["SPECIFIC_LESSON.CREATE_PATH"].toString()
    val EDIT_PATH = BuildConfig.secrets["SPECIFIC_LESSON.EDIT_PATH"].toString()

}
object OUTLINE_MEDIA{

    val ID_PATH = BuildConfig.secrets["OUTLINE_MEDIA.ID_PATH"].toString()
    val OUTLINE_PATH = BuildConfig.secrets["OUTLINE_MEDIA.OUTLINE_PATH"].toString()
    val CREATE_PATH = BuildConfig.secrets["OUTLINE_MEDIA.CREATE_PATH"].toString()
    val DELETE_PATH = BuildConfig.secrets["OUTLINE_MEDIA.DELETE_PATH"].toString()
    val EDIT_PATH = BuildConfig.secrets["OUTLINE_MEDIA.EDIT_PATH"].toString()
}
object OUTLINE_MEDIA_COMMENT{

    val ID_PATH = BuildConfig.secrets["OUTLINE_MEDIA_COMMENT.ID_PATH"].toString()
    val OUTLINE_MEDIA_PATH = BuildConfig.secrets["OUTLINE_MEDIA_COMMENT.OUTLINE_MEDIA_PATH"].toString()
    val CREATE_PATH = BuildConfig.secrets["OUTLINE_MEDIA_COMMENT.CREATE_PATH"].toString()
    val EDIT_PATH = BuildConfig.secrets["OUTLINE_MEDIA_COMMENT.EDIT_PATH"].toString()
    val DELETE_PATH = BuildConfig.secrets["OUTLINE_MEDIA_COMMENT.DELETE_PATH"].toString()
}
object LESSON_TEMPLATE{

    val ID_PATH = BuildConfig.secrets["LESSON_TEMPLATE.ID_PATH"].toString()
    val SCHEDULE_TEMPLATE_PATH = BuildConfig.secrets["LESSON_TEMPLATE.SCHEDULE_TEMPLATE_PATH"].toString()
    val CREATE_PATH = BuildConfig.secrets["LESSON_TEMPLATE.CREATE_PATH"].toString()
    val EDIT_PATH = BuildConfig.secrets["LESSON_TEMPLATE.EDIT_PATH"].toString()
    val DELETE_PATH = BuildConfig.secrets["LESSON_TEMPLATE.DELETE_PATH"].toString()
}
object CUSTOM_LESSON{

    val ID_PATH = BuildConfig.secrets["CUSTOM_LESSON.ID_PATH"].toString()
    val GROUP_PATH = BuildConfig.secrets["CUSTOM_LESSON.GROUP_PATH"].toString()
    val CREATE_PATH = BuildConfig.secrets["CUSTOM_LESSON.CREATE_PATH"].toString()
    val EDIT_PATH = BuildConfig.secrets["CUSTOM_LESSON.EDIT_PATH"].toString()
    val DELETE_PATH = BuildConfig.secrets["CUSTOM_LESSON.DELETE_PATH"].toString()

}
