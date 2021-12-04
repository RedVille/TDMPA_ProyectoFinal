package com.vampi.vampimaestro.presentation.profile.detail

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.vampi.vampimaestro.R

class ProfileDetailFragment : Fragment() {

    companion object {
        fun newInstance() = ProfileDetailFragment()
    }

    private lateinit var viewModel: ProfileDetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.profile_detail_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ProfileDetailViewModel::class.java)
        // TODO: Use the ViewModel
    }

}