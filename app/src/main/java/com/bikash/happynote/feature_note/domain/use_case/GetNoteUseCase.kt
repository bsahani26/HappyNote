package com.bikash.happynote.feature_note.domain.use_case

import com.bikash.happynote.feature_note.domain.model.Note
import com.bikash.happynote.feature_note.domain.repository.NoteRepository

/**
 * Created by Bikash Sahani on 09/07/22.
 */
class GetNoteUseCase(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}