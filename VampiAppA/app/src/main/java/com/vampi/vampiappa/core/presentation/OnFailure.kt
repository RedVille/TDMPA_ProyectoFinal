package com.vampi.vampiappa.core.presentation

import com.vampi.vampiappa.core.exception.Failure

interface OnFailure {

    fun handleFailure(failure: Failure?)

}