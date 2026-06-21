package com.example.uiuxtask2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class SettingsActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        Button backButton = findViewById(R.id.buttonBack);
        backButton.setOnClickListener(view -> finish());
    }
}

