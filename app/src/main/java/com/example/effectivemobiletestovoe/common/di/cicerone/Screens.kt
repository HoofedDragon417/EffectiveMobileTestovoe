package com.example.effectivemobiletestovoe.common.di.cicerone

import com.example.effectivemobiletestovoe.LoginFragment
import com.github.terrakok.cicerone.androidx.FragmentScreen

object Screens {
    fun Login() = FragmentScreen{ LoginFragment() }
}