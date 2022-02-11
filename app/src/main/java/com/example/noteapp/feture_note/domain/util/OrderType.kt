package com.example.noteapp.feture_note.domain.util

sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}