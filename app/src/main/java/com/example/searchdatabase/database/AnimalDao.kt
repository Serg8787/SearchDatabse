package com.example.searchdatabase.database

import androidx.room.*
import com.example.searchdatabase.Animal

@Dao
interface AnimalDao {
    @Query("SELECT * FROM Animal")
    fun getAll(): List<Animal>

    @Insert
    fun insertAnimal(animal:Animal)

    @Delete
    fun deleteAnimal(animal: Animal)

    @Update
    fun updateAnimal(animal: Animal)


    @Query("SELECT * FROM animal WHERE id = :id")
    fun getAnimalById(id: Int): Animal?

}
