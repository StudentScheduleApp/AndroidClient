package com.studentschedulleapp.androidclient.domain.exceptions

import java.lang.Exception

class EntityNotFoundException : Exception {
    constructor() : super()
    constructor(message: String) : super(message)
}