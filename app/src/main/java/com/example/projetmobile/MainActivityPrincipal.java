package com.example.projetmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.*;
import android.view.View;
import android.content.Intent;

public class MainActivityPrincipal extends AppCompatActivity {
    Button cours;
    Button tests;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_principal);
        cours=(Button)findViewById(R.id.buttonCours);
        tests=(Button)findViewById(R.id.buttonTests);
        Intent intent=getIntent();
        String message=intent.getStringExtra("nom");
        TextView affiche=findViewById(R.id.textView);
        affiche.setText("Bienvenue "+message);
        cours.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Cours = new Intent(MainActivityPrincipal.this,MainActivityCours.class);
                startActivity(Cours);
            }
        });
        tests.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Tests = new Intent(MainActivityPrincipal.this,MainActivityTests.class);
                startActivity(Tests);
            }
        });



    }
}