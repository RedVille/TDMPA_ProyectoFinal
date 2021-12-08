package com.vampi.vampiappa.core.presentation;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.vampi.vampiappa.core.exception.Failure;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0005H\u0004R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\t\u00a8\u0006\u0010"}, d2 = {"Lcom/vampi/vampiappa/core/presentation/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "failure", "Landroidx/lifecycle/MutableLiveData;", "Lcom/vampi/vampiappa/core/exception/Failure;", "getFailure", "()Landroidx/lifecycle/MutableLiveData;", "setFailure", "(Landroidx/lifecycle/MutableLiveData;)V", "state", "Lcom/vampi/vampiappa/core/presentation/BaseViewState;", "getState", "setState", "handleFailure", "", "VampiAppA_v1(1.0)_devDebug"})
public abstract class BaseViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.vampi.vampiappa.core.presentation.BaseViewState> state;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.vampi.vampiappa.core.exception.Failure> failure;
    
    public BaseViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.vampi.vampiappa.core.presentation.BaseViewState> getState() {
        return null;
    }
    
    public final void setState(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.vampi.vampiappa.core.presentation.BaseViewState> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.vampi.vampiappa.core.exception.Failure> getFailure() {
        return null;
    }
    
    public final void setFailure(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.vampi.vampiappa.core.exception.Failure> p0) {
    }
    
    protected final void handleFailure(@org.jetbrains.annotations.NotNull()
    com.vampi.vampiappa.core.exception.Failure failure) {
    }
}