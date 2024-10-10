package com.example.effectivemobiletestovoe.common.di

import com.example.effectivemobiletestovoe.common.di.cicerone.ciceroneModule
import org.koin.dsl.module

val appModules = module{
    includes(
        ciceroneModule
    )
}