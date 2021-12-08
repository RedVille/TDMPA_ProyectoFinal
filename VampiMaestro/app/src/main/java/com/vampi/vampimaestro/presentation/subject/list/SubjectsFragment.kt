package com.vampi.vampimaestro.presentation.subject.list

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import com.vampi.vampimaestro.R
import com.vampi.vampimaestro.core.extension.failure
import com.vampi.vampimaestro.core.extension.observe
import com.vampi.vampimaestro.core.presentation.BaseFragment
import com.vampi.vampimaestro.core.presentation.BaseViewState
import com.vampi.vampimaestro.core.utils.LayoutType
import com.vampi.vampimaestro.databinding.SubjectsFragmentBinding
import com.vampi.vampimaestro.domain.model.DetalleMaestro
import com.vampi.vampimaestro.presentation.login.LoginViewState
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        subjectsViewModel.apply {
            observe(state, ::onViewStateChanged)
            failure(failure, ::handleFailure)
        }
    }

    override fun onViewStateChanged(state: BaseViewState?) {
        super.onViewStateChanged(state)
        when (state) {
            is LoginViewState.LoggedUser -> subjectsViewModel.getDetalleMaestroByMatricula(state.usuario.matricula)

            is SubjectsViewState.DetalleMaestroReceived -> setUpAdapter(state.detalleMaestros)
        }
    }

    override fun onResume() {
        super.onResume()

        subjectsViewModel.getLocalUser()
    }

    private fun setUpAdapter(detalleMaestros: List<DetalleMaestro>) {
        adapter.addData(detalleMaestros)

        adapter.setListener {
            navController.navigate(
                SubjectsFragmentDirections.actionSubjectsFragmentToSubjectDetailFragment())
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

        binding.rcSubjects.layoutManager = GridLayoutManager(requireContext(), 2)
        LayoutType.GRID

    }


}