package com.example.tareamvvm.data.model.database.entities

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.tareamvvm.data.model.database.entities.dao.QuoteDao

@Database(entities = [QuoteEntity::class], version = 1)
abstract class QuoteDatabase:RoomDatabase() {


    abstract fun getQuoteDao():QuoteDao
}