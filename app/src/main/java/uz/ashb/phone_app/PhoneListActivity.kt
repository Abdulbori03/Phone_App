package uz.ashb.phone_app

import Adapter.PhoneListAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class PhoneListActivity : AppCompatActivity() {

    lateinit var phoneListAdapter: PhoneListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone_list)

        phoneListAdapter = PhoneListAdapter(this, )

    }
}