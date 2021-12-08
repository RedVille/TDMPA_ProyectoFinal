package com.vampi.vampiappa.core.exception;

import androidx.annotation.StringRes;
import com.vampi.vampiappa.R;
import com.vampi.vampiappa.core.exception.Failure.FeatureFailure;

/**
 * Base Class for handling errors/failures/exceptions.
 * Every feature specific failure should extend [FeatureFailure] class.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\t\n\u000b\u00a8\u0006\f"}, d2 = {"Lcom/vampi/vampiappa/core/exception/Failure;", "", "()V", "DatabaseError", "FeatureFailure", "NetworkConnection", "ServerError", "SilenceFail", "Unauthorized", "Lcom/vampi/vampiappa/core/exception/Failure$ServerError;", "Lcom/vampi/vampiappa/core/exception/Failure$SilenceFail;", "Lcom/vampi/vampiappa/core/exception/Failure$FeatureFailure;", "VampiAppA_v1(1.0)_devDebug"})
public abstract class Failure extends java.lang.Throwable {
    
    private Failure() {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J+\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lcom/vampi/vampiappa/core/exception/Failure$ServerError;", "Lcom/vampi/vampiappa/core/exception/Failure;", "code", "", "serverMessage", "", "payload", "(ILjava/lang/String;Ljava/lang/String;)V", "getCode", "()I", "getPayload", "()Ljava/lang/String;", "getServerMessage", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "VampiAppA_v1(1.0)_devDebug"})
    public static final class ServerError extends com.vampi.vampiappa.core.exception.Failure {
        private final int code = 0;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String serverMessage = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String payload = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.vampi.vampiappa.core.exception.Failure.ServerError copy(int code, @org.jetbrains.annotations.Nullable()
        java.lang.String serverMessage, @org.jetbrains.annotations.Nullable()
        java.lang.String payload) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public ServerError(int code, @org.jetbrains.annotations.Nullable()
        java.lang.String serverMessage, @org.jetbrains.annotations.Nullable()
        java.lang.String payload) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getServerMessage() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPayload() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/vampi/vampiappa/core/exception/Failure$NetworkConnection;", "Lcom/vampi/vampiappa/core/exception/Failure$FeatureFailure;", "()V", "VampiAppA_v1(1.0)_devDebug"})
    public static final class NetworkConnection extends com.vampi.vampiappa.core.exception.Failure.FeatureFailure {
        @org.jetbrains.annotations.NotNull()
        public static final com.vampi.vampiappa.core.exception.Failure.NetworkConnection INSTANCE = null;
        
        private NetworkConnection() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/vampi/vampiappa/core/exception/Failure$DatabaseError;", "Lcom/vampi/vampiappa/core/exception/Failure$FeatureFailure;", "()V", "VampiAppA_v1(1.0)_devDebug"})
    public static final class DatabaseError extends com.vampi.vampiappa.core.exception.Failure.FeatureFailure {
        @org.jetbrains.annotations.NotNull()
        public static final com.vampi.vampiappa.core.exception.Failure.DatabaseError INSTANCE = null;
        
        private DatabaseError() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/vampi/vampiappa/core/exception/Failure$Unauthorized;", "Lcom/vampi/vampiappa/core/exception/Failure$FeatureFailure;", "()V", "VampiAppA_v1(1.0)_devDebug"})
    public static final class Unauthorized extends com.vampi.vampiappa.core.exception.Failure.FeatureFailure {
        @org.jetbrains.annotations.NotNull()
        public static final com.vampi.vampiappa.core.exception.Failure.Unauthorized INSTANCE = null;
        
        private Unauthorized() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/vampi/vampiappa/core/exception/Failure$SilenceFail;", "Lcom/vampi/vampiappa/core/exception/Failure;", "()V", "VampiAppA_v1(1.0)_devDebug"})
    public static final class SilenceFail extends com.vampi.vampiappa.core.exception.Failure {
        @org.jetbrains.annotations.NotNull()
        public static final com.vampi.vampiappa.core.exception.Failure.SilenceFail INSTANCE = null;
        
        private SilenceFail() {
            super();
        }
    }
    
    /**
     * * Extend this class for feature specific failures.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lcom/vampi/vampiappa/core/exception/Failure$FeatureFailure;", "Lcom/vampi/vampiappa/core/exception/Failure;", "defaultMessage", "", "(Ljava/lang/Integer;)V", "getDefaultMessage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "VampiAppA_v1(1.0)_devDebug"})
    public static abstract class FeatureFailure extends com.vampi.vampiappa.core.exception.Failure {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer defaultMessage = null;
        
        public FeatureFailure() {
            super();
        }
        
        public FeatureFailure(@org.jetbrains.annotations.Nullable()
        @androidx.annotation.StringRes()
        java.lang.Integer defaultMessage) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getDefaultMessage() {
            return null;
        }
    }
}