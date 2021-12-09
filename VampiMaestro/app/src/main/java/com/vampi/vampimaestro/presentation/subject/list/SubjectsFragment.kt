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
import com.vampi.vampimaestro.presentation.subject.list.SubjectAdapter
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.WithFragmentBindings
import kotlinx.coroutines.DelicateCoroutinesApi

@AndroidEntryPoint
@WithFragmentBindings
@DelicateCoroutinesApi
class SubjectsFragment : BaseFragment(R.layout.subjects_fragment) {

    companion object {
        val subjectPicture = listOf(
            "https://ahseeit.com//king-include/uploads/2021/01/135051577_1062350537526022_5150120801114779946_n-6624338286.jpg",
            "https://files.jotform.com/jotformapps/7b71e9f9aee27718c824ba948c9115e6.png",
            "https://www.lavanguardia.com/files/content_image_mobile_filter/uploads/2017/10/26/5fa3e002310a1.jpeg",
            "https://pbs.twimg.com/media/ErsHA5ZW8AI9HML.jpg",
            "https://ahseeit.com//king-include/uploads/2019/01/49562517_2476184055731250_5752766523963619196_n-9541719234.jpg",
            "https://http2.mlstatic.com/D_NQ_NP_958852-MLM44485235323_012021-W.jpg",
            "https://external-preview.redd.it/gTCGwSx7LM2F0qqW6EmLmOFAm3KE0M7OGT7ARQ6fJOw.jpg?auto=webp&s=0e521ce4ac3a9aa68b8a051d238ab695a18369fe",
            "https://i.kym-cdn.com/entries/icons/facebook/000/019/746/1427820103132.jpg",
            "https://i.pinimg.com/564x/ab/aa/fa/abaafa043a3de38cf1c31bfc5bee813e.jpg",
            "https://preview.redd.it/2mpkij9et4w41.jpg?auto=webp&s=57208fffba2538ae8c7a3b11806b8bd330d9d7a2",
            "https://i.pinimg.com/564x/55/d4/98/55d49812a5213b846dd3643f74b372a7.jpg",
            "https://images7.memedroid.com/images/UPLOADED873/5dc5889ef2569.jpeg"
        )
    }

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
                SubjectsFragmentDirections.actionSubjectsFragmentToSubjectDetailFragment(it))
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