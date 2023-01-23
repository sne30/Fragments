package com.example.fragments

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val fragment1 = Fragment1()
        val fm :FragmentManager = supportFragmentManager
        fm.beginTransaction().add(R.id.MainLayout,fragment1).commit()
//        val transaction =  supportFragmentManager.beginTransaction()
//        transaction.add(R.id.MainLayout,fragment1).commit()

////        val fragmentManager = supportFragmentManager
////        //this will clear the back stack and displays no animation on the screen
////        //this will clear the back stack and displays no animation on the screen
           //fm.popBackStackImmediate(null, FragmentManager.POP_BACK_STACK_INCLUSIVE)

//        val count = supportFragmentManager.backStackEntryCount
//
//        for (i in 0 until count) {
//            supportFragmentManager.popBackStack()
//        }

//        val fm: FragmentManager = fragmentManager // or 'getSupportFragmentManager();'

//




    }
}