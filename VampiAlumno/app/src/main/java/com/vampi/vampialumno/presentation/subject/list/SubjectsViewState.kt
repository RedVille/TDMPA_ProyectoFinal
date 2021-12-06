package com.vampi.vampialumno.presentation.subject.list

import com.vampi.vampialumno.core.presentation.BaseViewState
import com.vampi.vampialumno.domain.model.DetalleAlumno
import com.vampi.vampialumno.domain.model.Materia

sealed class SubjectsViewState: BaseViewState() {
    data class MateriasReceived(val materias: List<Materia>) : BaseViewState()
    data class DetalleAlumnoReceived(val detalleAlumno: List<DetalleAlumno>) : BaseViewState()
}
