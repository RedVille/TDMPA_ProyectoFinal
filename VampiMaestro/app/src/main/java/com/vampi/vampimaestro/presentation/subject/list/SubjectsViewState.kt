package com.vampi.vampimaestro.presentation.subject.list

import com.vampi.vampimaestro.core.presentation.BaseViewState
import com.vampi.vampimaestro.domain.model.DetalleMaestro
import com.vampi.vampimaestro.domain.model.Materia
import com.vampi.vampimaestro.domain.model.Usuario

sealed class SubjectsViewState : BaseViewState() {

    data class MateriasReceived(val materias: List<Materia>) : BaseViewState()

    data class DetalleMaestroReceived(val detalleMaestros: List<DetalleMaestro>) : BaseViewState()

}
