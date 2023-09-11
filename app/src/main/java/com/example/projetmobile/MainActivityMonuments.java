package com.example.projetmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivityMonuments extends AppCompatActivity {
    EditText edittext1 ;
    EditText edittext2;
    EditText edittext3;
    EditText edittext4;
    Button verifier;
    TextView affiche1;
    TextView affiche2;
    TextView affiche3;
    TextView affiche4;
    TextView note;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_monuments);
        edittext1 = findViewById(R.id.R1);
        edittext2 = findViewById(R.id.R2);
        edittext3 =  findViewById(R.id.R3);
        edittext4 = findViewById(R.id.R4);
        note = findViewById(R.id.score);
        affiche1=findViewById(R.id.affiche1);
        affiche2=findViewById(R.id.affiche2);
        affiche3= findViewById(R.id.affiche3);
        affiche4= findViewById(R.id.affiche4);
        verifier =findViewById(R.id.button);
        verifier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int textColorF= Color.parseColor("#660000");
                int textColorV= Color.parseColor("#FF018786");
                String reponse1 = edittext1.getText().toString();
                String reponse2 = edittext2.getText().toString();
                String reponse3 = edittext3.getText().toString();
                String reponse4 = edittext4.getText().toString();
                int score=0;
                if (reponse1.toLowerCase().trim().equals("opéra")== true) {
                    score+=5;
                    affiche1.setText("Bravo! vous avez gagnez 5 points");
                    affiche1.setTextColor(textColorV);
                } else {
                    affiche1.setText("Mauvaise réponse");
                    affiche1.setTextColor(textColorF);
                };
                if (reponse2.toLowerCase().trim().equals("ville sacrée de cuzco") == true) {
                    score+=5;
                    affiche2.setText("Bravo! vous avez gagnez 5 points");
                    affiche2.setTextColor(textColorV);
                } else {
                    affiche2.setText("Mauvaise réponse");
                    affiche2.setTextColor(textColorF);

                };
                if (reponse3.toLowerCase().trim().equals("montagne arc-en-ciel") == true) {
                    score+=5;
                        affiche3.setText("Bravo! vous avez gagnez 5 points");
                        affiche3.setTextColor(textColorV);
                    } else {
                        affiche3.setText("Mauvaise réponse.");
                        affiche3.setTextColor(textColorF);

                }
                if (reponse4.toLowerCase().trim().equals("sagrada familia") == true) {
                    score+=5;
                    affiche4.setText("Bravo! vous avez gagnez 5 points");
                } else {
                    affiche4.setText("Mauvaise réponse.");
                    affiche4.setTextColor(textColorF);

                }
                note.setText("Votre score= "+ score);
                int couleur=Color.parseColor("#003311");
                note.setBackgroundColor(couleur);
                    verifier.setText("Termier");
                    verifier.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intentJeu = new Intent(MainActivityMonuments.this,MainActivityTests.class);
                            startActivity(intentJeu);
                    }});

                }
        });
    }
}