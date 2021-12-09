package com.vampi.vampialumno.presentation.subject.list

import com.vampi.vampialumno.core.presentation.BaseViewState
import com.vampi.vampialumno.domain.model.DetalleAlumno
import com.vampi.vampialumno.domain.model.Materia
import com.vampi.vampialumno.domain.model.Usuario

sealed class SubjectsViewState: BaseViewState() {
    data class DetalleAlumnoReceived(val detalleAlumnos: List<DetalleAlumno>) : BaseViewState()
}
