package com.example.invairo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class ChallangeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challange);

        LinearLayout btnChallange = (LinearLayout) findViewById(R.id.challange1);
        BottomNavigationView bottomNav = (BottomNavigationView) findViewById(R.id.bottom_nav);

        bottomNav.setSelectedItemId(R.id.page_challange);

        bottomNav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.page_news:
                        Intent intent = new Intent(ChallangeActivity.this, NewsActivity.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                        startActivity(intent);
                        break;
                    case R.id.page_profile:
                        Intent intent2 = new Intent(ChallangeActivity.this, ProfileActivity.class);
                        intent2.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                        startActivity(intent2);
                        break;
                    case R.id.page_challange:
                        Intent intent3 = new Intent(ChallangeActivity.this, ChallangeActivity.class);
                        intent3.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                        startActivity(intent3);
                        break;
                }

                return false;
            }
        });

        btnChallange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(ChallangeActivity.this, DetailChallangeActivity.class);
                startActivity(intent2);
            }
        });

    }
}