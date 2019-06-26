package id.deritarigan.helpin_android.ui.activity.auth

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import id.deritarigan.helpin_android.R
import id.deritarigan.helpin_android.ui.activity.home.HomeActivity
import kotlinx.android.synthetic.main.partial_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        init()

    }

    private fun init(){
        btnLogin.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        })
    }
}
