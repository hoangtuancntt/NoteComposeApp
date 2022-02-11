package com.example.noteapp.feture_note.presentation.notes

import com.example.noteapp.feture_note.Note
import com.example.noteapp.feture_note.domain.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteOrder(val note: Note): NotesEvent()
    object RestoreNote : NotesEvent()
    object ToggleOrderSection : NotesEvent()
}