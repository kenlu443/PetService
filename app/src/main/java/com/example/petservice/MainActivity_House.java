package com.example.petservice;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_House extends AppCompatActivity {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house);
        Button btnback = findViewById(R.id.btnback);

        Button btnhouse1_1 = findViewById(R.id.btnhouse1_1);
        btnhouse1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri= Uri.parse("http://www.star-dog-school.tw/%E5%AF%B5%E7%89%A9%E6%97%85%E9%A4%A8/");
                Intent i=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(i);
            }
        });
        Button btnhouse1_2 = findViewById(R.id.btnhouse1_2);
        btnhouse1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri= Uri.parse("https://www.petbacker.com.tw/?gclid=EAIaIQobChMIoIn-poPp5QIVi4KRCh3D1wZTEAAYAiAAEgKzGPD_BwE");
                Intent i=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(i);
            }
        });
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity_House.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}

