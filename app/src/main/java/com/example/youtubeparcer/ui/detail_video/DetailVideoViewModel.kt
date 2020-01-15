package com.example.youtubeparcer.ui.detail_video

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.youtubeparcer.model.DetailPlaylistModel
import com.example.youtubeparcer.model.DetailVideoModel
import com.example.youtubeparcer.repository.MainRepository
import com.example.youtubeparcer.utils.App
import kotlinx.coroutines.launch

class DetailVideoViewModel : ViewModel() {

    val db = App().getInstance().getDatabase()
    fun getVideoData(id: String) : LiveData<DetailVideoModel>? {
        return MainRepository.fetchVideoData(id)

    }

    suspend fun getDetailVideoPlaylistData(): List<DetailVideoModel>? {
        return db.ytVideoDao().getDetailVideoPlaylist()
    }

    fun insertDetailPlaylistData(model: DetailVideoModel) {
        viewModelScope.launch {
            db.ytVideoDao().insertDetailVideoPlaylistData(model)
        }
    }
}