package com.vampi.vampimaestro.presentation.subject.list

import com.vampi.vampimaestro.core.presentation.BaseViewState
import com.vampi.vampimaestro.domain.model.DetalleAlumno
import com.vampi.vampimaestro.domain.model.DetalleMaestro

sealed class SubjectsViewState : BaseViewState() {

    data class DetalleMaestroReceived(val detalleMaestros: List<DetalleMaestro>) : BaseViewState()

    data class DetalleAlumnoReceived(val detalleAlumnos: List<DetalleAlumno>) : BaseViewState()

}
