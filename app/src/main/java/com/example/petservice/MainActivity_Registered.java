package com.example.petservice;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_Registered extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    RadioGroup rb_registered;
    Bundle bag = new Bundle();
    Intent intent;
    MainActivity_Registered2 Registered2;
    public static final String A = "請重新登入！";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registered);
        Registered2 = new MainActivity_Registered2();

        Button btnregistered = findViewById(R.id.btnregistered);
        Button btnback = findViewById(R.id.btnback);
        rb_registered = findViewById(R.id.rb_registered);
        bag.putString("method", "男");
        rb_registered.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.rb_boy:
                        bag.putString("method", "男");
                        break;
                    case R.id.rb_girl:
                        bag.putString("method", "女");
                        break;
                }
            }
        });
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity_Registered.this, MainActivity_User.class);
                startActivity(intent);
                finish();
            }
        });
        btnregistered.setOnClickListener(new View.OnClickListener() {
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
        registerReceiver(Registered2, filter);
}
        @Override
        protected void onPause(){
        super.onPause();
        unregisterReceiver(Registered2);
}
    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

    }
}