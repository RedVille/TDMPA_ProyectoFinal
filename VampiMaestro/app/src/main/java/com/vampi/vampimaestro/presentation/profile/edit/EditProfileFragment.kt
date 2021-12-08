package com.vampi.vampimaestro.presentation.profile.edit

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.vampi.vampimaestro.R
import com.vampi.vampimaestro.core.extension.failure
import com.vampi.vampimaestro.core.extension.observe
import com.vampi.vampimaestro.core.presentation.BaseFragment
import com.vampi.vampimaestro.core.presentation.BaseViewState
import com.vampi.vampimaestro.databinding.EditProfileFragmentBinding
import com.vampi.vampimaestro.databinding.ProfileDetailFragmentBinding
import com.vampi.vampimaestro.domain.model.Usuario
import com.vampi.vampimaestro.presentation.login.LoginViewState
import com.vampi.vampimaestro.presentation.profile.detail.ProfileDetailFragmentDirections
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.WithFragmentBindings
import kotlinx.coroutines.DelicateCoroutinesApi

@AndroidEntryPoint
@WithFragmentBindings
@DelicateCoroutinesApi
class EditProfileFragment : BaseFragment(R.layout.edit_profile_fragment) {

    private lateinit var binding: EditProfileFragmentBinding

    private val editProfileViewModel by viewModels<EditProfileViewModel>()

    var user = Usuario()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        editProfileViewModel.apply {
            observe(state, ::onViewStateChanged)
            failure(failure, ::handleFailure)
        }
    }

    override fun onViewStateChanged(state: BaseViewState?) {
        super.onViewStateChanged(state)
        when(state){

        }
    }

    override fun setBinding(view: View) {
        binding = EditProfileFragmentBinding.bind(view)
        binding.apply {
            lifecycleOwner = this@EditProfileFragment

            i

        }
    }


}