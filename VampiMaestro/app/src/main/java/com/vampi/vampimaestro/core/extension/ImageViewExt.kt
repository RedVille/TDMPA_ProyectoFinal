package com.vampi.vampimaestro.core.extension

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import coil.load
import coil.transform.CircleCropTransformation
import coil.transform.RoundedCornersTransformation
import com.vampi.vampimaestro.R


@BindingAdapter("loadFromURLCircular")
fun ImageView.loadFromURLCircular(url: String?) = url?.let {
    this.load(url) {
        crossfade(true)
        placeholder(R.drawable.ic_vampi_logo)
        error(R.drawable.ic_vampi_logo)
        transformations(CircleCropTransformation())
    }
}

@BindingAdapter("loadFromURLRounded")
fun ImageView.loadFromURLRounded(url: String) = this.load(url){
    crossfade(true)
    placeholder(R.drawable.ic_vampi_logo)
    transformations(RoundedCornersTransformation(30F))
}

@BindingAdapter("loadFromURL")
fun ImageView.loadFromURL(url: String?) = url?.let {
    this.load(url) {
        crossfade(true)
        placeholder(R.drawable.ic_vampi_logo)
        error(R.drawable.ic_vampi_logo)
    }
}
