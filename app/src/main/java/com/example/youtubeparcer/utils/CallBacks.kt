package com.example.youtubeparcer.utils

interface CallBacks {
    fun callbackObserver(`object`: Any?)

    interface playerCallBack {
        fun onItemClickOnItem(albumId: Int)
        fun onPlayingEnd()
    }
}