package id.deritarigan.helpin_android.component

import android.app.Activity
import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import id.deritarigan.helpin_android.R

object NavigationBottomBar {
    private var prevMenu: View? = null

    fun setupNavigation(
        nav: ViewGroup,
        activity: Activity,
        listener: NavigationBottomBar.OnNavigationItemSelectedListener
    ) {
        listener.activity = activity

        prevMenu = nav.findViewById(R.id.llHome)
        prevMenu!!.tag = R.drawable.ic_home

        nav.findViewById<View>(R.id.llHome).setOnClickListener { view ->
            listener.onNavigationItemSelected(view)
            setMenuSelected(1, activity)
        }

        nav.findViewById<View>(R.id.llHome2).setOnClickListener { view ->
            listener.onNavigationItemSelected(view)
            setMenuSelected(2, activity)
        }

        nav.findViewById<View>(R.id.llHome3).setOnClickListener { view ->
            listener.onNavigationItemSelected(view)
            setMenuSelected(3, activity)
        }

        nav.findViewById<View>(R.id.llHome4).setOnClickListener { view ->
            listener.onNavigationItemSelected(view)
            setMenuSelected(4, activity)
        }

        nav.findViewById<View>(R.id.llHome5).setOnClickListener { view ->
            listener.onNavigationItemSelected(view)
            setMenuSelected(5, activity)
        }

    }


    fun setMenuSelected(position: Int, activity: Activity) {
        val menus = intArrayOf(R.id.llHome, R.id.llHome2, R.id.llHome3, R.id.llHome4, R.id.llHome5)
        val menuActiveImages = intArrayOf(
            R.drawable.ic_home_black,
            R.drawable.ic_home_black,
            R.drawable.ic_home_black,
            R.drawable.ic_home_black,
            R.drawable.ic_home_black
        )
        val menuInactiveImages = intArrayOf(
            R.drawable.ic_home,
            R.drawable.ic_home,
            R.drawable.ic_home,
            R.drawable.ic_home,
            R.drawable.ic_home
        )

        val imageView = activity.findViewById<ImageView>(menus[position - 1])
        imageView.setImageResource(menuActiveImages[position - 1])
        disablePrevMenu(imageView, menuInactiveImages[position - 1], activity)
    }

    private fun disablePrevMenu(view: View, currentResourceInactiveID: Int, context: Context) {
        if (prevMenu!!.tag === view.tag) return
        (prevMenu as ImageView).setImageResource(prevMenu!!.tag as Int)
        prevMenu = view
        prevMenu!!.tag = currentResourceInactiveID
    }

    open class OnNavigationItemSelectedListener {

        var activity: Activity? = null

        open fun onNavigationItemSelected(item: View): Boolean {
            return false
        }


    }
}