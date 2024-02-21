package com.example.mvvm.data.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.mvvm.domain.model.Quote

@Entity("quote_table")
data class QuotesEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo("id") val id: Int = 0,
    @ColumnInfo("quote") val quote: String,
    @ColumnInfo("author") val author: String
)

fun Quote.toDatabase() = QuotesEntity(quote = quote, author = author)