package com.example.petservice;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_Beauty  extends AppCompatActivity {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beauty);
        Button btnback = findViewById(R.id.btnback);

        Button btnbeauty1_1 = findViewById(R.id.btnbeauty1_1);
        btnbeauty1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri= Uri.parse("https://zh-tw.facebook.com/CAMACAMAPetGroomingHouse");
                Intent i=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(i);
            }
        });
        Button btnbeauty1_2 = findViewById(R.id.btnbeauty1_2);
        btnbeauty1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri= Uri.parse("https://zh-tw.facebook.com/Habi.salon/");
                Intent i=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(i);
            }
        });
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity_Beauty.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}

