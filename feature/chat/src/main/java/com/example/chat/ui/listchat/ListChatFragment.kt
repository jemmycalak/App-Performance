package com.example.chat.ui.listchat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.chat.R
import com.example.chat.databinding.FragmentListChatBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class ListChatFragment : Fragment() {

    private val viewModel: ListChatViewModel by viewModel()

    lateinit var binding: FragmentListChatBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return FragmentListChatBinding.inflate(inflater, container, false).apply {
            binding = this
        }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.aa

        binding.btn1.setOnClickListener {
            findNavController().navigate(ListChatFragmentDirections.openToChatActivity())
        }

    }


}