package com.example.myapplication;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {
    private EditText et_ID, et_Password, et_Name, et_Age;

    @Override
    protected void onCreate(Bundle savedInstancdState) {
        super. onCreate(savedinstanceState);
        setContentView(R.layout.activity_register);
    }
}
