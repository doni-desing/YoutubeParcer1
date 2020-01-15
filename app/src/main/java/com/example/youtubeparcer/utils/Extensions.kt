package com.example.youtubeparcer.utils

import android.view.View
import androidx.room.Room

fun View.isShow(isVisible: Boolean) {
    this.visibility = if (isVisible) View.VISIBLE else View.GONE
}


