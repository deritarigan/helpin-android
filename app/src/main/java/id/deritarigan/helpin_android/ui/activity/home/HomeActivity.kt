package id.deritarigan.helpin_android.ui.activity.home

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import id.deritarigan.helpin_android.R
import id.deritarigan.helpin_android.ui.fragment.HomeFragment
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        showFragment(HomeFragment(),R.id.fragmentContainer)
        btmNavigation.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.navigation_home->{
                    Toast.makeText(HomeActivity@this,"Home",Toast.LENGTH_LONG).show()
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.navigation_find->{
                    Toast.makeText(HomeActivity@this,"Find",Toast.LENGTH_LONG).show()
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.navigation_profile->{
                    Toast.makeText(HomeActivity@this,"Profile",Toast.LENGTH_LONG).show()
                    return@setOnNavigationItemSelectedListener true
                }
                else->{
                    return@setOnNavigationItemSelectedListener false
                }
            }
        }
    }


//    protected var mNavListener: NavigationBottomBar.OnNavigationItemSelectedListener =
//        object : NavigationBottomBar.OnNavigationItemSelectedListener() {
//
//            override fun onNavigationItemSelected(item: View): Boolean {
//                when (item.id) {
//                    R.id.llHome -> {
//
//                        selectorMenuIndex(0)
//
//                        return true
//                    }
//
//                    R.id.llHome2 -> {
//
//                        selectorMenuIndex(1)
//                        return true
//                    }
//
//                    R.id.llHome3 -> {
//                        selectorMenuIndex(2)
//                        return true
//                    }
//
//                    R.id.llHome4 -> {
//                        selectorMenuIndex(3)
//                        return true
//                    }
//
//                    R.id.llHome5 -> {
//                        selectorMenuIndex(4)
//                        return true
//                    }
//
//                    else -> selectorMenuIndex(0)
//                }
//                return false
//            }
//
//        }
//
//    fun selectorMenuIndex(menuIndex: Int) {
//
//        when (menuIndex) {
//            0 -> {
////                showFragment(HomeFragment(), R.id.lyContainer)
//                NavigationBottomBar.setMenuSelected(1, this)
//            }
//
//            1 -> {
////                showFragment(ScheduleFragment(), R.id.lyContainer)
//                NavigationBottomBar.setMenuSelected(2, this)
//            }
//
//            2 -> {
////                showFragment(HistoryFragment(), R.id.lyContainer)
//                NavigationBottomBar.setMenuSelected(3, this)
//            }
//
//            3 -> {
////                showFragment(HistoryFragment(), R.id.lyContainer)
//                NavigationBottomBar.setMenuSelected(4, this)
//            }
//
//            4 -> {
////                showFragment(HistoryFragment(), R.id.lyContainer)
//                NavigationBottomBar.setMenuSelected(5, this)
//            }
//        }
//    }

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
