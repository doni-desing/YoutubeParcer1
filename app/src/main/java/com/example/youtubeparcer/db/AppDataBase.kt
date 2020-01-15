package com.example.youtubeparcer.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.youtubeparcer.model.DetailPlaylistModel
import com.example.youtubeparcer.model.DetailVideoModel
import com.example.youtubeparcer.model.PlaylistModel

@Database(
    entities = [
        PlaylistModel::class,
        DetailVideoModel::class,
        DetailPlaylistModel::class],
    version = 4, exportSchema = false
)


abstract class AppDataBase : RoomDatabase() {
    abstract fun ytVideoDao(): YoutubeDao
}