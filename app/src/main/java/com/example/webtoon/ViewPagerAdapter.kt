package com.example.webtoon

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(private val mainActivity: MainActivity) :
    FragmentStateAdapter(mainActivity) {

    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                return WebViewFragment(position, "https://comic.naver.com/webtoon?tab=mon").apply {
                    listener = mainActivity // 리스너 설정을 해주야 액티비티에서 변화 감지
                }
            }
            1 -> {
                return WebViewFragment(position, "https://comic.naver.com/webtoon?tab=tue").apply {
                    listener = mainActivity
                }
            }
            else -> {
                return WebViewFragment(position, "https://comic.naver.com/webtoon?tab=wed").apply {
                    listener = mainActivity
                }
            }
        }
    }
}