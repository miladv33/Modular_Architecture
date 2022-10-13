package com.example.model.album

import com.google.gson.annotations.SerializedName

data class TopAlbumsResponse(
  @SerializedName("topalbums") val topAlbums: TopAlbumWrapper? = null
)
