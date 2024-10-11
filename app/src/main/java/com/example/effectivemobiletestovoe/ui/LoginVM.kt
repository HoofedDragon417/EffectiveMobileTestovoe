package com.example.effectivemobiletestovoe.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.effectivemobiletestovoe.common.room.dao.VacancyDao
import com.example.effectivemobiletestovoe.models.mock.Mock
import com.example.effectivemobiletestovoe.models.vacancies.Vacancy
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class LoginVM(
    private val vacancyDao: VacancyDao
) : ViewModel() {
    private val _daoResult = MutableStateFlow<String>(emptyList<Vacancy>().toString())
    val daoResult = _daoResult.asStateFlow()

    private val _mockResult = MutableStateFlow<Mock?>(null)
    val mockResult = _mockResult.asStateFlow()

    fun getVacancies() {
        viewModelScope.launch(Dispatchers.IO) {
            _daoResult.value = vacancyDao.getVacancies().toString()
        }
    }
}