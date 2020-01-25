package com.nata.tsivileva.kotlintraning.Factory

import androidx.fragment.app.Fragment
import com.nata.tsivileva.kotlintraning.Fragments.FragmentOne
import com.nata.tsivileva.kotlintraning.Fragments.FragmentThree
import com.nata.tsivileva.kotlintraning.Fragments.FragmentTwo
import com.nata.tsivileva.kotlintraning.R

enum class FragmentTypes(val fragment: Fragment, val title: CharSequence) {
    FIRST(FragmentOne(), "Fragment 1"),
    SECOND(FragmentTwo(),"Fragment 2"),
    THIRD(FragmentThree(),"Fragment 3")
}