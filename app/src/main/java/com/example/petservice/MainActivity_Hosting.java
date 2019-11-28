package com.example.petservice;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_Hosting extends AppCompatActivity {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hosting);
        Button btnback = findViewById(R.id.btnback);
        Button btnhosting1_1 = findViewById(R.id.btnhosting1_1);

        btnhosting1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri= Uri.parse("https://kikinote.net/155646");
                Intent i=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(i);
            }
        });
        Button btnhosting1_2 = findViewById(R.id.btnhosting1_2);
        btnhosting1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri= Uri.parse("https://www.petbacker.com.tw/d/%E6%A1%83%E5%9C%92%E5%B8%82--%E5%8F%B0%E7%81%A3");
                Intent i=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(i);
            }
        });
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity_Hosting.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}

