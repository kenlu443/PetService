package com.example.petservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MainActivity_End3 extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction() == Intent.ACTION_AIRPLANE_MODE_CHANGED || intent.getAction() == MainActivity_End.C){

            Toast.makeText(context,"想好再買！"+intent.getAction().toString(),Toast.LENGTH_LONG).show();
        }
    }
}