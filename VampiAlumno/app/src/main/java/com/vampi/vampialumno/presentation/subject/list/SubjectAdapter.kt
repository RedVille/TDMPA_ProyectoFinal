package com.vampi.vampialumno.presentation.subject.list

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.vampi.vampialumno.databinding.GridSubjectBinding
import com.vampi.vampialumno.domain.model.Materia

@SuppressLint("NotifyDataSetChanged")
class SubjectAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var list: MutableList<Materia> = mutableListOf()
    lateinit var listener: (materia: Materia) -> Unit

    fun addData(list: List<Materia>){
        this.list = list.toMutableList()
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolderGridItem(
        GridSubjectBinding.inflate(LayoutInflater.from(parent.context),parent,false)
    )

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) = (holder as ViewHolderGridItem).bind(
        list[position], listener
    )

    override fun getItemCount() = list.size

    class ViewHolderGridItem(private val  binding: GridSubjectBinding) :
        RecyclerView.ViewHolder(binding.root){

        fun bind(data: Materia, listener: (materia: Materia)->Unit) {
            binding.item = data

            //binding.imgFood.load(data.urlMealThumb)

            binding.root.setOnClickListener {
                listener(data)
            }
        }
    }
}