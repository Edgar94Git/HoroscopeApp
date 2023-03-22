package com.ereyes.horoscopeapp.ui.compatibility

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ereyes.horoscopeapp.R
import com.ereyes.horoscopeapp.databinding.FragmentCompatibilityBinding

class CompatibilityFragment : Fragment() {

    private lateinit var binding: FragmentCompatibilityBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentCompatibilityBinding.inflate(inflater, container, false)
        return binding.root
    }
}