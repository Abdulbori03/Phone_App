package uz.ashb.phone_app

import Adapter.ItemGridOnClick
import Adapter.TypeAdapter
import Utils.MyData
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu_grid.*

class MenuGridActivity : AppCompatActivity() {

    lateinit var typeAdapter: TypeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_grid)

        typeAdapter = TypeAdapter(this, MyData.typeListName, object : ItemGridOnClick{
            override fun onClick(type: String, position: Int) {

            }
        })

        grid_view.adapter = typeAdapter

    }
}