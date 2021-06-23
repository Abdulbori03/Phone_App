package uz.ashb.phone_app

import Models.Phone
import Utils.MySharedPrefarance
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_add_phone.*

class AddPhoneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_phone)

        MySharedPrefarance.init(this)

        val type = intent.getIntExtra("type", -1)
        
        btn_save.setOnClickListener { 
            val name = edt_phone_name.text.toString().trim()
            val  features = edt_features.text.toString().trim()
            
            if (name !="" && features!=""&& type!=-1){
                val list = MySharedPrefarance.obektString
                list.add(Phone(type, name, features))
                MySharedPrefarance.obektString = list
                Toast.makeText(this, "Save", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show()
            }
        }
    }
}