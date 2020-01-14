package com.example.youtubeparcer.model

import androidx.room.Entity
import androidx.room.TypeConverters
import com.google.gson.annotations.SerializedName

@Entity(tableName = "detail_video")
@TypeConverters
data class DetailVideoModel(@SerializedName("kind")
                            val kind: String = "",
                            @SerializedName("pageInfo")
                            val pageInfo: PageInfo,
                            @SerializedName("etag")
                            val etag: String = "",
                            @SerializedName("items")
                            val items: List<ItemsItem>?)
