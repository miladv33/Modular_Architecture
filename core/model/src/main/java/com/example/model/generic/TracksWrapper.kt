package com.example.model.generic

import com.example.model.Model
import com.google.gson.annotations.SerializedName

data class TracksWrapper(
  @SerializedName("track") val track: List<Track> = listOf()
): Model()
