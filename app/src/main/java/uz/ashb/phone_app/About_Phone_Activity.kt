package uz.ashb.phone_app

import Utils.MySharedPrefarance
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_about__phone_.*
import kotlinx.android.synthetic.main.activity_phone_list.*

class About_Phone_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about__phone_)
        supportActionBar?.hide()

        MySharedPrefarance.init(this)
        val list = MySharedPrefarance.obektString

        val positions = intent.getIntExtra("position", 0 )
        txt_name.text = list[positions].name

        txt_xarakter.text = list[positions].info



    }
}