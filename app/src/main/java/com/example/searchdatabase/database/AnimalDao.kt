package com.example.searchdatabase.database

import androidx.room.*
import com.example.searchdatabase.Animal

@Dao
interface AnimalDao {
    @Query("SELECT * FROM Animal")
    fun getAll(): List<Animal>

    @Insert
    fun insertNote(animal:Animal)

    @Delete
    fun deleteNote(animal: Animal)

    @Update
    fun updateNote(animal: Animal)


    @Query("SELECT * FROM animal WHERE id = :id")
    fun getNoteById(id: Int): Animal?

}
