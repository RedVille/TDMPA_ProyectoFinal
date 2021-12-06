package com.vampi.vampialumno.core.plataform

import android.content.Context
import android.content.SharedPreferences
//import com.vampi.vampialumno.data.dto.UserWithLikedMeals
import com.squareup.moshi.Moshi
import javax.inject.Inject


class AuthManager @Inject constructor(private val context: Context) {

    private val PREFS_KEY = "PREFS"
    private val USER_KEY = "USER"

    private var preferences: SharedPreferences =
        context.getSharedPreferences(PREFS_KEY, Context.MODE_PRIVATE)
    private val moshi = Moshi.Builder().build()

}