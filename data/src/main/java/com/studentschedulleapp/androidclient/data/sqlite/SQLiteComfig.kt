package com.studentschedulleapp.androidclient.data.sqlite

import android.provider.BaseColumns
import com.studentschedulleapp.androidclient.domain.models.tokens.TokenType

object AccessTokenConfig {
    object Entry : BaseColumns {
        const val TABLE_NAME = "access_tokens"
        const val COL_USER_ID = "user_id"
        const val COL_TOKEN = "token"
        const val COL_VALIDITY = "validity"
    }
    const val SQL_CREATE_TABLE =
        "CREATE TABLE ${Entry.TABLE_NAME} (" +
                "${BaseColumns._ID} BIGINT PRIMARY KEY," +
                "${Entry.COL_USER_ID} BIGINT," +
                "${Entry.COL_TOKEN} TEXT," +
                "${Entry.COL_VALIDITY} BIGINT)"
    const val SQL_DELETE_TABLE = "DROP TABLE IF EXISTS ${Entry.TABLE_NAME}"
}

object RefreshTokenConfig {
    object Entry : BaseColumns {
        const val TABLE_NAME = "refresh_tokens"
        const val COL_USER_ID = "user_id"
        const val COL_TOKEN = "token"
        const val COL_VALIDITY = "validity"
    }
    const val SQL_CREATE_TABLE =
        "CREATE TABLE ${AccessTokenConfig.Entry.TABLE_NAME} (" +
                "${BaseColumns._ID} BIGINT PRIMARY KEY," +
                "${AccessTokenConfig.Entry.COL_USER_ID} BIGINT," +
                "${AccessTokenConfig.Entry.COL_TOKEN} TEXT," +
                "${AccessTokenConfig.Entry.COL_VALIDITY} BIGINT)"
    const val SQL_DELETE_TABLE = "DROP TABLE IF EXISTS ${AccessTokenConfig.Entry.TABLE_NAME}"
}