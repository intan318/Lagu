package com.intanyoshanaoewen.lagu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var content: FrameLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigation.setOnNavigationItemSelectedListener { item ->
            when(item.itemId){
                R.id.navigation_find -> {
                    loadFindFragment(savedInstanceState)
                }
                R.id.navigation_wishlist -> {
                    loadWishlistFragment(savedInstanceState)
                }
                R.id.navigation_calendar-> {
                    loadCalendarFragment(savedInstanceState)
                }
                R.id.navigation_create-> {
                    loadCreateFragment(savedInstanceState)
                }
                R.id.navigation_logout-> {
                    loadAccountFragment(savedInstanceState)
                }
            }
            true
        }

        bottomNavigation.selectedItemId = R.id.navigation_find
    }

    private fun loadAccountFragment(savedInstanceState: Bundle?) {
        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.navigationContainer, AccountFragment(), AccountFragment::class.java.simpleName)
                .commitAllowingStateLoss()
        }
    }

    private fun loadCreateFragment(savedInstanceState: Bundle?) {
        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.navigationContainer, CreateFragment(), CreateFragment::class.java.simpleName)
                .commitAllowingStateLoss()
        }
    }

    private fun loadWishlistFragment(savedInstanceState: Bundle?) {
        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.navigationContainer, WishlistFragment(), WishlistFragment::class.java.simpleName)
                .commitAllowingStateLoss()
        }
    }

    private fun loadFindFragment(savedInstanceState: Bundle?) {
        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.navigationContainer, FindFragment(), FindFragment::class.java.simpleName)
                .commitAllowingStateLoss()
        }
    }

    private fun loadCalendarFragment(savedInstanceState: Bundle?) {
        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.navigationContainer, CalendarFragment(), CalendarFragment::class.java.simpleName)
                .commitAllowingStateLoss()
        }
    }
}
