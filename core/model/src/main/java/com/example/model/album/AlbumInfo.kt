package com.example.model.album

import com.example.model.Model
import com.example.model.generic.LastFMAttr
import com.example.model.album.Album
import com.google.gson.annotations.SerializedName

data class AlbumInfo(
    @SerializedName("album") val album: Album? = null,
    @SerializedName("@attr") val attr: LastFMAttr? = null
) : Model()
