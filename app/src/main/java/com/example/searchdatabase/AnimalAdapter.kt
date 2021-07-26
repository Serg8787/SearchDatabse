package com.example.searchdatabase

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.animal_item.view.*

class AnimalAdapter(
    val context: MainActivity,
    val animalList: List<Animal>,
    mainActivity: MainActivity,

    ) :
    RecyclerView.Adapter<ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.animal_item, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val animal: Animal = animalList[position]
        val pos = holder.getAdapterPosition()

        holder.typeOfAnimal.text = animalList[pos].typeOfAnimal
        holder.name.text = animalList[pos].name
        holder.weight.text = animalList[pos].weight
        holder.height.text = animalList[pos].height
        holder.delete.setOnClickListener {
//            callback.deleteItem(pos)
        }

    }

    override fun getItemCount() = animalList.size
}

class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var typeOfAnimal: TextView
    var name: TextView
    var weight: TextView
    var height: TextView
    var delete: Button

    init {
        typeOfAnimal = itemView.tvTypeOfAnimalItem
        name = itemView.tvNameAnimalItem
        weight = itemView.tvWeihgtItem
        height = itemView.tvHeightItem
        delete = itemView.btDeleteItem
    }

    interface ItemCallback {
        fun deleteItem(index: Int)
    }

}