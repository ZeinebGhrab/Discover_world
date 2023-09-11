package com.example.projetmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.*;
import android.view.View;
import android.text.TextUtils;
import android.content.Intent;



public class MainActivity extends AppCompatActivity {
    Button inscrire;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inscrire=(Button)findViewById(R.id.Inscri);
        inscrire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivityInscription.class);
                startActivity(intent);
            }
        });

    }}