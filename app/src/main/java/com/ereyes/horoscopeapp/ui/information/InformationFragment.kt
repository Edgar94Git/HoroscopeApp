package com.ereyes.horoscopeapp.ui.information

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ereyes.horoscopeapp.R
import com.ereyes.horoscopeapp.databinding.FragmentInformationBinding


class InformationFragment : Fragment() {

    private lateinit var binding: FragmentInformationBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentInformationBinding.inflate(inflater, container, false)
        return binding.root
    }
}