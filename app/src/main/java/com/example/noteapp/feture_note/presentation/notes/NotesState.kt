package com.example.noteapp.feture_note.presentation.notes

import com.example.noteapp.feture_note.Note
import com.example.noteapp.feture_note.domain.util.NoteOrder
import com.example.noteapp.feture_note.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)