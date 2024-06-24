package com.studentschedulleapp.androidclient.data.sqlite

import android.content.ContentValues
import android.content.Context
import android.provider.BaseColumns
import com.studentschedulleapp.androidclient.domain.models.tokens.Token
import com.studentschedulleapp.androidclient.domain.models.tokens.TokenType


class RefreshTokenDBManager(context: Context) {
    private val dbHelper = DBHelper(context)

    fun getTokens(): List<Token> {
        val db = dbHelper.readableDatabase
        val cursor = db.rawQuery("SELECT * FROM ${RefreshTokenConfig.Entry.TABLE_NAME}", null)
        val result = ArrayList<Token>()
        with(cursor) {
            while (moveToNext()) {
                result.add(
                    Token(
                        cursor.getLong(getColumnIndexOrThrow(RefreshTokenConfig.Entry.COL_USER_ID)),
                        TokenType.REFRESH,
                        cursor.getString(getColumnIndexOrThrow(RefreshTokenConfig.Entry.COL_TOKEN)),
                        cursor.getLong(getColumnIndexOrThrow(RefreshTokenConfig.Entry.COL_VALIDITY)),
                    )
                )
            }
        }
        cursor.close()
        db.close()
        return result
    }
    fun deleteTokenById(id: Int) {
        val db = dbHelper.writableDatabase
        val selection = "${BaseColumns._ID} = ?"
        val selectionArgs = arrayOf(id.toString())
        db.delete(RefreshTokenConfig.Entry.TABLE_NAME, selection, selectionArgs)
        db.close()
    }
    fun clear(){
        val db = dbHelper.writableDatabase
        db.execSQL("delete from ${RefreshTokenConfig.Entry.TABLE_NAME}")
        db.close()
    }
    fun saveToken(token: Token) {
        val db = dbHelper.writableDatabase
        val values = ContentValues().apply {
            put(RefreshTokenConfig.Entry.COL_USER_ID, token.userId)
            put(RefreshTokenConfig.Entry.COL_TOKEN, token.token)
            put(RefreshTokenConfig.Entry.COL_VALIDITY, token.validity)
        }
        db.insert(RefreshTokenConfig.Entry.TABLE_NAME, null, values)
        db.close()
    }

}