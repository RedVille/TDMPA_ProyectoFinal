package com.vampi.vampimaestro.presentation.profile.detail

import android.annotation.SuppressLint
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.vampi.vampimaestro.R
import com.vampi.vampimaestro.core.extension.failure
import com.vampi.vampimaestro.core.extension.loadFromURLCircular
import com.vampi.vampimaestro.core.extension.observe
import com.vampi.vampimaestro.core.presentation.BaseFragment
import com.vampi.vampimaestro.core.presentation.BaseViewState
import com.vampi.vampimaestro.databinding.FragmentMenuBinding
import com.vampi.vampimaestro.databinding.ProfileDetailFragmentBinding
import com.vampi.vampimaestro.domain.model.Usuario
import com.vampi.vampimaestro.presentation.login.LoginViewState
import com.vampi.vampimaestro.presentation.menu.MenuFragmentDirections
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.WithFragmentBindings
import kotlinx.coroutines.DelicateCoroutinesApi

@AndroidEntryPoint
@WithFragmentBindings
@DelicateCoroutinesApi
class ProfileDetailFragment : BaseFragment(R.layout.profile_detail_fragment) {

    private lateinit var binding: ProfileDetailFragmentBinding

    private val profileDetailViewModel by viewModels<ProfileDetailViewModel>()

    var user = Usuario()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        profileDetailViewModel.apply {
            observe(state, ::onViewStateChanged)
            failure(failure, ::handleFailure)
        }
    }

    override fun onViewStateChanged(state: BaseViewState?) {
        super.onViewStateChanged(state)
        when(state){
            is LoginViewState.LoggedUser -> printUser(state.usuario)
        }
    }

    @SuppressLint("SetTextI18n")
    fun printUser(usuario: Usuario) {
        user = usuario
        binding.txvNombre.text = "${usuario.nombre} ${usuario.apMaterno} ${usuario.apMaterno}"
        binding.txvMatricula.text = usuario.matricula.toString()
        binding.txvCorreo.text = usuario.correo

        val pps = listOf(
            "https://televisa.brightspotcdn.com/dims4/default/cafe29d/2147483647/strip/true/crop/1300x976+0+0/resize/818x614!/quality/90/?url=https%3A%2F%2Ftelevisa-brightspot.s3.amazonaws.com%2Fapi%2Fd9%2F2e%2F962a87ae4f7eb87738a3729381e0%2Fquien-es-el-gato-vampiro-de-insagram.jpg",
            "https://www.cronica.com.ar/__export/1602468335472/sites/cronica/img/2020/10/11/gato_vampiro_crop1602467581958.png_41183936.png",
            "http://pm1.narvii.com/6620/a6721f1b8d3a87691911782070114c7e4653d6af_00.jpg",
            "https://i1.wp.com/s3.amazonaws.com/tugatocurioso/wp-content/uploads/2019/10/18111403/los-disfraces-de-gato-mas-terrorificos-para-halloween-1504125133.jpg?fit=662%2C476&ssl=1",
            "https://i.pinimg.com/550x/29/e5/19/29e519e3f28c52edcb187966012c2c15.jpg",
            "https://i.pinimg.com/736x/9b/2c/58/9b2c58748351599d906edfe0c582eeee.jpg",
            "https://http2.mlstatic.com/D_NQ_NP_337011-MLM20450951013_102015-O.jpg",
            "https://i.kym-cdn.com/photos/images/facebook/001/306/842/7fe.jpg",
            "https://static.wikia.nocookie.net/spongebob/images/1/17/Graveyard_Shift_198.png/revision/latest?cb=20200706105833",
            "https://www.luminariastv.com/wp-content/uploads/2015/04/Chayanne-vampiro.jpg"
        )

        when(usuario.foto) {
            "1" -> binding.imgPerfil.loadFromURLCircular(pps[0])
            "2" -> binding.imgPerfil.loadFromURLCircular(pps[1])
            "3" -> binding.imgPerfil.loadFromURLCircular(pps[2])
            "4" -> binding.imgPerfil.loadFromURLCircular(pps[3])
            "5" -> binding.imgPerfil.loadFromURLCircular(pps[4])
            "6" -> binding.imgPerfil.loadFromURLCircular(pps[5])
            "7" -> binding.imgPerfil.loadFromURLCircular(pps[6])
            "8" -> binding.imgPerfil.loadFromURLCircular(pps[7])
            "9" -> binding.imgPerfil.loadFromURLCircular(pps[8])
            "10" -> binding.imgPerfil.loadFromURLCircular(pps[9])
        }

    }

    override fun onResume() {
        super.onResume()

        profileDetailViewModel.getLocalUser()
    }

    override fun setBinding(view: View) {
        binding = ProfileDetailFragmentBinding.bind(view)
        binding.apply {
            lifecycleOwner = this@ProfileDetailFragment

            imgEditPerfil.setOnClickListener { navController.navigate((ProfileDetailFragmentDirections.actionProfileDetailFragmentToEditProfileFragment(user))) }

        }
    }


}