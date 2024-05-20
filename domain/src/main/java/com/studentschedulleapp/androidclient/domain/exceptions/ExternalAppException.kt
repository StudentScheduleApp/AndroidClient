package com.studentschedulleapp.androidclient.domain.exceptions

import java.lang.Exception

class ExternalAppException : Exception {
    constructor() : super()
    constructor(message: String) : super(message)
}