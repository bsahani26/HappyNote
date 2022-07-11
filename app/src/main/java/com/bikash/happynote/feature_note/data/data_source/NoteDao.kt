package com.bikash.happynote.feature_note.data.data_source

import androidx.room.*
import com.bikash.happynote.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

/**
 * Created by Bikash Sahani on 09/07/22.
 */
@Dao
interface NoteDao {

    @Query("SELECT * FROM note")
    fun getNotes(): Flow<List<Note>> // it will return a flow, so no need to make it suspend

    @Query("SELECT * FROM note WHERE id = :id")
    suspend fun getNoteById(id: Int): Note?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)
}