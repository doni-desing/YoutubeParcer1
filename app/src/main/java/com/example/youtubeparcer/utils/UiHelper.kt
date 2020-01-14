package com.example.youtubeparcer.utils

import android.content.Context
import android.widget.Toast

/**
 * Created by Karukes Sergey on
 */
class UiHelper  {
    fun showToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }
}