package com.example.tareamvvm.data.model.network

import com.example.tareamvvm.core.RetrofitHelper
import com.example.tareamvvm.data.model.QuoteModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class QuoteService @Inject constructor( private val api:QuoteApiClient) {


    suspend fun getQuotes():List<QuoteModel>{
        return withContext(Dispatchers.IO){
            val response = api.getAllQuotes()
            response.body() ?: emptyList()
        }

    }
}