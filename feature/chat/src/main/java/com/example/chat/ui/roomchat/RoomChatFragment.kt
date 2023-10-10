package com.example.chat.ui.roomchat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.chat.R
import com.example.chat.databinding.FragmentRoomChatBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class RoomChatFragment : Fragment() {

    private val viewModel: RoomChatViewModel by viewModel()
    lateinit var binding: FragmentRoomChatBinding
    private val args: RoomChatFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return FragmentRoomChatBinding.inflate(inflater, container, false).apply {
            binding = this
        }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel
        Toast.makeText(requireContext(), args.data+"<<", Toast.LENGTH_LONG).show()

        binding.btn2.setOnClickListener {
            findNavController().navigate(RoomChatFragmentDirections.openGroupDetailFragment())
        }


    }


}