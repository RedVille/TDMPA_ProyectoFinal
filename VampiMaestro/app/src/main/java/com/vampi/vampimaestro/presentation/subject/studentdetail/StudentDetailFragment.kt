package com.vampi.vampimaestro.presentation.subject.studentdetail

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.vampi.vampimaestro.R

class StudentDetailFragment : Fragment() {

    companion object {
        fun newInstance() = StudentDetailFragment()
    }

    private lateinit var viewModel: StudentDetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.student_detail_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(StudentDetailViewModel::class.java)
        // TODO: Use the ViewModel
    }

}