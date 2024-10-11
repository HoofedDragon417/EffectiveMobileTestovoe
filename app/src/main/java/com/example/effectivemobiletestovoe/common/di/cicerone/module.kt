package com.example.effectivemobiletestovoe.common.di.cicerone

import com.github.terrakok.cicerone.Cicerone
import org.koin.dsl.module

private val cicerone = Cicerone.create()

val ciceroneModule = module {
    single { cicerone }
    single { cicerone.router }
    single { cicerone.getNavigatorHolder() }
}