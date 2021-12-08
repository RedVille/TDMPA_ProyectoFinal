package com.vampi.vampiappa.core.functional;

import java.lang.System;

/**
 * Represents a value of one of two possible types (a disjoint union).
 * Instances of [Either] are either an instance of [Left] or [Right].
 * FP Convention dictates that [Left] is used for "failure"
 * and [Right] is used for "success".
 *
 * @see Left
 * @see Right
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00020\u0003:\u0002\u0015\u0016B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0004J.\u0010\t\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00030\u000bJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00010\u000e\"\u0004\b\u0002\u0010\u00012\u0006\u0010\u000f\u001a\u0002H\u0001\u00a2\u0006\u0002\u0010\u0010J\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0012\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0013\u001a\u0002H\u0002\u00a2\u0006\u0002\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\u0007\u0082\u0001\u0002\u000e\u0012\u00a8\u0006\u0017"}, d2 = {"Lcom/vampi/vampiappa/core/functional/Either;", "L", "R", "", "()V", "isLeft", "", "()Z", "isRight", "fold", "fnL", "Lkotlin/Function1;", "fnR", "left", "Lcom/vampi/vampiappa/core/functional/Either$Left;", "a", "(Ljava/lang/Object;)Lcom/vampi/vampiappa/core/functional/Either$Left;", "right", "Lcom/vampi/vampiappa/core/functional/Either$Right;", "b", "(Ljava/lang/Object;)Lcom/vampi/vampiappa/core/functional/Either$Right;", "Left", "Right", "VampiAppA_v1(1.0)_devDebug"})
public abstract class Either<L extends java.lang.Object, R extends java.lang.Object> {
    
    private Either() {
        super();
    }
    
    public final boolean isRight() {
        return false;
    }
    
    public final boolean isLeft() {
        return false;
    }
    
    /**
     * Creates a Left type.
     * @see Left
     */
    @org.jetbrains.annotations.NotNull()
    public final <L extends java.lang.Object>com.vampi.vampiappa.core.functional.Either.Left<L> left(L a) {
        return null;
    }
    
    /**
     * Creates a Left type.
     * @see Right
     */
    @org.jetbrains.annotations.NotNull()
    public final <R extends java.lang.Object>com.vampi.vampiappa.core.functional.Either.Right<R> right(R b) {
        return null;
    }
    
    /**
     * Applies fnL if this is a Left or fnR if this is a Right.
     * @see Left
     * @see Right
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object fold(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super L, ? extends java.lang.Object> fnL, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super R, ? extends java.lang.Object> fnR) {
        return null;
    }
    
    /**
     * * Represents the left side of [Either] class which by convention is a "Failure".
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0002\u0010\u0001 \u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00030\u0002B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0002\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\t\u001a\u00028\u0002H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u0002H\u00c6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0013\u0010\u0004\u001a\u00028\u0002\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"Lcom/vampi/vampiappa/core/functional/Either$Left;", "L", "Lcom/vampi/vampiappa/core/functional/Either;", "", "a", "(Ljava/lang/Object;)V", "getA", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/vampi/vampiappa/core/functional/Either$Left;", "equals", "", "other", "", "hashCode", "", "toString", "", "VampiAppA_v1(1.0)_devDebug"})
    public static final class Left<L extends java.lang.Object> extends com.vampi.vampiappa.core.functional.Either {
        private final L a = null;
        
        /**
         * * Represents the left side of [Either] class which by convention is a "Failure".
         */
        @org.jetbrains.annotations.NotNull()
        public final com.vampi.vampiappa.core.functional.Either.Left<L> copy(L a) {
            return null;
        }
        
        /**
         * * Represents the left side of [Either] class which by convention is a "Failure".
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * * Represents the left side of [Either] class which by convention is a "Failure".
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * * Represents the left side of [Either] class which by convention is a "Failure".
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Left(L a) {
            super();
        }
        
        public final L component1() {
            return null;
        }
        
        public final L getA() {
            return null;
        }
    }
    
    /**
     * * Represents the right side of [Either] class which by convention is a "Success".
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0002\u0010\u0001 \u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0002\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\t\u001a\u00028\u0002H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u0002H\u00c6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0013\u0010\u0004\u001a\u00028\u0002\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"Lcom/vampi/vampiappa/core/functional/Either$Right;", "R", "Lcom/vampi/vampiappa/core/functional/Either;", "", "b", "(Ljava/lang/Object;)V", "getB", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/vampi/vampiappa/core/functional/Either$Right;", "equals", "", "other", "", "hashCode", "", "toString", "", "VampiAppA_v1(1.0)_devDebug"})
    public static final class Right<R extends java.lang.Object> extends com.vampi.vampiappa.core.functional.Either {
        private final R b = null;
        
        /**
         * * Represents the right side of [Either] class which by convention is a "Success".
         */
        @org.jetbrains.annotations.NotNull()
        public final com.vampi.vampiappa.core.functional.Either.Right<R> copy(R b) {
            return null;
        }
        
        /**
         * * Represents the right side of [Either] class which by convention is a "Success".
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * * Represents the right side of [Either] class which by convention is a "Success".
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * * Represents the right side of [Either] class which by convention is a "Success".
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Right(R b) {
            super();
        }
        
        public final R component1() {
            return null;
        }
        
        public final R getB() {
            return null;
        }
    }
}