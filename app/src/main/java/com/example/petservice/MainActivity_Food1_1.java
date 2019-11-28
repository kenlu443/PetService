package com.example.petservice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_Food1_1 extends AppCompatActivity {
    TextView txtmsg;
    Intent intent;
    Bundle get_bag;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food1_1);
        Button btnback = findViewById(R.id.btnback);
        txtmsg = findViewById(R.id.txtmsg);
        intent = new Intent();
        get_bag = getIntent().getExtras();
        String info = get_bag.getString("INFO");
        String name = get_bag.getString("NAME");
        String specification = get_bag.getString("SPECIFICATION");

        txtmsg.setText(name + "\n" + specification + "\n" + info );
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity_Food1_1.this, MainActivity_Food.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
