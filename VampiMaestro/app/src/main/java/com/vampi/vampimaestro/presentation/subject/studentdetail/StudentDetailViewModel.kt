package com.vampi.vampimaestro.presentation.subject.studentdetail

import androidx.lifecycle.ViewModel
import com.vampi.vampimaestro.core.presentation.BaseViewModel
import com.vampi.vampimaestro.domain.model.DetalleAlumno
import com.vampi.vampimaestro.domain.usecase.EditCalif
import com.vampi.vampimaestro.domain.usecase.GetUsuarioByMatricula
import com.vampi.vampimaestro.presentation.login.LoginViewState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.DelicateCoroutinesApi
import java.lang.NumberFormatException
import javax.inject.Inject

@DelicateCoroutinesApi
@HiltViewModel
class StudentDetailViewModel @Inject constructor(
    private val getUsuarioByMatricula: GetUsuarioByMatricula,
    private val editCalif: EditCalif
    ) : BaseViewModel() {

    fun getUsuarioByMatricula(matricula: Int) {
        getUsuarioByMatricula(matricula) {
            it.fold(::handleFailure) { response ->
                state.value = LoginViewState.UsuarioReceived(response.usuarios ?: listOf())

                true
            }
        }
    }

    fun editCalif(detalleAlumno: DetalleAlumno){
        editCalif(detalleAlumno){
            it.fold(::handleFailure){ true }
        }
    }

    fun validateCalifs(c1: String, c2: String, c3: String): Boolean {
        return try {
            c1.toDouble()
            c2.toDouble()
            c3.toDouble()
            true
        } catch (e: NumberFormatException) {
            false
        }
    }

    fun validateEmpties(c1: String, c2: String, c3: String): Boolean {
        return !(c1.isBlank() || c2.isBlank() || c3.isBlank())
    }

}