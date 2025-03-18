package com.appsv.notesapp.feature_note.domain.use_case

import com.appsv.notesapp.feature_note.domain.model.Note
import com.appsv.notesapp.feature_note.domain.repository.NoteRepository
import com.appsv.notesapp.feature_note.domain.util.NoteOrder
import com.appsv.notesapp.feature_note.domain.util.Ordertype
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GetNotes(
    private val repository: NoteRepository
){
    operator fun invoke(
        noteOrder: NoteOrder  =  NoteOrder.Date(Ordertype.Descending)
    ) : Flow<List<Note>> {
        return repository.getNote().map{notes ->
            when(noteOrder.ordertype){
                is Ordertype.Ascending -> when(noteOrder){
                    is NoteOrder.Title-> notes.sortedBy { it.title.lowercase() }
                    is NoteOrder.Date-> notes.sortedBy { it.timestamp }
                    is NoteOrder.Color-> notes.sortedBy { it.color }
                }
                is Ordertype.Descending -> when(noteOrder){
                    is NoteOrder.Title-> notes.sortedByDescending { it.title.lowercase() }
                    is NoteOrder.Date-> notes.sortedByDescending { it.timestamp }
                    is NoteOrder.Color-> notes.sortedByDescending { it.color }
                }
            }
        }
    }
}