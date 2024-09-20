package com.kama.auto.retofit.api.model

data class ResponseModel<T>(
    val status: Int = 1,
    val data: T,
)