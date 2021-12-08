package com.vampi.vampiappa.core.interactor;

import com.vampi.vampiappa.core.exception.Failure;
import com.vampi.vampiappa.core.functional.Either;
import kotlinx.coroutines.*;

/**
 * Abstract class for a Use Case (Interactor in terms of Clean Architecture).
 * This abstraction represents an execution unit for different use cases (this means than any use
 * case in the application should implement this contract).
 *
 * By convention each [UseCase] implementation will execute its job in a background thread
 * (kotlin coroutine) and will post the result in the UI thread.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u0002*\u0006\b\u0001\u0010\u0003 \u00002\u00020\u0002:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0004J8\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u00012 \b\u0002\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0004\u0012\u00020\u00060\tH\u0087\u0002\u00a2\u0006\u0002\u0010\fJ%\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0007\u001a\u00028\u0001H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/vampi/vampiappa/core/interactor/UseCase;", "Type", "", "Params", "()V", "invoke", "", "params", "onResult", "Lkotlin/Function1;", "Lcom/vampi/vampiappa/core/functional/Either;", "Lcom/vampi/vampiappa/core/exception/Failure;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "run", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "None", "VampiAppA_v1(1.0)_devDebug"})
public abstract class UseCase<Type extends java.lang.Object, Params extends java.lang.Object> {
    
    public UseCase() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object run(Params params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.vampi.vampiappa.core.functional.Either<? extends com.vampi.vampiappa.core.exception.Failure, ? extends Type>> continuation);
    
    @kotlinx.coroutines.DelicateCoroutinesApi()
    public final void invoke(Params params, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.vampi.vampiappa.core.functional.Either<? extends com.vampi.vampiappa.core.exception.Failure, ? extends Type>, kotlin.Unit> onResult) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/vampi/vampiappa/core/interactor/UseCase$None;", "", "()V", "VampiAppA_v1(1.0)_devDebug"})
    public static final class None {
        
        public None() {
            super();
        }
    }
}