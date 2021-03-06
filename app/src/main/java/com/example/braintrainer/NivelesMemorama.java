package com.example.braintrainer;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static java.util.Objects.isNull;

public class NivelesMemorama extends AppCompatActivity {
    private Button facil , intermedio , dificil ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_niveles_memorama);
        facil = (Button)findViewById(R.id.NivelFacil);
        intermedio = (Button) findViewById(R.id.NivelIntermedio);
        dificil = (Button) findViewById(R.id.NivelDificil);
        facil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NivelesMemorama.this , MemoNivelFacil.class);
                startActivity(i);
            }
        });

        intermedio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NivelesMemorama.this , Memo_Nivel_Intermedio.class);
                startActivity(i);
            }
        });

        dificil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NivelesMemorama.this , MemoNivelDificil.class);
                startActivity(i);
            }
        });

    }
    @RequiresApi(api = Build.VERSION_CODES.N)
    public String performClick_FACIL_BUTTON() {
        if (isNull(facil)){
            return "No hay  texto en el boton";
        }
        return (String) facil.getText();
    }
}