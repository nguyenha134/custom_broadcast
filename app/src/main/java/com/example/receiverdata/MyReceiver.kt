package com.example.receiverdata

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        when (intent?.action) {
            "com.example.ringtone_SEND_RECEIVER" -> {
                val textSend = intent.getStringExtra("com.example.ringtone_EXTRA_DATA")
                Toast.makeText(context, "Receiver app receive ${textSend}", Toast.LENGTH_LONG)
                    .show()
            }
        }
    }
}