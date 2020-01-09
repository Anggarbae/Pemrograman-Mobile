package com.example.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class IntentActivity extends AppCompatActivity implements View.OnCreateContextMenuListener, View.OnClickListener {
    EditText Dataku;
    Button btnGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);

        Dataku = findViewById(R.id.Dataku);

        btnGo =findViewById(R.id.btnapaan);
        btnGo.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnapaan){
            String apawis =Dataku.getText().toString();
            if (TextUtils.isEmpty(apawis)){
                Dataku.setError("Error lol");
            }else{
                Intent pp =new Intent(this,Data2Activity.class);
                pp.putExtra(Data2Activity.EXTRA_DATA,apawis);
                startActivity(pp);
            }
        }
    }
}
