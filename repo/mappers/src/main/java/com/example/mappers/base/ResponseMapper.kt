package com.example.mappers.base

import com.example.model.CustomException
import com.example.model.Model
import com.example.model.enum.Error
import retrofit2.Response

/**
 *
 * @param DTO
 * @param T : Model
 */
interface  ResponseMapper<DTO, T : Model> : BaseMapper<T> {
    /**
     * for null check and map the result
     * @param input DTO?
     * @return Result<T>
     */
    fun map(input: Response<DTO>?): Result<T> {
        return if (input?.body() != null) {
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
    private fun checkNullable(input: Response<DTO>?): T {
        return input?.let {
            return createModelFromDTO(it)
        } ?: kotlin.run {
            Model() as T
        }
    }

    /**
     * change DTO to model
     * @param input DTO
     * @return T
     */
    fun createModelFromDTO(input: Response<DTO>): T

}