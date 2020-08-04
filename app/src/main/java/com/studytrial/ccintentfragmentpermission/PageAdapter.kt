package com.studytrial.ccintentfragmentpermission

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class PageAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
        private val pages = listOf(
            Fragment1(), Fragment2(), Fragment3()
        )

        override fun getItem(position: Int): Fragment {
            return pages[position]
        }

        override fun getCount(): Int {
            return pages.size
        }

        override fun getPageTitle(position: Int): CharSequence? {
            return when(position){
                0 -> "Fragment A"
                1 -> "Fragment B"
                else -> "Fragment C"
            }
        }
}