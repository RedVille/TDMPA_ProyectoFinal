package com.vampi.vampimaestro.presentation.subject.list

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.vampi.vampimaestro.core.extension.loadFromURLCircular
import com.vampi.vampimaestro.core.extension.loadFromURLRounded
import com.vampi.vampimaestro.core.utils.LayoutType
import com.vampi.vampimaestro.databinding.GridSubjectBinding
import com.vampi.vampimaestro.domain.model.DetalleMaestro
import com.vampi.vampimaestro.presentation.profile.detail.ProfileDetailFragment
import com.vampi.vampimaestro.presentation.subject.list.SubjectsFragment.Companion.subjectPicture

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

            when (data.foto.toInt()) {
                1 -> binding.imgSubject.loadFromURLRounded(subjectPicture[0])
                2 -> binding.imgSubject.loadFromURLRounded(subjectPicture[1])
                3 -> binding.imgSubject.loadFromURLRounded(subjectPicture[2])
                4 -> binding.imgSubject.loadFromURLRounded(subjectPicture[3])
                5 -> binding.imgSubject.loadFromURLRounded(subjectPicture[4])
                6 -> binding.imgSubject.loadFromURLRounded(subjectPicture[5])
                7 -> binding.imgSubject.loadFromURLRounded(subjectPicture[6])
                8 -> binding.imgSubject.loadFromURLRounded(subjectPicture[7])
                9 -> binding.imgSubject.loadFromURLRounded(subjectPicture[8])
                10 -> binding.imgSubject.loadFromURLRounded(subjectPicture[9])
                11 -> binding.imgSubject.loadFromURLRounded(subjectPicture[10])
                12 -> binding.imgSubject.loadFromURLRounded(subjectPicture[11])
            }

        }
    }
}

abstract class BaseViewHolder(private val root: View) : RecyclerView.ViewHolder(root) {

    abstract fun bind(data: DetalleMaestro, listener: (detalleMaestros: DetalleMaestro) -> Unit)

}
