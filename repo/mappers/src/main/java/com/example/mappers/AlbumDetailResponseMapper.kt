package com.example.mappers

import com.example.mappers.base.ResponseMapper
import com.example.model.album.AlbumInfo
import com.example.model.album.AlbumInfoWrapper
import retrofit2.Response

class AlbumDetailResponseMapper : ResponseMapper<AlbumInfoWrapper, AlbumInfo> {
    override fun createModelFromDTO(input: Response<AlbumInfoWrapper>): AlbumInfo {
        return AlbumInfo(input.body()?.album, input.body()?.attr)
    }
}