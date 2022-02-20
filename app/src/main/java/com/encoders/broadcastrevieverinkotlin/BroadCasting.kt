package com.encoders.broadcastrevieverinkotlin

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class BroadCasting: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val isAiroplaneModeEnable: Boolean = intent?.getBooleanExtra("state", false)!!
        if (isAiroplaneModeEnable){
            Toast.makeText(context,"Airoplane mode enabled", Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(context,"Airoplane mode Disable", Toast.LENGTH_LONG).show()
        }
    }
}