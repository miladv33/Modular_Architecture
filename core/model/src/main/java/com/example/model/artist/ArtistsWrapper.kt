package com.example.model.artist

import com.example.model.Model
import com.example.model.artist.Artist
import com.google.gson.annotations.SerializedName

data class ArtistsWrapper(
  @SerializedName("artist") val artistsWrapper: List<Artist>? = null
): Model()
