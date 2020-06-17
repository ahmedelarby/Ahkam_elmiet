package com.example.azkar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splah_screen);



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent a =new Intent(Splash_screen.this, one.class) ;
                startActivity(a);
                finish();






            }
        }, 3000);















    }
}
