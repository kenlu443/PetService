package com.example.petservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnfood = findViewById(R.id.btnfood);
        Button btnsports = findViewById(R.id.btnsports);
        Button btnbeauty = findViewById(R.id.btnbeauty);
        Button btntraining = findViewById(R.id.btntraining);
        Button btnsocial = findViewById(R.id.btnsocial);
        Button btnhospital = findViewById(R.id.btnhospital);
        Button btnhouse = findViewById(R.id.btnhouse);
        Button btnhosting = findViewById(R.id.btnhosting);
        Button btntaxi = findViewById(R.id.btntaxi);

        btnfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity_Food.class);
                startActivity(intent);
            }
        });
        btnsports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity_Sports.class);
                startActivity(intent);
            }
        });
        btnbeauty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity_Beauty.class);
                startActivity(intent);
            }
        });
        btntraining.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity_Training.class);
                startActivity(intent);
            }
        });
        btnsocial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity_Social.class);
                startActivity(intent);
            }
        });
        btnhospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity_Hospital.class);
                startActivity(intent);
            }
        });
        btnhouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity_House.class);
                startActivity(intent);
            }
        });
        btnhosting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity_Hosting.class);
                startActivity(intent);
            }
        });
        btntaxi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri= Uri.parse("https://www.petbacker.com.tw/pet-taxi");
                Intent i=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(i);
            }
        });
    }
}
