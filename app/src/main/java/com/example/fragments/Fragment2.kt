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


class Fragment2 : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(ContentValues.TAG, "onCreate: 2nd Fragment")
        super.onCreate(savedInstanceState)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d(ContentValues.TAG, "onViewCreated: 2nd Fragment")
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        Log.d(TAG, "onViewStateRestored: 2nd Fragment")
        super.onViewStateRestored(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: 2nd Fragment")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: 2nd Fragment")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: 2nd Fragment")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: 2nd Fragment")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(TAG, "onSaveInstanceState: 2nd Fragment")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "onDestroyView: 2nd Fragment")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: 2nd Fragment")
    }

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        Log.d(TAG, "onCreateView: 2nd Fragment")
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_2, container, false)
        val btn2 = v.findViewById<Button>(R.id.button2)
        btn2.setOnClickListener {
            val fragment3 = Fragment3()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.MainLayout, fragment3)
            transaction.commit()
            transaction.addToBackStack(null)
        }

//        parentFragmentManager.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE)
        return v
    }
}