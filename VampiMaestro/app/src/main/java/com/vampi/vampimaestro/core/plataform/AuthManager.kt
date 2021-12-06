package com.vampi.vampimaestro.core.plataform

import android.content.Context
import android.content.SharedPreferences
//import com.vampi.vampimaestro.data.dto.UserWithLikedMeals
import com.squareup.moshi.Moshi
import com.vampi.vampimaestro.domain.model.Usuario
import javax.inject.Inject

class AuthManager @Inject constructor(private val context: Context) {

    private val PREFS_KEY = "PREFS"
    private val USER_KEY = "USER"

    private var preferences: SharedPreferences =
        context.getSharedPreferences(PREFS_KEY, Context.MODE_PRIVATE)
    private val moshi = Moshi.Builder().build()

    var user: Usuario?
        set(value) = preferences.edit()
            .putString(USER_KEY, moshi.adapter(Usuario::class.java).toJson(value)).apply()
        get() = preferences.getString(USER_KEY, null)?.let {
            return@let try {
                moshi.adapter(Usuario::class.java).fromJson(it)
            } catch (e: Exception) {
                null
            }
        }

}