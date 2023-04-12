package com.geminiboy.tugaslogin.login

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.geminiboy.tugaslogin.MainActivity
import com.geminiboy.tugaslogin.R


class SplashFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_splash, container, false)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Handler().postDelayed({
            if (context?.getSharedPreferences("dataregist", Context.MODE_PRIVATE)!!.contains("username")){
                Navigation.findNavController(view).navigate(R.id.action_splashFragment_to_homeFragment)
            }else{
                Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_loginFragment)
            }

        },3000)
    }
}