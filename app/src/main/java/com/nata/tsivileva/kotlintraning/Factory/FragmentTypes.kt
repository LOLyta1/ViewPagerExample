package com.nata.tsivileva.kotlintraning.Factory

import androidx.fragment.app.Fragment
import com.nata.tsivileva.kotlintraning.Fragments.FragmentOne
import com.nata.tsivileva.kotlintraning.Fragments.FragmentThree
import com.nata.tsivileva.kotlintraning.Fragments.FragmentTwo
import com.nata.tsivileva.kotlintraning.R

enum class FragmentTypes(val fragment: Fragment, val titleID: Int) {
    FIRST(FragmentOne(), R.string.fragment_one_text),
    SECOND(FragmentTwo(),R.string.fragment_two_text),
    THIRD(FragmentThree(),R.string.fragment_three_text)
}