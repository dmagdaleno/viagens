package com.dmagdaleno.viagens.extensions

import android.content.Context
import android.graphics.drawable.Drawable

fun Context.getDrawableResource(path: String): Drawable? {
    val id = resources.getIdentifier(path, "drawable", packageName)
    return getDrawable(id)
}