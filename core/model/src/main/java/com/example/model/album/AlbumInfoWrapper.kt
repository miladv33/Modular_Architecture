package com.example.model.album

import com.example.model.album.Album
import com.example.model.generic.LastFMAttr
import com.google.gson.annotations.SerializedName

data class AlbumInfoWrapper(
    @SerializedName("album") val album: Album? = null,
    @SerializedName("@attr") val attr: LastFMAttr? = null
)
