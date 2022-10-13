package com.example.model.generic

import com.google.gson.annotations.SerializedName
import com.example.model.artist.Artist

data class Track(
  @SerializedName("streamable") val streamable: Streamable? = null,
  @SerializedName("duration") val duration: Int? = null,
  @SerializedName("url") val url: String? = null,
  @SerializedName("name") val name: String? = null,
  @SerializedName("artist") val artist: Artist? = null
)
