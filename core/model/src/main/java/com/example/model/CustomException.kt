package com.example.model

import com.example.model.enum.Error

/**
 *
 * deal with any kinds of exceptions
 * @property error Error
 * @constructor
 */
data class CustomException(
    val error: Error
    ):Exception()