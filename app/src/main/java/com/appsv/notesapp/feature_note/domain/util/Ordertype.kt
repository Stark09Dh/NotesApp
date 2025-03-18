package com.appsv.notesapp.feature_note.domain.util

sealed class Ordertype {
    object Ascending : Ordertype()
    object Descending : Ordertype()

}