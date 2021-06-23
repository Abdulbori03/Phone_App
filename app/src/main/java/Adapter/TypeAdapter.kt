package Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.item_grid.view.*
import uz.ashb.phone_app.R

class TypeAdapter(context: Context, var list: List<String>, val itemGridOnClick: ItemGridOnClick):ArrayAdapter<String>(context, R.layout.item_grid, list) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val itemView:View
        if (convertView!=null){
            itemView = convertView
        }else{
            itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_grid, parent, false)
        }

        itemView.txt_item_grid.text = list[position]

        itemView.card_item.setOnClickListener {
            itemGridOnClick.onClick(list[position],position)
        }

        return itemView
    }

}
interface ItemGridOnClick{
    fun onClick(type:String, position: Int)
}