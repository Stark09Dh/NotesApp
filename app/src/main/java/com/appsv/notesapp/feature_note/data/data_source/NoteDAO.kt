package com.appsv.notesapp.feature_note.data.data_source

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.appsv.notesapp.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow
import androidx.room.OnConflictStrategy

@Dao
interface NoteDAO {
    @Query("SELECT * FROM note")
    fun getNotes() : Flow<List<Note>>

    @Query("SELECT * FROM note WHERE id = :id")
    suspend fun getNoteById(id : Int) : Note?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note : Note)


    @Delete
    suspend fun deleteNote(note : Note)

}