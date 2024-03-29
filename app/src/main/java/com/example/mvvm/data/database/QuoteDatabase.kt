package com.example.mvvm.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.mvvm.data.database.dao.QuoteDao
import com.example.mvvm.data.database.entities.QuotesEntity

@Database(entities = [QuotesEntity::class], version = 1)
abstract class QuoteDatabase: RoomDatabase() {

    abstract fun getQuoteDao(): QuoteDao
}