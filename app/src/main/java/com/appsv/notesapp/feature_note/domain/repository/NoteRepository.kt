package com.appsv.notesapp.feature_note.domain.repository

import com.appsv.notesapp.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

interface NoteRepository {
    fun getNote() : Flow<List<Note>>

    suspend fun getNoteById(id : Int) : Note?

    suspend fun insertNote(note : Note)

    suspend fun deleteNote(note : Note)

}