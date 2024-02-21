package com.example.mvvm.domain

import com.example.mvvm.data.QuoteRepository
import com.example.mvvm.data.model.QuoteModel
import com.example.mvvm.domain.model.Quote
import javax.inject.Inject

class GetRandomQuoteUseCase @Inject constructor(private val repository: QuoteRepository) {

    suspend operator fun invoke(): Quote?{
        val quote = repository.getAllQuotesFromDataBase()
        if (!quote.isNullOrEmpty()){
            val randomNumber = (quote.indices).random()
            return quote[randomNumber]
        }
        return null
    }
}