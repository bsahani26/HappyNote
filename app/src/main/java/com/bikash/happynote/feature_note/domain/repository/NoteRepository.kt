package com.bikash.happynote.feature_note.domain.repository

import com.bikash.happynote.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

/**
 * Created by Bikash Sahani on 09/07/22.
 */
interface NoteRepository {

    fun getNotes(): Flow<List<Note>>

    suspend fun getNoteById(id: Int): Note?

    suspend fun insertNote(note: Note)

    suspend fun deleteNote(note: Note)
}