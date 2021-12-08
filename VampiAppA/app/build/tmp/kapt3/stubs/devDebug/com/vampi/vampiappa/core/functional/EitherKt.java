package com.vampi.vampiappa.core.functional;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u001aH\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0004\"\u0004\b\u0002\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00030\u0001\u001aT\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\t0\u0007\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\b\"\u0004\b\u0002\u0010\n*\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\n0\u00072\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u0002H\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\t0\u00070\u0001\u001a/\u0010\f\u001a\u0002H\n\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\n*\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\n0\u00072\u0006\u0010\r\u001a\u0002H\n\u00a2\u0006\u0002\u0010\u000e\u001a\'\u0010\u000f\u001a\u0002H\n\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\n*\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\n0\u0007\u00a2\u0006\u0002\u0010\u0010\u001a/\u0010\u0011\u001a\u0002H\b\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\n*\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\n0\u00072\u0006\u0010\r\u001a\u0002H\b\u00a2\u0006\u0002\u0010\u000e\u001a\'\u0010\u0012\u001a\u0002H\b\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\n*\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\n0\u0007\u00a2\u0006\u0002\u0010\u0010\u001aH\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\t0\u0007\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\b\"\u0004\b\u0002\u0010\n*\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\n0\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u0002H\t0\u0001\u00a8\u0006\u0014"}, d2 = {"c", "Lkotlin/Function1;", "A", "C", "B", "f", "flatMap", "Lcom/vampi/vampiappa/core/functional/Either;", "L", "T", "R", "fn", "getOrElse", "value", "(Lcom/vampi/vampiappa/core/functional/Either;Ljava/lang/Object;)Ljava/lang/Object;", "getOrThrow", "(Lcom/vampi/vampiappa/core/functional/Either;)Ljava/lang/Object;", "leftOrElse", "leftOrThrow", "map", "VampiAppA_v1(1.0)_devDebug"})
public final class EitherKt {
    
    /**
     * Composes 2 functions
     * See <a href="https://proandroiddev.com/kotlins-nothing-type-946de7d464fb">Credits to Alex Hart.</a>
     */
    @org.jetbrains.annotations.NotNull()
    public static final <A extends java.lang.Object, B extends java.lang.Object, C extends java.lang.Object>kotlin.jvm.functions.Function1<A, C> c(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super A, ? extends B> $this$c, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super B, ? extends C> f) {
        return null;
    }
    
    /**
     * Right-biased flatMap() FP convention which means that Right is assumed to be the default case
     * to operate on. If it is Left, operations like map, flatMap, ... return the Left value unchanged.
     */
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object, L extends java.lang.Object, R extends java.lang.Object>com.vampi.vampiappa.core.functional.Either<L, T> flatMap(@org.jetbrains.annotations.NotNull()
    com.vampi.vampiappa.core.functional.Either<? extends L, ? extends R> $this$flatMap, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super R, ? extends com.vampi.vampiappa.core.functional.Either<? extends L, ? extends T>> fn) {
        return null;
    }
    
    /**
     * Right-biased map() FP convention which means that Right is assumed to be the default case
     * to operate on. If it is Left, operations like map, flatMap, ... return the Left value unchanged.
     */
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object, L extends java.lang.Object, R extends java.lang.Object>com.vampi.vampiappa.core.functional.Either<L, T> map(@org.jetbrains.annotations.NotNull()
    com.vampi.vampiappa.core.functional.Either<? extends L, ? extends R> $this$map, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super R, ? extends T> fn) {
        return null;
    }
    
    /**
     * Returns the value from this `Right` or the given argument if this is a `Left`.
     * Right(12).getOrElse(17) RETURNS 12 and Left(12).getOrElse(17) RETURNS 17
     */
    public static final <L extends java.lang.Object, R extends java.lang.Object>R getOrElse(@org.jetbrains.annotations.NotNull()
    com.vampi.vampiappa.core.functional.Either<? extends L, ? extends R> $this$getOrElse, R value) {
        return null;
    }
    
    public static final <L extends java.lang.Object, R extends java.lang.Object>R getOrThrow(@org.jetbrains.annotations.NotNull()
    com.vampi.vampiappa.core.functional.Either<? extends L, ? extends R> $this$getOrThrow) {
        return null;
    }
    
    public static final <L extends java.lang.Object, R extends java.lang.Object>L leftOrElse(@org.jetbrains.annotations.NotNull()
    com.vampi.vampiappa.core.functional.Either<? extends L, ? extends R> $this$leftOrElse, L value) {
        return null;
    }
    
    public static final <L extends java.lang.Object, R extends java.lang.Object>L leftOrThrow(@org.jetbrains.annotations.NotNull()
    com.vampi.vampiappa.core.functional.Either<? extends L, ? extends R> $this$leftOrThrow) {
        return null;
    }
}