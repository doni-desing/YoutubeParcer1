package com.example.youtubeparcer.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.example.youtubeparcer.type_converter.PlaylistModelTypeConverter
import com.google.gson.annotations.SerializedName




@Entity(tableName = "detail_playlist")
@TypeConverters(PlaylistModelTypeConverter::class)
data class DetailPlaylistModel(

    @SerializedName("kind")
    var kind: String,
    @SerializedName("pageInfo")
    var pageInfo: PageInfo,
    @SerializedName("etag")
    @PrimaryKey

    var etag: String,
    @SerializedName("items")
    var items: List<ItemsItem>

)