package com.victoriam.williamphilippe.poo_teste;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Cao novoCao = new Cao();
       novoCao.dormir();
       novoCao.setCor("Marrom");
       System.out.println(novoCao.getCor());

    }
}
