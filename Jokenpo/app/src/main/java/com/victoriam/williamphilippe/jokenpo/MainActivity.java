package com.victoriam.williamphilippe.jokenpo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionarPedra(View view){
        this.opcaoSelecionada("pedra");
    }
    public void selecionarPapel(View view){
        this.opcaoSelecionada("papel");
    }
    public void selecionarTesoura(View view){
        this.opcaoSelecionada("tesoura");
    }

    public void opcaoSelecionada(String escolha){

        int number = new Random().nextInt(3);
        String[] opcoes = { "pedra", "papel", "tesoura" };
        String opcaoApp = opcoes[number];

        ImageView imagemResult = (ImageView) findViewById(R.id.ImageTop);

        TextView text = (TextView) findViewById(R.id.textView);
        text.setText(opcaoApp);

        this.showResult(opcaoApp, escolha, imagemResult);

    }

    public void showResult(String app, String user, ImageView imagemResult){
        TextView textShow = (TextView) findViewById(R.id.textView);

        switch (app){
            case "pedra":
                imagemResult.setImageResource(R.drawable.pedra);

                switch (user){
                    case "pedra":
                        textShow.setText("Empate, jogue de novo.");
                        break;
                    case "papel":
                        textShow.setText("Voce ganhou!");
                        break;
                    case "tesoura":
                        textShow.setText("Voce perdeu!");
                        break;
                }

                break;
            case "papel":
                imagemResult.setImageResource(R.drawable.papel);

                switch (user){
                    case "pedra":
                        textShow.setText("Voce perdeu!");
                        break;
                    case "papel":
                        textShow.setText("Empate, jogue de novo.");
                        break;
                    case "tesoura":
                        textShow.setText("Voce ganhou!");
                        break;
                }

                break;
            case "tesoura":
                imagemResult.setImageResource(R.drawable.tesoura);

                switch (user){
                    case "pedra":
                        textShow.setText("Voce ganhou!");
                        break;
                    case "papel":
                        textShow.setText("Voce perdeu!");
                        break;
                    case "tesoura":
                        textShow.setText("Empate, jogue de novo.");
                        break;
                }

                break;
        }

    }
}
