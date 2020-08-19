package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         {


        };{
        }
    }

    public void selecionarBotao(View v) {

        TextView texto = findViewById(R.id.indiceDosLivro);
         setContentView(R.layout.capitulo_main);
    }
    public void selecionarBotao2(View v){

        TextView texto = findViewById(R.id.Versiculos);
        setContentView(R.layout.versiculo_main);
    }
    public void selecionarBotao3(View v){

        TextView texto = findViewById(R.id.GenisesVersculos);
        setContentView(R.layout.nvi_gn);
    }

    public void selecionarBotao4(View v){

        TextView texto = findViewById(R.id.Genises);
        setContentView(R.layout.capitulo_main);

    }
    public void selecionarBotao5(View v){

        TextView texto = findViewById(R.id.indiceDosLivro);
        setContentView(R.layout.capitulo_main);}

     public void selecionarBotao6(View v) throws IOException {

        TextView texto = findViewById(R.id.GenisesVersculos);


     }



}
