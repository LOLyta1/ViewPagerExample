package com.nata.tsivileva.kotlintraning.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.nata.tsivileva.kotlintraning.R

class FragmentOne: Fragment(),IFragment {

    override val title: String
        get() = resources.getString(R.string.fragment_one_text)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}