package com.vampi.vampialumno.core.presentation

import com.vampi.vampialumno.core.exception.Failure

interface OnFailure {

    fun handleFailure(failure: Failure?)

}