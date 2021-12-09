package com.vampi.vampialumno.presentation.profile.edit

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.vampi.vampialumno.R
import com.vampi.vampialumno.core.extension.failure
import com.vampi.vampialumno.core.extension.loadFromURLCircular
import com.vampi.vampialumno.core.extension.observe
import com.vampi.vampialumno.core.presentation.BaseFragment
import com.vampi.vampialumno.core.presentation.BaseViewState
import com.vampi.vampialumno.databinding.EditProfileFragmentBinding
import com.vampi.vampialumno.databinding.ProfileDetailFragmentBinding
import com.vampi.vampialumno.domain.model.Usuario
import com.vampi.vampialumno.presentation.login.LoginViewState
import com.vampi.vampialumno.presentation.profile.detail.ProfileDetailFragment.Companion.pps
import com.vampi.vampialumno.presentation.profile.detail.ProfileDetailFragmentDirections
import com.vampi.vampialumno.presentation.profile.detail.ProfileDetailViewModel
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.WithFragmentBindings
import kotlinx.coroutines.DelicateCoroutinesApi

@AndroidEntryPoint
@WithFragmentBindings
@DelicateCoroutinesApi
class EditProfileFragment : BaseFragment(R.layout.edit_profile_fragment) {

    private lateinit var binding: EditProfileFragmentBinding

    private val editProfileViewModel by viewModels<EditProfileViewModel>()

    private val args: EditProfileFragmentArgs by navArgs()

    private var imgCount: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        editProfileViewModel.apply {
            observe(state, ::onViewStateChanged)
            failure(failure, ::handleFailure)

        }
    }

    override fun onViewStateChanged(state: BaseViewState?) {
        super.onViewStateChanged(state)
        when (state) {

        }
    }

    override fun setBinding(view: View) {
        binding = EditProfileFragmentBinding.bind(view)
        binding.apply {
            lifecycleOwner = this@EditProfileFragment

            btnSave.setOnClickListener {
                if (!editProfileViewModel.validateEmpties()) {
                    val user = Usuario(
                        args.user.matricula,
                        binding.etName.text.toString(),
                        binding.etLastname1.text.toString(),
                        binding.etLastname2.text.toString(),
                        binding.etEmail.text.toString(),
                        args.user.contrasena,
                        imgCount.toString(),
                        args.user.tipo
                    )
                    editProfileViewModel.editUser(user)
                    editProfileViewModel.setLocalUser(user)
                    fragmentManager?.popBackStack()
                    navController.navigate(EditProfileFragmentDirections.actionEditProfileFragmentToMenuFragment())
                } else {
                    showToast("Oigame no, lléneme bien los campos >>:(")
                }
            }

            ivBack.setOnClickListener { goBack() }

            ivNext.setOnClickListener { goNext() }
        }
        printUser(args.user)
    }

    private fun goNext() {
        if (imgCount == 10)
            imgCount = 1
        else imgCount++
        setImage()
    }

    private fun goBack() {
        if (imgCount == 1)
            imgCount = 10
        else imgCount--
        setImage()
    }

    private fun setImage() {
        when (imgCount) {
            1 -> binding.ivProfilePicture.loadFromURLCircular(pps[0])
            2 -> binding.ivProfilePicture.loadFromURLCircular(pps[1])
            3 -> binding.ivProfilePicture.loadFromURLCircular(pps[2])
            4 -> binding.ivProfilePicture.loadFromURLCircular(pps[3])
            5 -> binding.ivProfilePicture.loadFromURLCircular(pps[4])
            6 -> binding.ivProfilePicture.loadFromURLCircular(pps[5])
            7 -> binding.ivProfilePicture.loadFromURLCircular(pps[6])
            8 -> binding.ivProfilePicture.loadFromURLCircular(pps[7])
            9 -> binding.ivProfilePicture.loadFromURLCircular(pps[8])
            10 -> binding.ivProfilePicture.loadFromURLCircular(pps[9])
        }
    }

    fun printUser(usuario: Usuario) {
        imgCount = usuario.foto.toInt()
        binding.etName.setText(usuario.nombre)
        binding.etLastname1.setText(usuario.apPaterno.toString())
        binding.etLastname2.setText(usuario.apMaterno)
        binding.etEmail.setText(usuario.correo)

        setImage()

    }

}