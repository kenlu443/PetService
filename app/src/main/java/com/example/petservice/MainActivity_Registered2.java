package com.example.petservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_Registered2 extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction() == Intent.ACTION_AIRPLANE_MODE_CHANGED || intent.getAction() == MainActivity_Registered.A){

            Toast.makeText(context,"您已完成註冊！"+intent.getAction().toString(),Toast.LENGTH_LONG).show();
        }
    }
}