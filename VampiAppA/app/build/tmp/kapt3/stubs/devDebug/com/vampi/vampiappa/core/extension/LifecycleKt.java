package com.vampi.vampiappa.core.extension;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.vampi.vampiappa.core.exception.Failure;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u001a=\u0010\u0000\u001a\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00010\b\u00a2\u0006\u0002\u0010\t\u001aG\u0010\n\u001a\u00020\u0001\"\b\b\u0000\u0010\u000b*\u00020\f\"\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u000b0\u0003*\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u0001H\u000b\u0012\u0004\u0012\u00020\u00010\b\u00a2\u0006\u0002\u0010\t\u001a\u001e\u0010\r\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u000b*\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u000f\u00a8\u0006\u0010"}, d2 = {"failure", "", "L", "Landroidx/lifecycle/LiveData;", "Lcom/vampi/vampiappa/core/exception/Failure;", "Landroidx/lifecycle/LifecycleOwner;", "liveData", "body", "Lkotlin/Function1;", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/LiveData;Lkotlin/jvm/functions/Function1;)V", "observe", "T", "", "removeObservers", "liveDataList", "", "VampiAppA_v1(1.0)_devDebug"})
public final class LifecycleKt {
    
    public static final <T extends java.lang.Object, L extends androidx.lifecycle.LiveData<T>>void observe(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner $this$observe, @org.jetbrains.annotations.NotNull()
    L liveData, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> body) {
    }
    
    public static final <L extends androidx.lifecycle.LiveData<com.vampi.vampiappa.core.exception.Failure>>void failure(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner $this$failure, @org.jetbrains.annotations.NotNull()
    L liveData, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.vampi.vampiappa.core.exception.Failure, kotlin.Unit> body) {
    }
    
    public static final <T extends java.lang.Object>void removeObservers(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner $this$removeObservers, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> liveDataList) {
    }
}