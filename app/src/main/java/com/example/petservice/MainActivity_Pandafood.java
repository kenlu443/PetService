package com.example.petservice;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity_Pandafood extends AppCompatActivity {
    ConstraintLayout back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pandafood);
        Animation fadeIn = AnimationUtils.loadAnimation(MainActivity_Pandafood.this, R.anim.fade_in);
        back = findViewById(R.id.back);
        back.setAnimation(fadeIn);
        Thread timer = new Thread(){
            @Override
            public void run() {
                super.run();
                try{
                    sleep(4000);

                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                finally{

                    startActivity(new Intent(MainActivity_Pandafood.this, MainActivity_User.class));
                    finish();

                }
            }
        };
        timer.start();
    }
}
