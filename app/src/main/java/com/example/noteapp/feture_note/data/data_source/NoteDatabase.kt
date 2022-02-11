package com.example.noteapp.feture_note.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.noteapp.feture_note.Note

@Database(
    entities = [Note::class],
    version = 1
)
abstract class NoteDatabase : RoomDatabase() {
    abstract val noteDao: NoteDao

    companion object {
        const val DATABASE_NAME = "note_db"
    }
}