package com.nata.tsivileva.kotlintraning

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.nata.tsivileva.kotlintraning.Factory.FragmentTypes


class MyFragmentAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
       return FragmentTypes.values()[position].fragment

    }
    override fun getCount(): Int {
        return FragmentTypes.values().count()
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return FragmentTypes.values()[position].title
    }
}