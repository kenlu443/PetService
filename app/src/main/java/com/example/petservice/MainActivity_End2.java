package com.example.petservice;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_End2 extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction() == Intent.ACTION_AIRPLANE_MODE_CHANGED || intent.getAction() == MainActivity_End.B){

            Toast.makeText(context,"感謝您的購買！"+intent.getAction().toString(),Toast.LENGTH_LONG).show();
        }
    }
}