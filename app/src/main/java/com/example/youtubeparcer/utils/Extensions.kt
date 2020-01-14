package com.example.youtubeparcer.utils

import android.view.View

fun View.isShow(isVisible: Boolean) {
    this.visibility = if (isVisible) View.VISIBLE else View.GONE
}

