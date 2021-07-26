package com.example.searchdatabase

import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity
data class Animal(
    var typeOfAnimal: String,
    var name: String?,
    var weight: String,
    var height: String,

    ) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}