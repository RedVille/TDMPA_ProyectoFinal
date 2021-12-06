package com.vampi.vampiappm.core.extension

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import coil.load
import coil.transform.CircleCropTransformation
import com.vampi.vampiappm.R

@BindingAdapter("loadFromURLCircular")
fun ImageView.loadFromURLCircular(url: String?) = url?.let {
    this.load(url) {
        crossfade(true)
        placeholder(R.drawable.ic_launcher_background)
        error(R.drawable.ic_launcher_background)
        transformations(CircleCropTransformation())
    }
}

@BindingAdapter("loadFromURL")
fun ImageView.loadFromURL(url: String?) = url?.let {
    this.load(url) {
        crossfade(true)
        placeholder(R.drawable.ic_launcher_background)
        error(R.drawable.ic_launcher_background)
    }
}