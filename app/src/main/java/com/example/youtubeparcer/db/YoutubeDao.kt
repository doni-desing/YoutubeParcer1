package com.example.youtubeparcer.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.youtubeparcer.model.DetailPlaylistModel
import com.example.youtubeparcer.model.DetailVideoModel
import com.example.youtubeparcer.model.PlaylistModel

@Dao
interface YoutubeDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun  insertAllPlaylist(items: PlaylistModel)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllPlayList(items: PlaylistModel)

    @Query("SELECT * FROM play_list")
    suspend fun getALLPlayList(): PlaylistModel

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDetailPlaylistData(items: DetailPlaylistModel)

    @Query("SELECT * FROM detail_playlist")
    suspend fun getDetailPlaylist(): List<DetailPlaylistModel>?

    @Query("SELECT * FROM detail_video")
    suspend fun insertDetailVideo(): DetailVideoModel

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDetailVideoPlaylistData(items: DetailVideoModel)


}