package com.example.effectivemobiletestovoe.common.di

import com.example.effectivemobiletestovoe.common.di.cicerone.ciceroneModule
import com.example.effectivemobiletestovoe.common.di.room.roomModule
import com.example.effectivemobiletestovoe.common.di.viewModels.viewModelModule
import org.koin.dsl.module

val appModules = module {
    includes(
        ciceroneModule,
        roomModule,
        viewModelModule
    )
}