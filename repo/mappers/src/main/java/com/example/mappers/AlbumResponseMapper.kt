package com.example.mappers

import com.example.mappers.base.ListResponseMapper
import com.example.model.CustomException
import com.example.model.album.Album
import com.example.model.enum.Error
import retrofit2.Response

class AlbumResponseMapper : ListResponseMapper<Album, Album> {
    override fun createModelFromDTO(input: Response<Album>): Album {
        val album = input.body()?.let {
            Album(
                it.url,
                it.artist,
                it.mbid,
                it.playcount,
                it.image,
                it.tracks,
                it.name,
                it.listeners,
                it.wiki
            )
        }
        return album ?: Album("")
    }

    override fun mapList(input: List<Album>?): Result<List<Album>> {
        return if (input == null || input.isEmpty()) {
            Result.failure(CustomException(Error.NullObject))
        } else {
            val result = ArrayList<Album>()
            input.forEach {
                result.add(
                    Album(
                        it.url,
                        it.artist,
                        it.mbid,
                        it.playcount,
                        it.image,
                        it.tracks,
                        it.name,
                        it.listeners,
                        it.wiki
                    )
                )
            }
            Result.success(result)
        }
    }




}