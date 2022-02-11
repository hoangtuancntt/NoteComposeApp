package com.example.noteapp.feture_note.domain.use_case

import com.example.noteapp.feture_note.Note
import com.example.noteapp.feture_note.domain.repository.NoteRepository

class GetNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}