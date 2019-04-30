package com.example.intent


import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_a.*

class AActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)

    }

    fun jump (view: View) {//定義jump按下後觸發

        val intent = Intent()//定義資料傳送到BActivity
        intent.setClass(this@AActivity, BActivity::class.java)
        val meg = et1.text.toString()//在edit text輸入欲傳送訊息
        intent.putExtra("string",meg)//傳遞訊息給BActivity
        startActivity(intent)//開始傳送
    }
}

