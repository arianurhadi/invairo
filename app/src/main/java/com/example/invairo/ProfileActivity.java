package com.example.invairo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        BottomNavigationView bottomNav = (BottomNavigationView) findViewById(R.id.bottom_nav);

        bottomNav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.page_news:
                        Intent intent = new Intent(ProfileActivity.this, NewsActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.page_profile:
                        Intent intent2 = new Intent(ProfileActivity.this, ProfileActivity.class);
                        startActivity(intent2);
                }

                return false;
            }
        });


    }
}