package com.vampi.vampiappa.domain.model;

import android.os.Parcelable;
import com.squareup.moshi.JsonClass;
import kotlinx.parcelize.Parcelize;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\fJ\t\u0010!\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010R\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010\u00a8\u0006\'"}, d2 = {"Lcom/vampi/vampiappa/domain/model/Usuario;", "Landroid/os/Parcelable;", "matricula", "", "nombre", "", "apPaterno", "apMaterno", "correo", "contrasena", "foto", "tipo", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApMaterno", "()Ljava/lang/String;", "setApMaterno", "(Ljava/lang/String;)V", "getApPaterno", "setApPaterno", "getContrasena", "setContrasena", "getCorreo", "setCorreo", "getFoto", "setFoto", "getMatricula", "()I", "setMatricula", "(I)V", "getNombre", "setNombre", "getTipo", "setTipo", "describeContents", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "VampiAppA_v1(1.0)_devDebug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class Usuario implements android.os.Parcelable {
    private int matricula;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String nombre;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String apPaterno;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String apMaterno;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String correo;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String contrasena;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String foto;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String tipo;
    public static final android.os.Parcelable.Creator<com.vampi.vampiappa.domain.model.Usuario> CREATOR = null;
    
    public Usuario() {
        super();
    }
    
    public Usuario(int matricula, @org.jetbrains.annotations.NotNull()
    java.lang.String nombre, @org.jetbrains.annotations.NotNull()
    java.lang.String apPaterno, @org.jetbrains.annotations.NotNull()
    java.lang.String apMaterno, @org.jetbrains.annotations.NotNull()
    java.lang.String correo, @org.jetbrains.annotations.NotNull()
    java.lang.String contrasena, @org.jetbrains.annotations.NotNull()
    java.lang.String foto, @org.jetbrains.annotations.NotNull()
    java.lang.String tipo) {
        super();
    }
    
    public final int getMatricula() {
        return 0;
    }
    
    public final void setMatricula(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNombre() {
        return null;
    }
    
    public final void setNombre(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getApPaterno() {
        return null;
    }
    
    public final void setApPaterno(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getApMaterno() {
        return null;
    }
    
    public final void setApMaterno(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCorreo() {
        return null;
    }
    
    public final void setCorreo(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getContrasena() {
        return null;
    }
    
    public final void setContrasena(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFoto() {
        return null;
    }
    
    public final void setFoto(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTipo() {
        return null;
    }
    
    public final void setTipo(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.vampi.vampiappa.domain.model.Usuario> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.vampi.vampiappa.domain.model.Usuario createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.vampi.vampiappa.domain.model.Usuario[] newArray(int size) {
            return null;
        }
    }
}