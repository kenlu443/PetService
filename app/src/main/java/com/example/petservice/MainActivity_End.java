package com.example.petservice;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_End extends AppCompatActivity {
    MainActivity_End2 Enter;
    MainActivity_End3 Back;
    public static final String B = "歡迎再度光臨！";
    public static final String C = "不要三心二意！";

    Intent intent;
    private AlertDialog dialog = null;
    AlertDialog.Builder builder = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
        Enter = new MainActivity_End2();
        Back = new MainActivity_End3();

        TextView activity_end = findViewById(R.id.activity_end);
        Bundle bag = getIntent().getExtras();
        intent = new Intent();
        String all_food = "";
        String btnfood1_1 = bag.getString("btnfood1_1");
        String btnfood2_2 = bag.getString("btnfood2_2");
        String btnfood3_3 = bag.getString("btnfood3_3");
        String btnfood4_4 = bag.getString("btnfood4_4");
        String btnfood5_5 = bag.getString("btnfood5_5");
        String btnfood6_6 = bag.getString("btnfood6_6");
        String btnfood7_7 = bag.getString("btnfood7_7");
        String btnfood8_8 = bag.getString("btnfood8_8");
        if (btnfood1_1 != null) all_food += btnfood1_1 + "\n" + " $100" + "\n";
        if (btnfood2_2 != null) all_food += btnfood2_2 + "\n" + " $250" + "\n";
        if (btnfood3_3 != null) all_food += btnfood3_3 + "\n" + " $150" + "\n";
        if (btnfood4_4 != null) all_food += btnfood4_4 + "\n" + " $300" + "\n";
        if (btnfood5_5 != null) all_food += btnfood5_5 + "\n" + " $200" + "\n";
        if (btnfood6_6 != null) all_food += btnfood6_6 + "\n" + " $150" + "\n";
        if (btnfood7_7 != null) all_food += btnfood7_7 + "\n" + " $100" + "\n";
        if (btnfood8_8 != null) all_food += btnfood8_8 + "\n" + " $300" + "\n";

        String method = bag.getString("");
        activity_end.setText(all_food);

        Button btnback = findViewById(R.id.btnback);
        Button btngo = findViewById(R.id.btngo);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity_End.this, MainActivity_Food.class);
                startActivity(intent);
                finish();
            }
        });
        btngo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                builder = new AlertDialog.Builder(MainActivity_End.this);
                builder.setTitle("黑人提示")
                        .setIcon(R.mipmap.question)
                        .setMessage("確定要購買嗎？")
                        .setNegativeButton("考慮一下", new DialogInterface.OnClickListener() {
                            //設定取消按鈕
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Intent x = new Intent(C);
                                sendBroadcast(x);
                                Intent intent = new Intent();
                                intent.setClass(MainActivity_End.this, MainActivity_Food.class);
                                startActivity(intent);
                                finish();
                            }
                        })
                        .setPositiveButton("當然買阿", new DialogInterface.OnClickListener() {
                            //設定確定按鈕
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Intent z = new Intent(B);
                                sendBroadcast(z);
                            }
                        });
                dialog = builder.create();
                dialog.show();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        IntentFilter filter = new IntentFilter(B);
        registerReceiver(Enter, filter);
        super.onResume();
        IntentFilter filter2 = new IntentFilter(C);
        registerReceiver(Back, filter2);
    }
    @Override
    protected void onPause() {
        super.onPause();
        unregisterReceiver(Enter);
        super.onPause();
        unregisterReceiver(Back);
    }
}