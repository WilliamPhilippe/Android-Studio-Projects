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

        int x = new Random().nextInt(5);

        String[] frases = {"Frase bonita", "Frase feia", "Frase pessima", "Another Frase\nTestadno barra n", "Oieeee"};

        fraseOut.setText( frases[x] );
    }
}
