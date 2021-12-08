package com.vampi.vampimaestro.presentation.subject.subjectdetail

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.vampi.vampimaestro.core.utils.LayoutType
import com.vampi.vampimaestro.databinding.RowStudentBinding
import com.vampi.vampimaestro.domain.model.DetalleAlumno
import com.vampi.vampimaestro.presentation.profile.detail.ProfileDetailFragment
import com.vampi.vampimaestro.presentation.subject.list.SubjectsFragment.Companion.subjectPicture

@SuppressLint("NotifyDataSetChanged")
class StudentAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var list: MutableList<DetalleAlumno> = mutableListOf()
    var layoutType = LayoutType.LINEAR
    private lateinit var listener: (detalleAlumnos: DetalleAlumno) -> Unit

    fun addData(list: List<DetalleAlumno>){
        this.list = list.toMutableList()
        notifyDataSetChanged()
    }

    override fun getItemViewType(position: Int) = layoutType.ordinal

    fun setListener(listener: (detalleAlumnos: DetalleAlumno) -> Unit) {
        this.listener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolderRowItem(
        RowStudentBinding.inflate(LayoutInflater.from(parent.context),parent,false)
    )

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) =
        (holder as BaseViewHolder).bind(list[position], listener
        )

    override fun getItemCount() = list.size

}

class ViewHolderRowItem(private val  binding: RowStudentBinding) :
    BaseViewHolder(binding.root){

    override fun bind(data: DetalleAlumno, listener: (detalleAlumnos: DetalleAlumno) -> Unit) {
        binding.apply {
            item = data
            root.setOnClickListener { listener(data) }
            binding.txvName.text = data.matricula.toString()
            binding.txvP1.text = data.calif1.toString()
            binding.txvP2.text = data.calif2.toString()
            binding.txvP3.text = data.calif3.toString()
        }
    }
}

abstract class BaseViewHolder(private val root: View) : RecyclerView.ViewHolder(root) {

    abstract fun bind(data: DetalleAlumno, listener: (detalleAlumnos: DetalleAlumno) -> Unit)

}