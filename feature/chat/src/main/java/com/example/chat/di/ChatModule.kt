package com.example.chat.di

import com.example.chat.ChatViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val chatModule = module {
    viewModel { ChatViewModel() }
}
