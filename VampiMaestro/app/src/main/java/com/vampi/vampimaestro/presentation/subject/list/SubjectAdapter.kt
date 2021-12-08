package com.vampi.vampimaestro.presentation.subject.list

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.vampi.vampimaestro.core.utils.LayoutType
import com.vampi.vampimaestro.databinding.GridSubjectBinding
import com.vampi.vampimaestro.domain.model.DetalleMaestro

@SuppressLint("NotifyDataSetChanged")
class SubjectAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var list: MutableList<DetalleMaestro> = mutableListOf()
    var layoutType = LayoutType.GRID
    private lateinit var listener: (detalleMaestros: DetalleMaestro) -> Unit

    fun addData(list: List<DetalleMaestro>){
        this.list = list.toMutableList()
        notifyDataSetChanged()
    }

    override fun getItemViewType(position: Int) = layoutType.ordinal

    fun setListener(listener: (detalleMaestros: DetalleMaestro) -> Unit) {
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

    override fun bind(data: DetalleMaestro, listener: (detalleMaestros: DetalleMaestro) -> Unit) {
        binding.apply {
            item = data
            root.setOnClickListener { listener(data) }
        }
    }
}

abstract class BaseViewHolder(private val root: View) : RecyclerView.ViewHolder(root) {

    abstract fun bind(data: DetalleMaestro, listener: (detalleMaestros: DetalleMaestro) -> Unit)

}