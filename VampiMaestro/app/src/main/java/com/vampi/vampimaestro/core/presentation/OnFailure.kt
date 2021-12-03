package com.vampi.vampimaestro.core.presentation

import com.vampi.vampimaestro.core.exception.Failure

interface OnFailure {

    fun handleFailure(failure: Failure?)

}