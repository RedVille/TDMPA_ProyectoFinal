package com.vampi.vampiappm.core.presentation

import com.vampi.vampiappm.core.exception.Failure

interface OnFailure {

    fun handleFailure(failure: Failure?)

}