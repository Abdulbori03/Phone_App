package uz.ashb.phone_app

import Utils.MyData
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadData()

        btn_menu.setOnClickListener {
            startActivity(Intent(this, MenuGridActivity::class.java))
        }
    }

    private fun loadData(){
        MyData.typeListName.add("iPhone")
        MyData.typeListName.add("Samsung")
        MyData.typeListName.add("Mi")
        MyData.typeListName.add("Sony")
        MyData.typeListName.add("Huawei")
        MyData.typeListName.add("Artel")

    }

}