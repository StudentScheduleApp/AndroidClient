package com.studentschedulleapp.androidclient.domain.exceptions

import java.lang.Exception

class InvalidCredentialsException : Exception {
    constructor() : super()
    constructor(message: String) : super(message)
}