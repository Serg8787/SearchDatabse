package com.example.searchdatabase

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.searchdatabase.database.AppDatabase
import kotlinx.android.synthetic.main.activity_add_new_animal.*

class AddNewAnimalActivity : AppCompatActivity() {
    lateinit var animalDatabase: AppDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_new_animal)

        animalDatabase = AppDatabase.getDatabase(this)


        btAddNote.setOnClickListener {
            if (etTypeOfAnimalAdd.text.toString().isNotEmpty()
                && etNameAnimalAdd.text.toString().isNotEmpty()
                && etHeightOfAnimalAdd.text.toString().isNotEmpty()
                && etWeighttOfAnimalAdd.text.toString().isNotEmpty()) {
                val typeOfAnimal: String = etTypeOfAnimalAdd.text.toString()
                val name: String = etNameAnimalAdd.text.toString()
                val height: String = etHeightOfAnimalAdd.text.toString() + " см"
                val weight: String = etWeighttOfAnimalAdd.text.toString() + " кг"
                val animal: Animal =
                    Animal(typeOfAnimal, name, weight, height)
                animalDatabase.animalDao().insertAnimal(animal)
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Заполните все поля", Toast.LENGTH_LONG).show()
            }
        }
    }
}
