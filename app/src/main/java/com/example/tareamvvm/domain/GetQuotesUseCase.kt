package com.example.tareamvvm.domain

import com.example.tareamvvm.data.model.QuoteModel
import com.example.tareamvvm.data.model.QuoteRepository
import com.example.tareamvvm.data.model.database.entities.toDatabase
import com.example.tareamvvm.domain.model.Quote
import javax.inject.Inject

class GetQuotesUseCase @Inject constructor(   private val repository : QuoteRepository) {


    suspend operator fun invoke():List<Quote> {
        val quotes = repository.getAllQuotesFromApi()

     return   if (quotes.isNotEmpty()){
         repository.clearQuotes()
            repository.insertQuotes(quotes.map { it.toDatabase() })
         quotes
    }else{
        repository.getAllQuotesFromDatabase()
    }

}
}