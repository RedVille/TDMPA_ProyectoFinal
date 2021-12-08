package com.vampi.vampimaestro.presentation.subject.subjectdetail

import com.vampi.vampimaestro.core.presentation.BaseViewModel
import com.vampi.vampimaestro.domain.usecase.GetDetalleAlumnoByIdMateria
import com.vampi.vampimaestro.presentation.subject.list.SubjectsViewState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.DelicateCoroutinesApi
import javax.inject.Inject

@DelicateCoroutinesApi
@HiltViewModel
class SubjectDetailViewModel @Inject constructor(
    private val getDetalleAlumnoByIdMateria: GetDetalleAlumnoByIdMateria
) : BaseViewModel() {

    fun getDetalleAlumnoByIdMateria(idMateria: Int) {
        getDetalleAlumnoByIdMateria(idMateria) {
            it.fold(::handleFailure) { response ->
                state.value = SubjectsViewState.DetalleAlumnoReceived(response.detalleAlumnos ?: listOf())

                true
            }
        }
    }

}