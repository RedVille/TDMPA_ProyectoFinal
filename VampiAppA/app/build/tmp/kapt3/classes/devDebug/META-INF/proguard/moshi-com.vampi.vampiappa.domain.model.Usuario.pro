-if class com.vampi.vampiappa.domain.model.Usuario
-keepnames class com.vampi.vampiappa.domain.model.Usuario
-if class com.vampi.vampiappa.domain.model.Usuario
-keep class com.vampi.vampiappa.domain.model.UsuarioJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
-if class com.vampi.vampiappa.domain.model.Usuario
-keepnames class kotlin.jvm.internal.DefaultConstructorMarker
-if class com.vampi.vampiappa.domain.model.Usuario
-keepclassmembers class com.vampi.vampiappa.domain.model.Usuario {
    public synthetic <init>(int,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,int,kotlin.jvm.internal.DefaultConstructorMarker);
}
