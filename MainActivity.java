package com.example.uiuxtask2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginButton = findViewById(R.id.buttonLogin);
        loginButton.setOnClickListener(view ->
                startActivity(new Intent(MainActivity.this, DashboardActivity.class)));
    }
}

