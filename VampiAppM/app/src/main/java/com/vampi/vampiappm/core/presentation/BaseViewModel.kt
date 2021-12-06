package com.vampi.vampiappm.core.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.vampi.vampiappm.core.exception.Failure

abstract class BaseViewModel : ViewModel() {

    var state: MutableLiveData<BaseViewState> = MutableLiveData()
    var failure: MutableLiveData<Failure> = MutableLiveData()

    protected fun handleFailure(failure: Failure) {
        this.failure.value = failure
        state.value = BaseViewState.HideLoading
    }

}