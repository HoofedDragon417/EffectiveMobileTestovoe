package com.example.effectivemobiletestovoe.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.effectivemobiletestovoe.R
import com.example.effectivemobiletestovoe.databinding.FragmentLoginBinding
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import org.koin.androidx.viewmodel.ext.android.viewModel

class LoginFragment() : Fragment(R.layout.fragment_login) {
    private val binding by viewBinding(FragmentLoginBinding::bind)
    private val viewModel: LoginVM by viewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        subscription()
        viewModel.getVacancies()
    }

    private fun subscription() {
        viewModel.daoResult.onEach {
            binding.tvCenter.text = it
        }.launchIn(lifecycleScope)
    }

    companion object {
        fun newInstance() =
            LoginFragment()
    }
}