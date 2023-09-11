package com.example.projetmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivityFlorida extends AppCompatActivity {
    Button Loc;
    Button Terminer;
    String geoCode="geo:28.0997,-81.6086";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_florida);
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
                Intent intent = new Intent(MainActivityFlorida.this,MainActivityCours.class);
                startActivity(intent);
            }
        });
    }
}