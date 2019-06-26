package id.deritarigan.helpin_android.ui.activity.home

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.View
import id.deritarigan.helpin_android.R
import id.deritarigan.helpin_android.component.NavigationBottomBar
import id.deritarigan.helpin_android.ui.fragment.HomeFragment
import kotlinx.android.synthetic.main.nav_bar_down.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        NavigationBottomBar.setupNavigation(lyNavDown, this, mNavListener)
        selectorMenuIndex(0)
        showFragment(HomeFragment(),R.id.fragmentContainer)

    }


    protected var mNavListener: NavigationBottomBar.OnNavigationItemSelectedListener =
        object : NavigationBottomBar.OnNavigationItemSelectedListener() {

            override fun onNavigationItemSelected(item: View): Boolean {
                when (item.id) {
                    R.id.llHome -> {

                        selectorMenuIndex(0)

                        return true
                    }

                    R.id.llHome2 -> {

                        selectorMenuIndex(1)
                        return true
                    }

                    R.id.llHome3 -> {
                        selectorMenuIndex(2)
                        return true
                    }

                    R.id.llHome4 -> {
                        selectorMenuIndex(3)
                        return true
                    }

                    R.id.llHome5 -> {
                        selectorMenuIndex(4)
                        return true
                    }

                    else -> selectorMenuIndex(0)
                }
                return false
            }

        }

    fun selectorMenuIndex(menuIndex: Int) {

        when (menuIndex) {
            0 -> {
//                showFragment(HomeFragment(), R.id.lyContainer)
                NavigationBottomBar.setMenuSelected(1, this)
            }

            1 -> {
//                showFragment(ScheduleFragment(), R.id.lyContainer)
                NavigationBottomBar.setMenuSelected(2, this)
            }

            2 -> {
//                showFragment(HistoryFragment(), R.id.lyContainer)
                NavigationBottomBar.setMenuSelected(3, this)
            }

            3 -> {
//                showFragment(HistoryFragment(), R.id.lyContainer)
                NavigationBottomBar.setMenuSelected(4, this)
            }

            4 -> {
//                showFragment(HistoryFragment(), R.id.lyContainer)
                NavigationBottomBar.setMenuSelected(5, this)
            }
        }
    }

    fun showFragment(fragment: Fragment?, fragmentResourceID: Int) {
        if (fragment != null) {
            val fragmentManager = this.supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(fragmentResourceID, fragment)
            fragmentTransaction.detach(fragment)
            fragmentTransaction.attach(fragment)
            fragmentTransaction.commit()
        }
    }
}
