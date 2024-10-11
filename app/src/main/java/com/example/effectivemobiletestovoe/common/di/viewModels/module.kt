package com.example.effectivemobiletestovoe.common.di.viewModels

import com.example.effectivemobiletestovoe.MainActivityVM
import com.example.effectivemobiletestovoe.ui.LoginVM
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val viewModelModule = module {
    viewModelOf(::LoginVM)
    viewModelOf(::MainActivityVM)
}