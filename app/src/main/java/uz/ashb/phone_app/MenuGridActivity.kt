package uz.ashb.phone_app

import Adapter.ItemGridOnClick
import Adapter.TypeAdapter
import Utils.MyData
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu_grid.*

class MenuGridActivity : AppCompatActivity() {

    lateinit var typeAdapter: TypeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_grid)
        supportActionBar?.hide()

        typeAdapter = TypeAdapter(this, MyData.typeListName, object : ItemGridOnClick{
            override fun onClick(type: String, position: Int) {
                val intent = Intent(this@MenuGridActivity, PhoneListActivity::class.java)
                intent.putExtra("type", position)
                startActivity(intent)
            }
        })

        grid_view.adapter = typeAdapter

    }
}