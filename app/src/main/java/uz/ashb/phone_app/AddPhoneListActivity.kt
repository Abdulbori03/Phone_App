package uz.ashb.phone_app

import Adapter.ItemGridOnClick
import Adapter.TypeAdapter
import Utils.MyData
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_phone_list.*

class AddPhoneListActivity : AppCompatActivity() {

    lateinit var typeAdapter: TypeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone_list)

    typeAdapter = TypeAdapter( this, MyData.typeListName, object : ItemGridOnClick{
        override fun onClick(type: String, position: Int) {
                val intent = Intent(this@AddPhoneListActivity, AddPhoneActivity::class.java)
            intent.putExtra("type", position)
            startActivity(intent)
        }
    })
        list_phones.adapter = typeAdapter
    }
}