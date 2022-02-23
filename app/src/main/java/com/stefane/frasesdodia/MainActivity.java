package com.stefane.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){

        String[] frases = {
                "Frase 1",
                "Frase 2",
                "Frase 3",
                "Frase 4",
                "Frase 5",
                "Frase 6",
                "Frase 7",
                "Frase 8"
        };

        int indice = new Random().nextInt(frases.length);

        TextView texto = findViewById(R.id.exibicaoFrase);
        texto.setText(frases[indice]);
    }


}
