package com.example.smanndavid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class StartupActivity extends AppCompatActivity {
    private final int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent RegisterIntent = new Intent(StartupActivity.this, MainActivity.class);
                startActivity(RegisterIntent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
