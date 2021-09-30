package com.example.invairo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DetailChallangeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_challange);

        Button btnBack = (Button) findViewById(R.id.btnBack);
        Button btnStart = (Button) findViewById(R.id.btn_start);

        btnBack.setOnClickListener(view -> onBackPressed());

        btnStart.setOnClickListener(view -> {
            Intent intent = new Intent(DetailChallangeActivity.this, InputChallangeActivity.class);
            startActivity(intent);
            finish();
        });

    }
}