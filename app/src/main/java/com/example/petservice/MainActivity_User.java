package com.example.petservice;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_User extends AppCompatActivity {
    MainActivity_User2 Password;
    MainActivity_User3 Try;
    public static final String A = "密碼找不回來QQ";
    public static final String D = "登入成功！";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        Password = new MainActivity_User2();
        Try = new MainActivity_User3();

        Button btnpassword = findViewById(R.id.btnpassword);
        Button btngo = findViewById(R.id.btngo);
        Button btnregistered = findViewById(R.id.btnregistered);
        Button btnmain = findViewById(R.id.btnmain);
        btngo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x = new Intent(D);
                sendBroadcast(x);
                Intent intent = new Intent();
                intent.setClass(MainActivity_User.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        btnregistered.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity_User.this, MainActivity_Registered.class);
                startActivity(intent);
                finish();
            }
        });
        btnmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity_User.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        btnpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(A);
                sendBroadcast(i);
            }
        });
    }
        @Override
        protected void onResume(){
        super.onResume();
        IntentFilter filter = new IntentFilter(A);
        registerReceiver(Password, filter);
        super.onResume();
         IntentFilter filter2 = new IntentFilter(D);
         registerReceiver(Try, filter2);
    }
        @Override
        protected void onPause(){
        super.onPause();
        unregisterReceiver(Password);
        super.onPause();
        unregisterReceiver(Try);
    }
}

