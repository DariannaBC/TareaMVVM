package com.example.tareamvvm.domain

import com.example.tareamvvm.data.model.QuoteModel
import com.example.tareamvvm.data.model.QuoteRepository
import com.example.tareamvvm.domain.model.Quote
import javax.inject.Inject


class GetRandomQuoteUseCase @Inject constructor( private val repository: QuoteRepository){


  suspend  operator fun invoke(): Quote?{
        val quotes = repository.getAllQuotesFromDatabase()
        if(!quotes.isNullOrEmpty()) {
            val randomNumber = (quotes.indices).random()
            return quotes[randomNumber]
        }
        return null
    }
}