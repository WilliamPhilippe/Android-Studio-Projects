package com.victoriam.williamphilippe.poo_teste;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Casa minhaCasa = new Casa();
        minhaCasa.cor = "Vermelho";

        Casa minhaCasa2 = new Casa();
        minhaCasa2.cor = "Branco";

        System.out.println( minhaCasa.cor );
        minhaCasa.abrirPorta();

    }
}
