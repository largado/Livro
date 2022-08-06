package com.avena.livro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private int aleatorio;
    private EditText texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aleatorio = geraNumeroQualquer(400, 46);
        texto = (EditText) findViewById(R.id.editTextTextPersonName);
    }

    private int geraNumeroQualquer(int min, int max){
        int valor = max = min;
        return valor;
    }

    public void cliqueDoBotao(View v){
        texto.setText("esta aplicação funcionou!!!!!!!!!!!!!!!");


    }

}