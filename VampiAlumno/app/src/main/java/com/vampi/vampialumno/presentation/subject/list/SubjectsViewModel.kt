package com.vampi.vampialumno.presentation.subject.list

import androidx.lifecycle.ViewModel
import com.vampi.vampialumno.core.exception.Failure
import com.vampi.vampialumno.core.interactor.UseCase
import com.vampi.vampialumno.core.presentation.BaseViewModel
import com.vampi.vampialumno.domain.model.Usuario
import com.vampi.vampialumno.domain.usecase.GetDetalleAlumnoByMatricula
import com.vampi.vampialumno.domain.usecase.GetLocalUser
import com.vampi.vampialumno.domain.usecase.GetMateriaById
import com.vampi.vampialumno.domain.usecase.GetUsuarioByMatricula
import com.vampi.vampialumno.presentation.login.LoginViewState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.DelicateCoroutinesApi
import javax.inject.Inject

@DelicateCoroutinesApi
@HiltViewModel
class SubjectsViewModel @Inject constructor(
    private val getUsuarioByMatricula: GetUsuarioByMatricula,
    private val getLocalUser: GetLocalUser,
    private val getMateriaById: GetMateriaById,
    private val getDetalleAlumnoByMatricula: GetDetalleAlumnoByMatricula
): BaseViewModel() {

    fun getMateriaById(id: Int) {
        getMateriaById(id) {
            it.fold(::handleFailure) { response ->
                state.value = SubjectsViewState.MateriasReceived(response.materias ?: listOf())

                true
            }
        }
    }

    fun getDetalleAlumnoByMatricula(matricula: Int) {
        getDetalleAlumnoByMatricula(matricula) {
            it.fold(::handleFailure) { response ->
                state.value = SubjectsViewState.DetalleAlumnoReceived(response.detalleAlumno ?: listOf())

                true
            }
        }
    }

    fun getLocalUser() {
        getLocalUser(UseCase.None()) {
            it.fold(::userNotFound) { localUser ->
                getUsuarioByMatricula(localUser.matricula) {
                    it.fold({
                        setUserInfo(localUser)
                        ::handleFailure
                    }) {
                        setUserInfo(localUser)
                        true
                    }
                }
            }
        }
    }

    private fun setUserInfo(usuario: Usuario) {
        state.value = LoginViewState.LoggedUser(usuario)
    }

    private fun userNotFound(failure: Failure) {
        state.value = LoginViewState.UserNotFound
        handleFailure(failure)
    }
}