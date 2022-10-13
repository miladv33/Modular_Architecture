package com.example.model.artist

import com.example.model.artist.ArtistSearch
import com.google.gson.annotations.SerializedName

data class ArtistsSearchResponse(
  @SerializedName("results") val results: ArtistSearch? = null
)
