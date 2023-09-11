package com.example.projetmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.*;
import android.view.View;
import android.content.Intent;


public class MainActivityTests extends AppCompatActivity {
    EditText nom;
    Button devinette;
    Button quiz;
    Button memoire;
    Button rev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tests);
        devinette=(Button)findViewById(R.id.buttonDevinette);
        quiz=(Button)findViewById(R.id.buttonQuiz);
        rev=(Button)findViewById(R.id.buttonrev);
        memoire=(Button)findViewById(R.id.buttonMemoire);

        devinette.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentDevinette = new Intent(MainActivityTests.this,MainActivityDevinette.class);
                startActivity(intentDevinette);
            }
        });
        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentQuiz = new Intent(MainActivityTests.this,MainActivityQuiz.class);
                startActivity(intentQuiz);
            }
        });
        memoire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMemoire = new Intent(MainActivityTests.this,MainActivityMonuments.class);
                startActivity(intentMemoire);
            }
        });
        rev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityTests.this, MainActivityPrincipal.class);
                startActivity(intent);
            }
        });

    }
}