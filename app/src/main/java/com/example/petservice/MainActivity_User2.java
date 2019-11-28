package com.example.petservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MainActivity_User2 extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction() == Intent.ACTION_AIRPLANE_MODE_CHANGED || intent.getAction() == MainActivity_User.A){

            Toast.makeText(context,"不好意思！"+intent.getAction().toString(),Toast.LENGTH_LONG).show();
        }
    }
}