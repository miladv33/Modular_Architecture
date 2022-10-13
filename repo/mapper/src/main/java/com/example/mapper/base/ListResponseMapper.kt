package com.example.mapper.base

import com.example.quotes.data.mapper.base.ResponseMapper

/**
 * In the case of those mappers who work with a list of a model
 *
 * @param DTO
 * @param T
 * @constructor Create empty List response mapper
 */
interface ListResponseMapper<DTO, T : Model> : ResponseMapper<DTO, T> {
    /**
     * Create a result object from a list
     *
     * @param input
     * @return
     */
    fun mapList(input: List<DTO>?): Result<List<T>>
}