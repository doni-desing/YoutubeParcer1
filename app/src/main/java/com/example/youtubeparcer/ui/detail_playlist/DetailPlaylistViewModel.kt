package com.example.youtubeparcer.ui.detail_playlist

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.youtubeparcer.model.DetailPlaylistModel
import com.example.youtubeparcer.model.PlaylistModel
import com.example.youtubeparcer.repository.MainRepository
import com.example.youtubeparcer.utils.App
import kotlinx.coroutines.launch

class DetailPlaylistViewModel : ViewModel(){

    val db = App().getInstance().getDatabase()

    fun fetchDetailPlaylistData(id: String): LiveData<DetailPlaylistModel>? {
        return MainRepository.fetchYoutubeDetailPlaylistData(id)

    }
    suspend fun getDetailPlaylistData(): List<DetailPlaylistModel>? {
        return db.ytVideoDao().getDetailPlaylist()
    }

    fun insertDetailPlaylistData(model: DetailPlaylistModel) {
        viewModelScope.launch {
            db.ytVideoDao().insertDetailPlaylistData(model)
        }
    }
}