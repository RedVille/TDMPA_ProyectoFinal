package com.vampi.vampialumno.presentation.subject.list

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import com.vampi.vampialumno.R
import com.vampi.vampialumno.core.extension.failure
import com.vampi.vampialumno.core.extension.observe
import com.vampi.vampialumno.core.presentation.BaseFragment
import com.vampi.vampialumno.core.presentation.BaseViewState
import com.vampi.vampialumno.core.utils.LayoutType
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

    private var materias: MutableList<DetalleAlumno> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        subjectsViewModel.apply {
            observe(state, ::onViewStateChanged)
            failure(failure, ::handleFailure)
        }
    }

    override fun onViewStateChanged(state: BaseViewState?) {
        super.onViewStateChanged(state)
        when(state){
            is LoginViewState.LoggedUser -> {
                subjectsViewModel.getDetalleAlumnoByMatricula(state.usuario.matricula)
            }
            is SubjectsViewState.DetalleAlumnoReceived -> setUpAdapter(state.detalleAlumnos)
        }
    }

    override fun onResume() {
        super.onResume()

        subjectsViewModel.getLocalUser()
    }

    private fun setUpAdapter(detalleAlumnos: List<DetalleAlumno>){
        adapter.addData(detalleAlumnos)

        adapter.setListener {
            navController.navigate(SubjectsFragmentDirections.actionSubjectsFragmentToSubjectDetailFragment())
        }

        binding.rcSubjects.apply {
            adapter = this@SubjectsFragment.adapter
        }
    }

    override fun setBinding(view: View) {
        binding = SubjectsFragmentBinding.bind(view)

        binding.lifecycleOwner = this

        binding.apply {
            swpRefresh.apply {
                setOnRefreshListener {
                    isRefreshing = false
                }
            }
        }

        binding.rcSubjects.layoutManager = GridLayoutManager(requireContext(),2)
        LayoutType.GRID


    }

}