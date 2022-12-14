package com.example.model.artist

import com.example.model.Model
import com.google.gson.annotations.SerializedName


data class ArtistSearch(
  @SerializedName("opensearch:totalResults") val totalResults: String? = null,
  @SerializedName("opensearch:startIndex") val startIndex: String? = null,
  @SerializedName("opensearch:itemsPerPage") val itemsPerPage: String? = null,
  @SerializedName("artistmatches") val artistMatches: ArtistsWrapper? = null,
) : Model()
