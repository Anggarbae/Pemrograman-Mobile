package com.example.myinternetapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnMove;
    Button btnMoveData;
    Button btnCall;
    Button btnweb;
    Button btnMoveData2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMove = findViewById(R.id.btnMove);
        btnMove.setOnClickListener(this);

        btnMoveData = findViewById(R.id.btnMoveData);
        btnMoveData.setOnClickListener(this);

        btnCall = findViewById(R.id.btnCall);
        btnCall.setOnClickListener(this);

        btnweb = findViewById(R.id.btnweb);
        btnweb.setOnClickListener(this);

        btnMoveData2 = findViewById(R.id.btnData);
        btnMoveData2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnMove:
                Intent moveActivity = new Intent(this, MoveActivity.class);
                startActivity(moveActivity);
                break;

            case R.id.btnMoveData:
                Intent MoveDataActivity = new Intent(this, MoveWithData.class);
                MoveDataActivity.putExtra(MoveWithData.extraName, "Reza Faizal Putra ");
                MoveDataActivity.putExtra(MoveWithData.extraAge, 20);
                startActivity(MoveDataActivity);
                break;

            case R.id.btnCall:
                String phoneNumber = "0812312311";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: " + phoneNumber));
                startActivity(dialPhoneIntent);
                break;

            case R.id.btnweb:
                String mainUrl = "https://ittelkom-pwt.ac.id/";
                Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(mainUrl));
                startActivity(intentWeb);
                break;

            case R.id.btnData:
                Intent intent = new Intent(this, OneActivity.class);
                startActivity(intent);
                break;

            }

        }

}

