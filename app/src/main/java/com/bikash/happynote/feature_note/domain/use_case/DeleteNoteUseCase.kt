package com.bikash.happynote.feature_note.domain.use_case

import com.bikash.happynote.feature_note.domain.model.Note
import com.bikash.happynote.feature_note.domain.repository.NoteRepository

/**
 * Created by Bikash Sahani on 09/07/22.
 */
class DeleteNoteUseCase(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}