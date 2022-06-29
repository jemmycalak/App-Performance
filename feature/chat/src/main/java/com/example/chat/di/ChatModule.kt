package com.example.chat.di

import com.example.chat.ui.listchat.ListChatViewModel
import com.example.chat.ui.roomchat.RoomChatViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val chatModule = module {
    viewModel { RoomChatViewModel() }
    viewModel { ListChatViewModel() }
}
