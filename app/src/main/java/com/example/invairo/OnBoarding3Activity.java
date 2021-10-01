package com.example.invairo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OnBoarding3Activity extends AppCompatActivity {


    Button btnLogin;
    Button btnCreate;
    Button btnSkip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding3);

        btnLogin = findViewById(R.id.buttonLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(OnBoarding3Activity.this, LoginActivity.class);
                startActivity(i);
            }
        });

        btnCreate = findViewById(R.id.buttonCreate);
        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(OnBoarding3Activity.this, RegisterActivity.class);
                startActivity(i);
            }
        });

        Button btnSkip = findViewById(R.id.buttonSkip);
        btnSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(OnBoarding3Activity.this, NewsActivity.class);
                startActivity(i);
            }
        });



    }
}