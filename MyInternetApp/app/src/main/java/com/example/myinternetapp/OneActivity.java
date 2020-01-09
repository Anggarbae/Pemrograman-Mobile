package com.example.myinternetapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class OneActivity extends AppCompatActivity implements View.OnClickListener{


    EditText etData;
    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        etData = findViewById(R.id.et_data);
        btnNext = findViewById(R.id.btn_explicit);
        btnNext.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.btn_explicit){
            String data = etData.getText().toString();
            Intent intent = new Intent(this, twoActivity.class);
            intent.putExtra(twoActivity.EXTRA_DATA, data);
            startActivity(intent);

        }
    }
}