package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class temp2Acvivity extends AppCompatActivity {

    private TextView tv_id, tv_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp2_acvivity);

        tv_id = findViewById(R.id.tv_id);
        tv_password = findViewById(R.id.tv_password);

        Intent intent = getIntent();
        String userID = intent.getStringExtra("userID");
        String userPassword = intent.getStringExtra("userPassword");


        tv_id.setText(userID);
        tv_password.setText(userPassword);

    }
}