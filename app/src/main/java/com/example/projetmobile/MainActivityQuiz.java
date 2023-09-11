package com.example.projetmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.widget.RadioGroup;
import android.widget.*;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class MainActivityQuiz extends AppCompatActivity {
    RadioGroup R1,R2,R3;
    Button verifier;
    TextView aff1,aff2,aff3;
    boolean test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_quiz);
        R1 = (RadioGroup)findViewById(R.id.options1_radio_group);
        R2 = (RadioGroup)findViewById(R.id.options2_radio_group);
        R3 = (RadioGroup)findViewById(R.id.options3_radio_group);
        aff1=(TextView)findViewById(R.id.affiche1);
        aff2=(TextView)findViewById(R.id.affiche2);
        aff3=(TextView)findViewById(R.id.affiche3);
        verifier=(Button)findViewById(R.id.button);
        int textColorV= Color.parseColor("#FF018786");
        int textColorF = Color.parseColor("#660000");
        verifier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                test = true;
                switch (R1.getCheckedRadioButtonId()) {
                    case (R.id.optionQ12):
                        aff1.setText("Bonne réponse");
                        aff1.setTextColor(textColorV);
                        break;
                    case (R.id.optionQ11):
                        aff1.setText("Mauvaise réponse");
                        aff1.setTextColor(textColorF);
                        test = false;
                        break;

                }
                switch (R2.getCheckedRadioButtonId()) {
                    case (R.id.optionQ21):
                        aff2.setText("Bonne réponse");
                        aff2.setTextColor(textColorV);
                        break;
                    case (R.id.optionQ22):
                        aff2.setText("Mauvaise réponse");
                        aff2.setTextColor(textColorF);
                        test = false;
                        break;
                }
                switch (R3.getCheckedRadioButtonId()) {
                    case (R.id.optionQ31):
                        aff3.setText("Bonne réponse");
                        aff3.setTextColor(textColorV);
                        break;
                    case (R.id.optionQ32):
                        aff3.setText("Mauvaise réponse");
                        aff3.setTextColor(textColorF);
                        test = false;
                        break;
                }
                if (test == true) {
                    verifier.setText("Terminer");
                    verifier.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intentJeu = new Intent(MainActivityQuiz.this, MainActivityTests.class);
                            startActivity(intentJeu);
                        }
                    });
                }
            }
            });
    }
}