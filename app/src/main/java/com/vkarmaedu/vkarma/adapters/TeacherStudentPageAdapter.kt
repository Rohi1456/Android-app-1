package com.vkarmaedu.vkarma.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.vkarmaedu.vkarma.fragment.ProfileAttenFragment
import com.vkarmaedu.vkarma.fragment.ProfileDetailFragment

class TeacherStudentPageAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> ProfileDetailFragment()
            else -> ProfileAttenFragment()
        }
    }

    override fun getCount(): Int = 2

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "DETAILS"
            else -> "Attendance"
        }
    }


}