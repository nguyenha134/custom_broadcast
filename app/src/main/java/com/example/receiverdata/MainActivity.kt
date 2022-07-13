package com.example.receiverdata

import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.receiverdata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var receiver: MyReceiver = MyReceiver()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = IntentFilter("com.example.ringtone_SEND_RECEIVER")
        registerReceiver(receiver, intent)
    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(receiver)
    }
}