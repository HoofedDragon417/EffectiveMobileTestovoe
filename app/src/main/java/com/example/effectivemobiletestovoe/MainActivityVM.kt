package com.example.effectivemobiletestovoe

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.effectivemobiletestovoe.common.room.dao.VacancyDao
import com.example.effectivemobiletestovoe.models.mock.Mock
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.serialization.json.Json
import java.io.InputStream

class MainActivityVM(
    private val vacancyDao: VacancyDao
) : ViewModel() {
    fun checkVacancies(stream: InputStream) {
        viewModelScope.launch(Dispatchers.IO) {
            val vacancies = vacancyDao.getVacancies()

            vacancies.ifEmpty {
                val mockData = stream.bufferedReader().use {
                    it.readText()
                }

                val listOfVacancies = Json.decodeFromString<Mock>(mockData).vacancies
                vacancyDao.insertVacancies(listOfVacancies)
            }

            stream.close()
        }

    }
}