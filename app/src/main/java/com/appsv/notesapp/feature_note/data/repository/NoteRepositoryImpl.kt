package com.appsv.notesapp.feature_note.data.repository

import com.appsv.notesapp.feature_note.data.data_source.NoteDAO
import com.appsv.notesapp.feature_note.domain.model.Note
import com.appsv.notesapp.feature_note.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class NoteRepositoryImpl @Inject constructor(
    private val dao : NoteDAO
) : NoteRepository {
    override fun getNote(): Flow<List<Note>> {
        return dao.getNotes() ;
    }

    override suspend fun getNoteById(id: Int): Note? {
        return dao.getNoteById(id)
    }

    override suspend fun insertNote(note: Note) {
        return dao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        return dao.deleteNote(note)
    }
}