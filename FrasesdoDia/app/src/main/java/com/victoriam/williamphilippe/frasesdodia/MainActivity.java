package com.victoriam.williamphilippe.frasesdodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void GenerateLetter(View view){
        TextView fraseOut = (TextView) findViewById(R.id.BoxLetter);

        String[] frases = {"O importante não é vencer todos os dias, mas lutar sempre.",
                "Maior que a tristeza de não haver vencido é a vergonha de não ter lutado!",
                "Toda ação humana, quer se torne positiva ou negativa, precisa depender de motivação.",
                "A verdadeira motivação vem de realização, desenvolvimento pessoal, satisfação no trabalho e reconhecimento",
                "A alegria de fazer o bem é a única agonia verdadeira."};
        int x = new Random().nextInt( frases.length );

        fraseOut.setText( frases[x] );
    }
}
