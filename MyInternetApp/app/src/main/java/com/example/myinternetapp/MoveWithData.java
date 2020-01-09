package com.example.myinternetapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MoveWithData extends AppCompatActivity {
    public static final String extraAge = "extra_age";
    public static final String extraName = "extra_umur";

    TextView TvDataReceived;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_data);

        TvDataReceived = findViewById(R.id.tv_data_received);

        String nama = getIntent().getStringExtra(extraName);
        int umur = getIntent().getIntExtra(extraAge, 0);
        String text = "Nama : "+nama+", Umur : "+umur;
        TvDataReceived.setText(text);
    }
}
