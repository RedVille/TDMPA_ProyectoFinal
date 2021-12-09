package com.vampi.vampialumno.presentation.subject.detail

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.vampi.vampialumno.R
import com.vampi.vampialumno.core.extension.failure
import com.vampi.vampialumno.core.extension.loadFromURLCircular
import com.vampi.vampialumno.core.extension.loadFromURLRounded
import com.vampi.vampialumno.core.extension.observe
import com.vampi.vampialumno.core.presentation.BaseFragment
import com.vampi.vampialumno.databinding.SubjectDetailFragmentBinding
import com.vampi.vampialumno.databinding.SubjectsFragmentBinding
import com.vampi.vampialumno.domain.model.DetalleAlumno
import com.vampi.vampialumno.domain.model.Usuario
import com.vampi.vampialumno.presentation.profile.detail.ProfileDetailFragment
import com.vampi.vampialumno.presentation.profile.edit.EditProfileFragmentArgs
import com.vampi.vampialumno.presentation.subject.list.SubjectsFragment
import com.vampi.vampialumno.presentation.subject.list.SubjectsFragment.Companion.subjectPicture
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.WithFragmentBindings

@AndroidEntryPoint
@WithFragmentBindings
class SubjectDetailFragment : BaseFragment(R.layout.subject_detail_fragment) {

    private lateinit var binding: SubjectDetailFragmentBinding
    private val args: SubjectDetailFragmentArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun setBinding(view: View) {
        binding = SubjectDetailFragmentBinding.bind(view)
        printSubject(args.subject)
    }

    fun printSubject (detalleAlumno: DetalleAlumno) {
        binding.txvDetailSubjectTitle.text = detalleAlumno.nombre
        binding.txvDetailDescription.text = detalleAlumno.descripcion
        binding.txvDetailHorario.text = detalleAlumno.horario
        binding.txvP1.text = detalleAlumno.calif1.toString()
        binding.txvP2.text = detalleAlumno.calif2.toString()
        binding.txvP3.text = detalleAlumno.calif3.toString()
        setImage(detalleAlumno.foto.toInt())

    }

    private fun setImage(img: Int){
        when(img){
            1 -> binding.imgDetailSubject.loadFromURLRounded(subjectPicture[0])
            2 -> binding.imgDetailSubject.loadFromURLRounded(subjectPicture[1])
            3 -> binding.imgDetailSubject.loadFromURLRounded(subjectPicture[2])
            4 -> binding.imgDetailSubject.loadFromURLRounded(subjectPicture[3])
            5 -> binding.imgDetailSubject.loadFromURLRounded(subjectPicture[4])
            6 -> binding.imgDetailSubject.loadFromURLRounded(subjectPicture[5])
            7 -> binding.imgDetailSubject.loadFromURLRounded(subjectPicture[6])
            8 -> binding.imgDetailSubject.loadFromURLRounded(subjectPicture[7])
            9 -> binding.imgDetailSubject.loadFromURLRounded(subjectPicture[8])
            10 -> binding.imgDetailSubject.loadFromURLRounded(subjectPicture[9])
            11 -> binding.imgDetailSubject.loadFromURLRounded(subjectPicture[10])
            12 -> binding.imgDetailSubject.loadFromURLRounded(subjectPicture[11])
        }
    }
}