package com.bikash.happynote.feature_note.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.bikash.happynote.feature_note.domain.model.Note

/**
 * Created by Bikash Sahani on 09/07/22.
 */

@Database(
    entities = [Note::class],
    version = 1,
    exportSchema = false
)
abstract class NoteDatabase: RoomDatabase() {
    abstract val noteDao: NoteDao

    companion object {
        val DATABASE_NAME = "notes_db"
    }
}