package uz.ashb.phone_app

import Adapter.ItemClickListPhone
import Adapter.PhoneListAdapter
import Models.Phone
import Utils.MySharedPrefarance
import android.content.ClipData
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_phone_list.*

class PhoneListActivity : AppCompatActivity() {

    lateinit var phoneListAdapter: PhoneListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone_list)
        supportActionBar?.hide()

        val type = intent.getIntExtra("type", -1)

        MySharedPrefarance.init(this)
        val list = MySharedPrefarance.obektString

        var listSort = ArrayList<Phone>()

        for(phone in list){
            if (phone.type == type){
                    listSort.add(phone)
            }
        }

        phoneListAdapter = PhoneListAdapter(this, listSort, object : ItemClickListPhone{
            override fun onClick(phone: Phone, position: Int) {
                val intent = Intent(this@PhoneListActivity, About_Phone_Activity::class.java)
                intent.putExtra("pisition", position)
                startActivity(intent)

            }
        })
        list_phones.adapter = phoneListAdapter


    }
}