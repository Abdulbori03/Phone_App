package Adapter

import Models.Phone
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.item_phone_list.view.*
import uz.ashb.phone_app.R

class PhoneListAdapter(context: Context, val list: List<Phone>, var itemClickListPhone: ItemClickListPhone ) : ArrayAdapter<Phone>(context, R.layout.item_phone_list, list) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val itemView: View
        if (convertView != null) {
            itemView = convertView
        } else {
            itemView =
                LayoutInflater.from(parent.context).inflate(R.layout.item_phone_list, parent, false)
        }
        itemView.txt_item_phone.text = list[position].name
        itemView.card_item_phone.setOnClickListener {

        }
        return itemView
    }
}
interface ItemClickListPhone{
    fun onClick(phone: Phone, position: Int)
}