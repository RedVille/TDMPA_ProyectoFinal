package com.vampi.vampimaestro.presentation.subject.subjectdetail

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.vampi.vampimaestro.R
import com.vampi.vampimaestro.core.extension.failure
import com.vampi.vampimaestro.core.extension.loadFromURLRounded
import com.vampi.vampimaestro.core.extension.observe
import com.vampi.vampimaestro.core.presentation.BaseFragment
import com.vampi.vampimaestro.core.presentation.BaseViewState
import com.vampi.vampimaestro.databinding.SubjectDetailFragmentBinding
import com.vampi.vampimaestro.domain.model.DetalleAlumno
import com.vampi.vampimaestro.domain.model.DetalleMaestro
import com.vampi.vampimaestro.presentation.subject.list.SubjectsFragment
import com.vampi.vampimaestro.presentation.subject.list.SubjectsFragment.Companion.subjectPicture
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.WithFragmentBindings
import kotlinx.coroutines.DelicateCoroutinesApi

@AndroidEntryPoint
@WithFragmentBindings
@DelicateCoroutinesApi
class SubjectDetailFragment : BaseFragment(R.layout.subject_detail_fragment) {

    private lateinit var binding: SubjectDetailFragmentBinding
    private val args: SubjectDetailFragmentArgs by navArgs()
    private val subjectDetailViewModel by viewModels<SubjectDetailViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        subjectDetailViewModel.apply {
            observe(state, ::onViewStateChanged)
            failure(failure, ::handleFailure)
        }
    }

    override fun onViewStateChanged(state: BaseViewState?) {
        super.onViewStateChanged(state)
        when (state) {

        }
    }

    override fun onResume() {
        super.onResume()

        //subjectsViewModel.getLocalUser()
    }

    private fun setUpAdapter(detalleAlumno: List<DetalleAlumno>) {

    }

    override fun setBinding(view: View) {
        binding = SubjectDetailFragmentBinding.bind(view)

        binding.lifecycleOwner = this

        binding.apply {
            swpRefresh.apply {
                setOnRefreshListener {
                    isRefreshing = false
                }
            }
        }

        printSubject(args.subject)
    }

    private fun printSubject(detalleMaestro: DetalleMaestro) {
        binding.txvDetailSubjectTitle.text = detalleMaestro.nombre
        binding.txvDetailDescription.text = detalleMaestro.descripcion
        binding.txvDetailHorario.text = detalleMaestro.horario

        when (detalleMaestro.foto.toInt()) {
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