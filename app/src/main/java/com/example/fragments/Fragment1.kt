package com.example.fragments

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.SurfaceControl
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class Fragment1 : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "onCreate: 1st Fragment")
        super.onCreate(savedInstanceState)

    }
    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        Log.d(TAG, "onCreateView: 1st Fragment")
        // Inflate the layout for this fragment


        val v = inflater.inflate(R.layout.fragment_1, container, false)
        val btn1 = v.findViewById<Button>(R.id.button1)
        btn1.setOnClickListener {
            val fragment2 = Fragment2()
            val transaction : FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.MainLayout, fragment2)
            transaction.addToBackStack(null)
            transaction.commit()
//            parentFragmentManager.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE)
        }


        return v
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d(TAG, "onViewCreated: 1st Fragment")
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        Log.d(TAG, "onViewStateRestored: 1st Fragment")
        super.onViewStateRestored(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: 1st Fragment")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: 1st Fragment")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: 1st Fragment")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: 1st Fragment")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(TAG, "onSaveInstanceState: 1st Fragment")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "onDestroyView: 1st Fragment")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: 1st Fragment")
    }




}