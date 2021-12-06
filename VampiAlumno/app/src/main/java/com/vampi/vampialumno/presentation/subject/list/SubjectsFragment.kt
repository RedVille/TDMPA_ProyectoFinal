package com.vampi.vampialumno.presentation.subject.list

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.vampi.vampialumno.R
import com.vampi.vampialumno.core.extension.failure
import com.vampi.vampialumno.core.extension.observe
import com.vampi.vampialumno.core.presentation.BaseFragment
import com.vampi.vampialumno.core.presentation.BaseViewState
import com.vampi.vampialumno.databinding.SubjectsFragmentBinding
import com.vampi.vampialumno.domain.model.DetalleAlumno
import com.vampi.vampialumno.domain.model.Materia
import com.vampi.vampialumno.presentation.login.LoginViewState
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.WithFragmentBindings
import kotlinx.coroutines.DelicateCoroutinesApi

@AndroidEntryPoint
@WithFragmentBindings
@DelicateCoroutinesApi
class SubjectsFragment : BaseFragment(R.layout.subjects_fragment) {

    private lateinit var binding: SubjectsFragmentBinding
    private val adapter: SubjectAdapter by lazy { SubjectAdapter() }

    private val subjectsViewModel by viewModels<SubjectsViewModel>()

    private var materias: MutableList<Materia> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        subjectsViewModel.apply {
            observe(state, ::onViewStateChanged)
            failure(failure, ::handleFailure)

            getLocalUser()
        }
    }

    override fun onViewStateChanged(state: BaseViewState?) {
        super.onViewStateChanged(state)
        when(state){
            is LoginViewState.UsuarioReceived -> {
                subjectsViewModel.getDetalleAlumnoByMatricula(state.usuarios[0].matricula)
            }
            is SubjectsViewState.DetalleAlumnoReceived -> {
                state.detalleAlumno.forEach { detalle ->
                    subjectsViewModel.getMateriaById(detalle.idMateria)
                }
            }
            is SubjectsViewState.MateriasReceived ->  {
                materias.add(state.materias[0])
                setUpAdapter(materias)
            }
        }
    }

    private fun setUpAdapter(materias: List<Materia>){
        adapter.addData(materias)

        adapter.listener = {
            navController.navigate(SubjectsFragmentDirections.actionSubjectsFragmentToSubjectDetailFragment())
        }

        binding.rcSubjects.apply {
            adapter = this@SubjectsFragment.adapter
        }
    }

    override fun setBinding(view: View) {
        binding = SubjectsFragmentBinding.bind(view)

        setHasOptionsMenu(true)

        binding.apply {
            lifecycleOwner = this@SubjectsFragment
        }
    }


}