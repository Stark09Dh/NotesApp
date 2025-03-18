package com.appsv.notesapp.feature_note.domain.util

sealed class NoteOrder(val ordertype: Ordertype) {

    class Title(ordertype: Ordertype) : NoteOrder(ordertype)
    class Date(ordertype: Ordertype) : NoteOrder(ordertype)
    class Color(ordertype: Ordertype) : NoteOrder(ordertype)

    fun copy(ordertype: Ordertype) : NoteOrder{
        return when(this){
            is Title -> Title(ordertype)
            is Date -> Date(ordertype)
            is Color -> Color(ordertype)
        }
    }
}
