package com.vampi.vampimaestro.presentation.subject.studentdetail

import android.annotation.SuppressLint
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.vampi.vampimaestro.R
import com.vampi.vampimaestro.core.extension.failure
import com.vampi.vampimaestro.core.extension.loadFromURLCircular
import com.vampi.vampimaestro.core.extension.observe
import com.vampi.vampimaestro.core.presentation.BaseFragment
import com.vampi.vampimaestro.core.presentation.BaseViewState
import com.vampi.vampimaestro.databinding.StudentDetailFragmentBinding
import com.vampi.vampimaestro.databinding.SubjectDetailFragmentBinding
import com.vampi.vampimaestro.domain.model.DetalleAlumno
import com.vampi.vampimaestro.domain.model.Usuario
import com.vampi.vampimaestro.presentation.login.LoginViewState
import com.vampi.vampimaestro.presentation.profile.detail.ProfileDetailFragment
import com.vampi.vampimaestro.presentation.subject.list.SubjectsViewState
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.WithFragmentBindings
import kotlinx.coroutines.DelicateCoroutinesApi

@AndroidEntryPoint
@WithFragmentBindings
@DelicateCoroutinesApi
class StudentDetailFragment : BaseFragment(R.layout.student_detail_fragment) {

    private lateinit var binding: StudentDetailFragmentBinding
    private val args: StudentDetailFragmentArgs by navArgs()
    private val studentDetailViewModel by viewModels<StudentDetailViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        studentDetailViewModel.apply {
            observe(state, ::onViewStateChanged)
            failure(failure, ::handleFailure)
        }
    }

    override fun onViewStateChanged(state: BaseViewState?) {
        super.onViewStateChanged(state)
        when (state) {
            is LoginViewState.UsuarioReceived -> printStudent(state.usuarios[0])
        }
    }

    @SuppressLint("SetTextI18n")
    private fun printStudent(student: Usuario) {
        binding.txvNombre.text = "${student.nombre} ${student.apPaterno} ${student.apMaterno}"
        binding.txvCorreo.text = student.correo
        binding.txvMatricula.text = student.matricula.toString()
        binding.etC1.setText(args.student.calif1.toString())
        binding.etC2.setText(args.student.calif2.toString())
        binding.etC3.setText(args.student.calif3.toString())

        when (student.foto) {
            "1" -> binding.imgPerfil.loadFromURLCircular(ProfileDetailFragment.pps[0])
            "2" -> binding.imgPerfil.loadFromURLCircular(ProfileDetailFragment.pps[1])
            "3" -> binding.imgPerfil.loadFromURLCircular(ProfileDetailFragment.pps[2])
            "4" -> binding.imgPerfil.loadFromURLCircular(ProfileDetailFragment.pps[3])
            "5" -> binding.imgPerfil.loadFromURLCircular(ProfileDetailFragment.pps[4])
            "6" -> binding.imgPerfil.loadFromURLCircular(ProfileDetailFragment.pps[5])
            "7" -> binding.imgPerfil.loadFromURLCircular(ProfileDetailFragment.pps[6])
            "8" -> binding.imgPerfil.loadFromURLCircular(ProfileDetailFragment.pps[7])
            "9" -> binding.imgPerfil.loadFromURLCircular(ProfileDetailFragment.pps[8])
            "10" -> binding.imgPerfil.loadFromURLCircular(ProfileDetailFragment.pps[9])
        }
    }

    override fun onResume() {
        super.onResume()

        studentDetailViewModel.getUsuarioByMatricula(args.student.matricula)
    }

    override fun setBinding(view: View) {
        binding = StudentDetailFragmentBinding.bind(view)

        binding.lifecycleOwner = this

        binding.btnEdit.setOnClickListener {
            if (studentDetailViewModel.validateEmpties(
                    binding.etC1.text.toString(),
                    binding.etC2.text.toString(),
                    binding.etC3.text.toString()
                )
            ) {
                if (studentDetailViewModel.validateCalifs(
                        binding.etC1.text.toString(),
                        binding.etC2.text.toString(),
                        binding.etC3.text.toString()
                    )
                ) {
                    val detalleAlumno = DetalleAlumno(
                        args.student.idDetalleAlumno,
                        args.student.matricula,
                        binding.etC1.text.toString().toDouble(),
                        binding.etC2.text.toString().toDouble(),
                        binding.etC3.text.toString().toDouble(),
                        args.student.nombre,
                        args.student.descripcion,
                        args.student.foto,
                        args.student.horario
                    )

                    studentDetailViewModel.editCalif(detalleAlumno)
                    navController.navigate(StudentDetailFragmentDirections.actionStudentDetailFragmentToMenuFragment())

                } else {
                    showToast("Tienen que ser números .-.")
                }
            } else {
                showToast("Las calificaciones no pueden estar vacías D:")
            }
        }

    }

}