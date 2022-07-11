package com.bikash.happynote.feature_note.presentation.notes

import com.bikash.happynote.feature_note.domain.model.Note
import com.bikash.happynote.feature_note.domain.util.NoteOrder
import com.bikash.happynote.feature_note.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
