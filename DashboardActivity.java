package com.example.uiuxtask2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class DashboardActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Button profileButton = findViewById(R.id.buttonProfile);
        Button settingsButton = findViewById(R.id.buttonSettings);
        Button logoutButton = findViewById(R.id.buttonLogout);

        profileButton.setOnClickListener(view ->
                startActivity(new Intent(DashboardActivity.this, ProfileActivity.class)));

        settingsButton.setOnClickListener(view ->
                startActivity(new Intent(DashboardActivity.this, SettingsActivity.class)));

        logoutButton.setOnClickListener(view -> finish());
    }
}

