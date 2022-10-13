package com.example.mappers

import com.example.mappers.base.ResponseMapper
import com.example.model.artist.ArtistSearch
import com.example.model.artist.ArtistsSearchResponse
import retrofit2.Response

class LastFMResponseMapper : ResponseMapper<ArtistsSearchResponse, ArtistSearch> {
    override fun createModelFromDTO(input: Response<ArtistsSearchResponse>): ArtistSearch {
        return ArtistSearch(
            input.body()?.results?.totalResults,
            input.body()?.results?.startIndex, input.body()?.results?.itemsPerPage, input.body()?.results?.artistMatches
        )
    }

}