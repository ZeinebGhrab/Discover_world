package com.example.projetmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivityDubrovnik extends AppCompatActivity {
    Button Loc;
    Button Terminer;
    String geoCode="geo:42.650661, 18.094424";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dubrovnik);
        Loc=(Button)findViewById(R.id.buttonloc);
        Terminer=(Button)findViewById(R.id.button);
        Loc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(geoCode));
                startActivity(intent);
            }
        });
        Terminer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityDubrovnik.this,MainActivityCours.class);
                startActivity(intent);
            }
        });
    }
}