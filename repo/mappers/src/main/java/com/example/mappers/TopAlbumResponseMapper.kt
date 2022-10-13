package com.example.mappers

import com.example.mappers.base.ResponseMapper
import com.example.model.album.TopAlbumWrapper
import com.example.model.album.TopAlbumsResponse
import retrofit2.Response

class TopAlbumResponseMapper : ResponseMapper<TopAlbumsResponse, TopAlbumWrapper> {
    override fun createModelFromDTO(input: Response<TopAlbumsResponse>): TopAlbumWrapper {
        return input.body()?.topAlbums ?: TopAlbumWrapper()
    }
}