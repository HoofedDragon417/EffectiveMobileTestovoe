package com.example.effectivemobiletestovoe.common.di.cicerone

import com.example.effectivemobiletestovoe.ui.LoginFragment
import com.github.terrakok.cicerone.androidx.FragmentScreen

object Screens {
    fun Login() = FragmentScreen { LoginFragment.newInstance() }
}