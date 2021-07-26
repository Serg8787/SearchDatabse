package com.example.searchdatabase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.searchdatabase.database.AppDatabase
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.animal_item.*

class MainActivity : AppCompatActivity(),ViewHolder.ItemCallback,SearchView.OnQueryTextListener {
    lateinit var animalDatabase: AppDatabase
    lateinit var animalList: ArrayList<Animal>

    lateinit var adapter: AnimalAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        animalList = ArrayList<Animal>()
        animalDatabase = AppDatabase.getDatabase(this)
        searchView?.setOnQueryTextListener(this)
        searchView.isSubmitButtonEnabled = true


//        search("Ника")

        floatingActionButton.setOnClickListener {
            val intent = Intent(this, AddNewAnimalActivity::class.java)
            startActivity(intent)
        }
    }

    override fun deleteItem(index: Int) {
        val animalFromDb: List<Animal> = animalDatabase.animalDao().getAll()
        val animal = animalFromDb.get(index)
        animalDatabase.animalDao().deleteAnimal(animal)
    }

    override fun onQueryTextSubmit(query: String?): Boolean {
        search(query)
        return true
    }

    override fun onQueryTextChange(query: String?): Boolean {
        search(query)
        return true
    }
    private fun search(query: String?){
        adapter = AnimalAdapter(context = this, animalList, this)
        recycler.layoutManager = LinearLayoutManager(this@MainActivity)
        recycler.adapter = adapter
        val animalFromDb: List<Animal> = animalDatabase.animalDao().searchDatabase(query)
        animalList.clear()
        animalList.addAll(animalFromDb)
    }
}