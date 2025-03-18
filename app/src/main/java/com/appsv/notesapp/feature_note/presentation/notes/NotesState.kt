package com.appsv.notesapp.feature_note.presentation.notes

import com.appsv.notesapp.feature_note.domain.model.Note
import com.appsv.notesapp.feature_note.domain.util.NoteOrder
import com.appsv.notesapp.feature_note.domain.util.Ordertype

data class NotesState(
    val notes : List<Note> = emptyList(),
    val noteOrder : NoteOrder = NoteOrder.Date(Ordertype.Descending),
    val isOrderSectionVisible : Boolean = false
)
