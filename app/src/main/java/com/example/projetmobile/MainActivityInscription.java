package com.example.projetmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivityInscription extends AppCompatActivity {
    private EditText editTextNom;
    private EditText editTextEmail;
    private EditText editTextMotDePasse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_inscription);
        editTextNom = findViewById(R.id.edittext_nom);
        editTextEmail = findViewById(R.id.edittext_email);
        editTextMotDePasse = findViewById(R.id.edittext_motdepasse);

        Button boutonInscription = findViewById(R.id.bouton_inscription);
        boutonInscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nom = editTextNom.getText().toString().trim();
                String email = editTextEmail.getText().toString().trim();
                String motDePasse = editTextMotDePasse.getText().toString().trim();

                if (TextUtils.isEmpty(nom)) {
                    Toast.makeText(getApplicationContext(), "Veuillez saisir votre nom", Toast.LENGTH_LONG).show();
                    return;
                }

                if (TextUtils.isEmpty(email)) {
                    Toast.makeText(getApplicationContext(), "Veuillez saisir votre adresse e-mail", Toast.LENGTH_LONG).show();
                    return;
                }

                if (TextUtils.isEmpty(motDePasse)) {
                    Toast.makeText(getApplicationContext(), "Veuillez saisir un mot de passe", Toast.LENGTH_LONG).show();
                    return;
                }

                Toast.makeText(getApplicationContext(), "Inscription réussie !", Toast.LENGTH_LONG).show();

                Intent intent = new Intent(MainActivityInscription.this, MainActivityPrincipal.class);
                intent.putExtra("nom",nom);
                startActivity(intent);




            }
        });
    }
}