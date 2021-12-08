package com.vampi.vampiappa.core.presentation;

import com.vampi.vampiappa.core.exception.Failure;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/vampi/vampiappa/core/presentation/OnFailure;", "", "handleFailure", "", "failure", "Lcom/vampi/vampiappa/core/exception/Failure;", "VampiAppA_v1(1.0)_devDebug"})
public abstract interface OnFailure {
    
    public abstract void handleFailure(@org.jetbrains.annotations.Nullable()
    com.vampi.vampiappa.core.exception.Failure failure);
}