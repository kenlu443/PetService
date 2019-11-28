package com.example.petservice;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.RadioGroup;


public class MainActivity_Food extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    CheckBox btnfood1_1, btnfood2_2, btnfood3_3, btnfood4_4, btnfood5_5, btnfood6_6, btnfood7_7, btnfood8_8;
    Bundle bag = new Bundle();
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        intent = new Intent();
        Button btngo = findViewById(R.id.btngo);
        Button btnback = findViewById(R.id.btnback);
        ImageButton btnfood1 = findViewById(R.id.btnfood1);
        ImageButton btnfood2 = findViewById(R.id.btnfood2);
        ImageButton btnfood3 = findViewById(R.id.btnfood3);
        ImageButton btnfood4 = findViewById(R.id.btnfood4);
        ImageButton btnfood5 = findViewById(R.id.btnfood5);
        ImageButton btnfood6 = findViewById(R.id.btnfood6);
        ImageButton btnfood7 = findViewById(R.id.btnfood7);
        ImageButton btnfood8 = findViewById(R.id.btnfood8);

        btnfood1_1 = findViewById(R.id.btnfood1_1);
        btnfood2_2 = findViewById(R.id.btnfood2_2);
        btnfood3_3 = findViewById(R.id.btnfood3_3);
        btnfood4_4 = findViewById(R.id.btnfood4_4);
        btnfood5_5 = findViewById(R.id.btnfood5_5);
        btnfood6_6 = findViewById(R.id.btnfood6_6);
        btnfood7_7 = findViewById(R.id.btnfood7_7);
        btnfood8_8 = findViewById(R.id.btnfood8_8);
        btngo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtras(bag);
                intent.setClass(MainActivity_Food.this, MainActivity_End.class);
                startActivity(intent);
                finish();
            }
        });
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity_Food.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        btnfood1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                Bundle bag = new Bundle();

                bag.putString("NAME", "飼料名稱：Cozypet Dog Food");
                bag.putString("SPECIFICATION", "規格：200g/盒");
                bag.putString("INFO", "詳細資料：含高鈣咬食可清潔牙垢，防止牙結石，牙周病,幫助狗狗牙齒成長與發育。");
                intent.putExtras(bag);
                intent.setClass(MainActivity_Food.this, MainActivity_Food1_1.class);
                startActivity(intent);
                finish();
            }
        });
        btnfood2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                Bundle bag = new Bundle();

                bag.putString("NAME", "飼料名稱：Sccos Cat Food");
                bag.putString("SPECIFICATION", "規格：300g/盒");
                bag.putString("INFO", "詳細資料：美味營養的鮭魚肉以及額外的維他命和礦物質，完整的營養主食。");
                intent.putExtras(bag);
                intent.setClass(MainActivity_Food.this, MainActivity_Food2_2.class);
                startActivity(intent);
                finish();
            }
        });
        btnfood3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                Bundle bag = new Bundle();

                bag.putString("NAME", "飼料名稱：SEEDS貓飼料");
                bag.putString("SPECIFICATION", "規格：110g/盒");
                bag.putString("INFO", "詳細資料：採用上等牛肉及新鮮肉類具備豐富的蛋白質、維生素和鈣，等礦物質及多種不飽和脂肪。");
                intent.putExtras(bag);
                intent.setClass(MainActivity_Food.this, MainActivity_Food3_3.class);
                startActivity(intent);
                finish();
            }
        });
        btnfood4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                Bundle bag = new Bundle();

                bag.putString("NAME", "飼料名稱：Nutro成犬配方");
                bag.putString("SPECIFICATION", "規格：30磅/袋");
                bag.putString("INFO", "詳細資料：添加Oligo寡糖DHA幫助腦部發育，添加鈣質幫助骨骼發育，最佳營養補充主食。");
                intent.putExtras(bag);
                intent.setClass(MainActivity_Food.this, MainActivity_Food4_4.class);
                startActivity(intent);
                finish();
            }
        });
        btnfood5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                Bundle bag = new Bundle();

                bag.putString("NAME", "飼料名稱：IQ dog 罐頭");
                bag.putString("SPECIFICATION", "規格：250g/罐");
                bag.putString("INFO", "詳細資料：新食感，小碎塊，有嚼勁。適口性絕佳，原料新鮮，水份87％以下有飽食感，狗狗愛吃。");
                intent.putExtras(bag);
                intent.setClass(MainActivity_Food.this, MainActivity_Food5_5.class);
                startActivity(intent);
                finish();
            }
        });
        btnfood6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                Bundle bag = new Bundle();

                bag.putString("NAME", "飼料名稱：GREENS貓飼料");
                bag.putString("SPECIFICATION", "規格：300g/盒");
                bag.putString("INFO", "詳細資料：鮮甜美味的鮭魚加上鮮嫩火雞肉搭配多汁雞肉，提供香氣十足、不可抗拒的美味。");
                intent.putExtras(bag);
                intent.setClass(MainActivity_Food.this, MainActivity_Food6_6.class);
                startActivity(intent);
                finish();
            }
        });
        btnfood7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                Bundle bag = new Bundle();

                bag.putString("NAME", "飼料名稱：天然一膳 狗飼料");
                bag.putString("SPECIFICATION", "規格：150g/盒");
                bag.putString("INFO", "詳細資料：適合狗狗的黃金比例,鞏固腸道健康,肉餅狀的多汁質地，讓狗狗可以大口嚼嚼適。");
                intent.putExtras(bag);
                intent.setClass(MainActivity_Food.this, MainActivity_Food7_7.class);
                startActivity(intent);
                finish();
            }
        });
        btnfood8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                Bundle bag = new Bundle();

                bag.putString("NAME", "飼料名稱：KIWI SAFE 狗飼料");
                bag.putString("SPECIFICATION", "規格：300g/盒");
                bag.putString("INFO", "詳細資料：鮮美雞湯細火慢燉,含有愛犬所需的維生素礦物質等微量元素是愛犬的最愛。");
                intent.putExtras(bag);
                intent.setClass(MainActivity_Food.this, MainActivity_Food8_8.class);
                startActivity(intent);
                finish();
            }
        });
        btnfood1_1.setOnCheckedChangeListener(this);
        btnfood2_2.setOnCheckedChangeListener(this);
        btnfood3_3.setOnCheckedChangeListener(this);
        btnfood4_4.setOnCheckedChangeListener(this);
        btnfood5_5.setOnCheckedChangeListener(this);
        btnfood6_6.setOnCheckedChangeListener(this);
        btnfood7_7.setOnCheckedChangeListener(this);
        btnfood8_8.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton ButtonView, boolean Food) {
        switch (ButtonView.getId()) {
            case R.id.btnfood1_1:
                if (Food) bag.putString("btnfood1_1", btnfood1_1.getText().toString());
                break;
            case R.id.btnfood2_2:
                if (Food) bag.putString("btnfood2_2", btnfood2_2.getText().toString());
                break;
            case R.id.btnfood3_3:
                if (Food) bag.putString("btnfood3_3", btnfood3_3.getText().toString());
                break;
            case R.id.btnfood4_4:
                if (Food) bag.putString("btnfood4_4", btnfood4_4.getText().toString());
                break;
            case R.id.btnfood5_5:
                if (Food) bag.putString("btnfood5_5", btnfood5_5.getText().toString());
                break;
            case R.id.btnfood6_6:
                if (Food) bag.putString("btnfood6_6", btnfood6_6.getText().toString());
                break;
            case R.id.btnfood7_7:
                if (Food) bag.putString("btnfood7_7", btnfood7_7.getText().toString());
                break;
            case R.id.btnfood8_8:
                if (Food) bag.putString("btnfood8_8", btnfood8_8.getText().toString());
                break;
        }
    }
}//我不會寫陣列+迴圈

