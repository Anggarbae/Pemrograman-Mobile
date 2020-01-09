package com.example.myinternetapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class twoActivity extends AppCompatActivity {

    TextView tvData;
    public static final String EXTRA_DATA = "extra_data";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        tvData = findViewById(R.id.tv_received);

        String data = getIntent().getStringExtra(EXTRA_DATA);
        tvData.setText(data);

    }
}