package com.world4tech.homework.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Notes::class), version = 1, exportSchema = false)
abstract class NotesDatabase:RoomDatabase(){
    abstract fun getNotesDao(): NotesDao
    companion object{
        @Volatile
        private var INSTANCE: NotesDatabase?=null
        fun getDatabase(context: Context): NotesDatabase {
            return INSTANCE ?: synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    NotesDatabase::class.java,
                    "Location_database"
                ).build()
                INSTANCE =instance
                instance
            }
        }
    }
}
