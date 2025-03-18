package com.appsv.notesapp.feature_note.domain.use_case

import javax.inject.Inject

data class NoteUseCases @Inject constructor(
    val getNotes: GetNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNote ,
    val getNote : GetNote
)


