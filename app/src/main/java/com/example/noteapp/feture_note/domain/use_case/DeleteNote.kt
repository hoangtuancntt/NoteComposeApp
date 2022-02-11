package com.example.noteapp.feture_note.domain.use_case

import com.example.noteapp.feture_note.Note
import com.example.noteapp.feture_note.domain.repository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}