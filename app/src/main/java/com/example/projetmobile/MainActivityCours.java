package com.example.projetmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivityCours extends AppCompatActivity {
    Button sy;
    Button dub;
    Button barc;
    Button per;
    Button flor;
    Button rev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_cours);
        sy = (Button)findViewById(R.id.buttonSy);
        dub = (Button)findViewById(R.id.buttonDubrovnik);
        barc = (Button)findViewById(R.id.buttonBarcelone);
        per = (Button)findViewById(R.id.buttonPerou);
        flor = (Button)findViewById(R.id.buttonFlorida);
        rev = (Button)findViewById(R.id.button2);

        sy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSy = new Intent(MainActivityCours.this, MainActivitySydney.class);
                startActivity(intentSy);
            }
        });
        dub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentDub = new Intent(MainActivityCours.this, MainActivityDubrovnik.class);
                startActivity(intentDub);
            }
        });
        barc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentBarc = new Intent(MainActivityCours.this, MainActivityBarcelone.class);
                startActivity(intentBarc);
            }
        });
        per.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPer = new Intent(MainActivityCours.this, MainActivityPerou.class);
                startActivity(intentPer);
            }
        });
        flor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentFlor = new Intent(MainActivityCours.this, MainActivityFlorida.class);
                startActivity(intentFlor);
            }
        });
        rev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityCours.this, MainActivityPrincipal.class);
                startActivity(intent);
            }
        });
        Button buttonAutre = findViewById(R.id.button);
        buttonAutre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.lonelyplanet.com/places";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

    }
}