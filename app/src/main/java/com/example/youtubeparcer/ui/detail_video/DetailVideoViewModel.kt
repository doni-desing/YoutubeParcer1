package com.example.youtubeparcer.ui.detail_video

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.youtubeparcer.model.DetailVideoModel
import com.example.youtubeparcer.repository.MainRepository
import com.example.youtubeparcer.utils.App

class DetailVideoViewModel : ViewModel() {

    val database = App().getDatabase().ytVideoDao()
    fun getVideoData(id: String) : LiveData<DetailVideoModel>? {
        return MainRepository.fetchVideoData(id)
    }

    suspend fun getDataBase(): DetailVideoModel {
        return database.insertDetailVideo()
    }
}