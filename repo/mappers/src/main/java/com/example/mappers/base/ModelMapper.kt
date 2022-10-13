package com.example.mappers.base

import com.example.model.CustomException
import com.example.model.Model
import com.example.model.enum.Error

/**
 * In the case of those mappers who work with model classes
 *
 * @param DTO
 * @param T
 * @constructor Create empty Model mapper
 */
interface ModelMapper<DTO, T : Model> : BaseMapper<T> {
    /**
     * Main function. This function gets a DTO and checks if it is not null, so it creates a Result from it
     *
     * @param input
     * @return
     */
    fun map(input: DTO?): Result<T> {
        return if (input != null) {
            Result.success(checkNullable(input))
        } else {
            mapFailure(CustomException(Error.NullObject))
        }
    }

    /**
     * check input is null or not
     * @param input DTO?
     * @return T
     */
    private fun checkNullable(input: DTO?): T {
        return input?.let {
            return createModelFromDTO(it)
        } ?: kotlin.run {
            Model() as T
        }
    }

    /**
     * Create model from dto
     *
     * @param input
     * @return
     */
    fun createModelFromDTO(input:DTO): T
}