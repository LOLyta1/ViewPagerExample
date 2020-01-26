package com.nata.tsivileva.kotlintraning

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.nata.tsivileva.kotlintraning.Factory.FragmentTypes


class MyFragmentAdapter(val context: Context, fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return FragmentTypes.values()[position].fragment

    }
    override fun getCount(): Int {
        return FragmentTypes.values().count()
    }
    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(
            FragmentTypes.values()[position].titleID
        )
    }
}