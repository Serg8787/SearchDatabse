package com.example.searchdatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.searchdatabase.database.AppDatabase

class MainActivity : AppCompatActivity() {
    lateinit var noteDatabase: AppDatabase
    lateinit var notesList: ArrayList<Animal>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        notesList = ArrayList<Animal>()
        noteDatabase = AppDatabase.getDatabase(this)

        noteDatabase.animalDao().insertNote(Animal("Собака","Ника",18.0,80.0))
        noteDatabase.animalDao().insertNote(Animal("Собака","Альма",30.0,82.0))
        noteDatabase.animalDao().insertNote(Animal("Кот","Карабас-Барабас",12.9,70.0))
        noteDatabase.animalDao().insertNote(Animal("Мышь","Мышка",0.5,10.0))
        noteDatabase.animalDao().insertNote(Animal("Собака","Чэдди",12.0,130.0))
        noteDatabase.animalDao().insertNote(Animal("Кот","Борька",16.5,70.4))
        noteDatabase.animalDao().insertNote(Animal("Собака","Чарри",18.0,80.0))
        noteDatabase.animalDao().insertNote(Animal("Собака","Лорд",18.0,80.0))
        noteDatabase.animalDao().insertNote(Animal("Кот","Чарлик",18.0,80.0))
        noteDatabase.animalDao().insertNote(Animal("Собака","Альба",18.0,80.0))
        noteDatabase.animalDao().insertNote(Animal("Собака","Фумка",18.0,80.0))
        noteDatabase.animalDao().insertNote(Animal("Кот","Барбоскин",18.0,80.0))
        noteDatabase.animalDao().insertNote(Animal("Собака","Карри",18.0,80.0))





    }
}