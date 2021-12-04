package com.vampi.vampimaestro.presentation.subject.subjectdetail

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.vampi.vampimaestro.R

class SubjectDetailFragment : Fragment() {

    companion object {
        fun newInstance() = SubjectDetailFragment()
    }

    private lateinit var viewModel: SubjectDetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.subject_detail_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SubjectDetailViewModel::class.java)
        // TODO: Use the ViewModel
    }

}