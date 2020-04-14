package kr.tjeit.baseballgame_20200414

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kr.tjeit.baseballgame_20200414.adapters.ChatAdapter
import kr.tjeit.baseballgame_20200414.datas.Chat

class MainActivity : BaseActivity() {

    val chatings = ArrayList<Chat>()
    var mChatAdapter:ChatAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }


    override fun setupEvents() {

        okBtn.setOnClickListener {
            chatings.add(Chat(inputEdt.text.toString(), "USER"))
            mChatAdapter?.notifyDataSetChanged()
        }

    }

    override fun setValues() {

        chatings.add(Chat("숫자 야구게임에 오신걸 환영합니다.", "COMPUTER"))
        chatings.add(Chat("세자리 숫자를 맞춰주세요.", "COMPUTER"))
        chatings.add(Chat("중복된 숫자는 없고, 0도 사용되지 않습니다.", "COMPUTER"))

        mChatAdapter = ChatAdapter(mContext, R.layout.chat_list_item, chatings)
        chatListView.adapter = mChatAdapter

    }

}
