package com.example.mappers

import com.example.mappers.base.ModelMapper
import com.example.model.album.Album
import com.example.model.album.AlbumInfo

class AlbumDetailModelMapper : ModelMapper<Album, AlbumInfo> {
    override fun createModelFromDTO(input: Album): AlbumInfo {
        input.isFavorite = true
        return AlbumInfo(input)
    }
}