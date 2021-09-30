package com.example.invairo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class FinishChallangeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish_challange);

        Button btnFinish = (Button) findViewById(R.id.btn_finish);

        btnFinish.setOnClickListener(view -> {
            Intent intent = new Intent(FinishChallangeActivity.this, DetailChallangeActivity.class);
            startActivity(intent);
            finish();
        });

    }
}