package com.example.tareamvvm.domain.model

import com.example.tareamvvm.data.model.QuoteModel
import com.example.tareamvvm.data.model.database.entities.QuoteEntity

data class Quote(val quote:String, val author:String)
fun QuoteModel.toDomain() = Quote(quote, author)
fun QuoteEntity.toDomain() = Quote(quote, author)