package com.vampi.vampialumno.presentation.subject.list

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.vampi.vampialumno.core.utils.LayoutType
import com.vampi.vampialumno.databinding.GridSubjectBinding
import com.vampi.vampialumno.domain.model.DetalleAlumno

@SuppressLint("NotifyDataSetChanged")
class SubjectAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var list: MutableList<DetalleAlumno> = mutableListOf()
    var layoutType = LayoutType.GRID
    private lateinit var listener: (detalleAlumnos: DetalleAlumno) -> Unit

    fun addData(list: List<DetalleAlumno>){
        this.list = list.toMutableList()
        notifyDataSetChanged()
    }

    override fun getItemViewType(position: Int) = layoutType.ordinal

    fun setListener(listener: (detalleAlumnos: DetalleAlumno) -> Unit) {
        this.listener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolderGridItem(
        GridSubjectBinding.inflate(LayoutInflater.from(parent.context),parent,false)
    )

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) =
        (holder as BaseViewHolder).bind(list[position], listener
        )

    override fun getItemCount() = list.size

}

class ViewHolderGridItem(private val  binding: GridSubjectBinding) :
    BaseViewHolder(binding.root){

    override fun bind(data: DetalleAlumno, listener: (detalleAlumnos: DetalleAlumno) -> Unit) {
        binding.apply {
            item = data
            root.setOnClickListener { listener(data) }
        }
    }
}

abstract class BaseViewHolder(private val root: View) : RecyclerView.ViewHolder(root) {

    abstract fun bind(data: DetalleAlumno, listener: (detalleAlumnos: DetalleAlumno) -> Unit)

}