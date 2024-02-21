package com.example.mvvm.domain.model

import com.example.mvvm.data.database.entities.QuotesEntity
import com.example.mvvm.data.model.QuoteModel

data class Quote (val quote: String, val author: String)

fun QuoteModel.toDomain() = Quote(quote, author)
fun QuotesEntity.toDomain() = Quote(quote, author)