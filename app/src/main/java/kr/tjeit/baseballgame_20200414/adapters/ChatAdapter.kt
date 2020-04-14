package kr.tjeit.baseballgame_20200414.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kr.tjeit.baseballgame_20200414.R
import kr.tjeit.baseballgame_20200414.datas.Chat

class ChatAdapter(context:Context, resId:Int, list:ArrayList<Chat>) : ArrayAdapter<Chat>(context, resId, list) {

    val mContext = context
    val mList = list
    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        tempRow?.let {

        }.let {
            tempRow = inf.inflate(R.layout.chat_list_item, null)
        }
        val row = tempRow!!


        return row
    }


}