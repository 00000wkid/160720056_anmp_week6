package com.example.a160720056_w4.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.a160720056_w4.R
import com.example.a160720056_w4.viewmodel.ListViewModel

class StudentListFragment : Fragment() {
private lateinit var viewModel: ListViewModel
private val adapter=StudentListAdapter(arrayListOf())

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_student_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel=viewModelProvider(this).get(ListViewModel::class.java)
        viewModel.refresh()

        val recView=view.findViewById<RecyclerView>(R.id.recView)
        recView.adapter=adapter
        observeViewModel()
    }

    private fun viewModelProvider(studentListFragment: StudentListFragment): Any {

    }



}