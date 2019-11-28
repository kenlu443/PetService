package com.example.petservice;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_Training extends AppCompatActivity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training);
        Button btnback = findViewById(R.id.btnback);
        Button btntraining1_1 = findViewById(R.id.btntraining1_1);
        btntraining1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://www.star-dog-school.tw/%e4%bb%8b%e7%b4%b9%e8%aa%b2%e7%a8%8b/%e5%88%b0%e5%ba%9c%e6%95%99%e5%ad%b8%e7%8b%97%e5%ae%b6%e6%95%99/");
                Intent i = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(i);
            }
        });
        Button btntraining1_2 = findViewById(R.id.btntraining1_2);
        btntraining1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://www.star-dog-school.tw/%e4%bb%8b%e7%b4%b9%e8%aa%b2%e7%a8%8b/%e5%ae%b6%e5%ba%ad%e7%8a%ac%e8%a8%93%e7%b7%b4%e8%aa%b2%e7%a8%8b/");
                Intent i = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(i);
            }
        });
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity_Training.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}