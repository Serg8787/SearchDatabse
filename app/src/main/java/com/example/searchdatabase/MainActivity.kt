package com.example.searchdatabase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.searchdatabase.database.AppDatabase
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var animalDatabase: AppDatabase
    lateinit var animalList: ArrayList<Animal>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        animalList = ArrayList<Animal>()
        animalDatabase = AppDatabase.getDatabase(this)

//        animalDatabase.animalDao().insertAnimal(Animal("Собака","Ника","18","80.0"))
//        animalDatabase.animalDao().insertAnimal(Animal("Собака","Альма","30.0","82.0"))
//        animalDatabase.animalDao().insertAnimal(Animal("Кот","Карабас-Барабас","12.9","70.0"))
//        animalDatabase.animalDao().insertAnimal(Animal("Мышь","Мышка","0.5","10.0"))
//        animalDatabase.animalDao().insertAnimal(Animal("Собака","Чэдди","12.0","130.0"))
//        animalDatabase.animalDao().insertAnimal(Animal("Кот","Борька","16.5","70.4"))
//        animalDatabase.animalDao().insertAnimal(Animal("Собака","Чарри","18.0","80.0"))
//        animalDatabase.animalDao().insertAnimal(Animal("Собака","Лорд","18.0","80.0"))
//        animalDatabase.animalDao().insertAnimal(Animal("Кот","Чарлик","18.0","80.0"))
//        animalDatabase.animalDao().insertAnimal(Animal("Собака","Альба","18.0","80.0"))
//        animalDatabase.animalDao().insertAnimal(Animal("Собака","Фумка","18.0","80.0"))
//        animalDatabase.animalDao().insertAnimal(Animal("Кот","Барбоскин","18.0","80.0"))
//        animalDatabase.animalDao().insertAnimal(Animal("Собака","Карри","18.0","80.0"))



        floatingActionButton.setOnClickListener{
            val intent = Intent(this, AddNewAnimalActivity::class.java)
            startActivity(intent)
        }

    }
}