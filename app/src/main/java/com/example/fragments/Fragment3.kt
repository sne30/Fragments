package com.example.fragments

import android.content.ContentValues
import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class Fragment3 : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "onCreate: 3rd Fragment")
        super.onCreate(savedInstanceState)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d(TAG, "onViewCreated: 3rd Fragment")
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        Log.d(TAG, "onViewStateRestored: 3rd Fragment")
        super.onViewStateRestored(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: 3rd Fragment")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: 3rd Fragment")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: 3rd Fragment")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: 3rd Fragment")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(TAG, "onSaveInstanceState: 3rd Fragment")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "onDestroyView: 3rd Fragment")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: 3rd Fragment")
    }

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        Log.d(TAG, "onCreateView: 3rd Fragment")
        // Inflate the layout for this fragment
        val v =inflater.inflate(R.layout.fragment_3, container, false)
        val btn3 = v.findViewById<Button>(R.id.button3)
        val btn4 = v.findViewById<Button>(R.id.button4)

        btn3.setOnClickListener {
            val fragment1 = Fragment1()
            val transaction : FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.MainLayout, fragment1)
            //transaction.commit()
           // transaction.addToBackStack(null)
            parentFragmentManager.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE)

        }

        btn4.setOnClickListener {
            activity?.finishAffinity()
        }

        return v
    }
}