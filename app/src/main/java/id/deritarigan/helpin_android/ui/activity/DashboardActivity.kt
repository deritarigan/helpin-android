package id.deritarigan.helpin_android.ui.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.animation.AnimationUtils
import id.deritarigan.helpin_android.R
import id.deritarigan.helpin_android.ui.activity.home.HomeActivity
import kotlinx.android.synthetic.main.activity_dashboard.*

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        init()
    }

    private fun init() {
        val upBottom = AnimationUtils.loadAnimation(this, R.anim.slide_down_component)
        val bottomUp = AnimationUtils.loadAnimation(this, R.anim.slide_up_component)

        tvFindHelp.setOnClickListener(View.OnClickListener {
            if (tvFindHelpAction.visibility == View.INVISIBLE) {
                tvFindHelpAction.startAnimation(upBottom)
                tvFindHelpAction.visibility = View.VISIBLE
            } else {
                tvFindHelpAction.startAnimation(bottomUp)
                tvFindHelpAction.visibility = View.INVISIBLE
            }
        })

        tvHelper.setOnClickListener(View.OnClickListener {
            if (tvHelperAction.visibility == View.INVISIBLE) {
                tvHelperAction.startAnimation(upBottom)
                tvHelperAction.visibility = View.VISIBLE
            } else {
                tvHelperAction.startAnimation(bottomUp)
                tvHelperAction.visibility = View.INVISIBLE
            }
        })

        tvFindHelpAction.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
        })
    }
}
