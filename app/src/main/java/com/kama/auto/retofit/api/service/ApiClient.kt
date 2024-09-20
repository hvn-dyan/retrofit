package com.kama.auto.retofit.api.service

import android.util.Log
import com.kama.auto.retofit.api.model.RadioData
import com.kama.auto.retofit.api.model.ResponseModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ApiClient (private val apiService: ApiService) {
    suspend fun getRadioList(): ResponseModel<RadioData?> = withContext(Dispatchers.IO) {

        return@withContext try {
            val data =   apiService.getRadio()
            return@withContext data
        } catch (e: Exception) {
            Log.d( "TRYYYYYYYYY" , "ER: ${e.message}")
            ResponseModel(status = 0, data = null)
        }
    }
}