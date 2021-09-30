package com.example.invairo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class InputChallangeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_challange);

        Button btnSave = (Button) findViewById(R.id.btn_save);

        btnSave.setOnClickListener(view -> {
            Intent intent = new Intent(InputChallangeActivity.this, FinishChallangeActivity.class);
            startActivity(intent);
            finish();
        });

    }
}