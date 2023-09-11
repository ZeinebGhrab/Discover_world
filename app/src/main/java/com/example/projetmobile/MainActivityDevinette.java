package com.example.projetmobile;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivityDevinette extends AppCompatActivity {
    EditText edittext1 ;
    EditText edittext2;
    EditText edittext3;
    Button verifier;
    TextView affiche1;
    TextView affiche2;
    TextView affiche3;
    boolean test;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_devinette);
        int textColorF = Color.parseColor("#660000");
        int textColorV= Color.parseColor("#FF018786");
        edittext1 =findViewById(R.id.devinette2);
        edittext2 =findViewById(R.id.devinette1);
        edittext3 =findViewById(R.id.devinette3);
        affiche1=findViewById(R.id.textView1);
        affiche2=findViewById(R.id.textView2);
        affiche3=findViewById(R.id.textView3);
        verifier =findViewById(R.id.button);
        verifier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String reponse1 = edittext1.getText().toString();
                String reponse2 = edittext2.getText().toString();
                String reponse3 = edittext3.getText().toString();
                test=true;
                if (reponse1.toLowerCase().trim().equals("sydney") == true) {
                    affiche1.setText("Bravo! Sydney est la bonne réponse.");
                    affiche1.setTextColor(textColorV);
                } else {
                    affiche1.setText(reponse1 +" est la mauvaise réponse");
                    affiche1.setTextColor(textColorF);
                    test=false;
                };
                if (reponse2.toLowerCase().trim().equals("disney world") == true) {
                    affiche2.setText("Bravo! Disney Land est la bonne réponse.");
                    affiche2.setTextColor(textColorV);
                } else {
                    affiche2.setText(reponse2 +" est la Mauvaise réponse");
                    affiche2.setTextColor(textColorF);
                    test=false;

                };
                if (reponse3.toLowerCase().trim().equals("barcelone") == true) {
                    affiche3.setText("Bravo! Barcelone est la bonne réponse.");
                    affiche3.setTextColor(textColorV);
                } else {
                    affiche3.setText(reponse3 +" est la Mauvaise réponse.");
                    affiche3.setTextColor(textColorF);
                    test=false;

                }
                if (test==true){
                    verifier.setText("Terminer");
                    verifier.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intentJeu = new Intent(MainActivityDevinette.this,MainActivityTests.class);
                            startActivity(intentJeu);
                        }
                    });

                }
            }
        });
    }

}