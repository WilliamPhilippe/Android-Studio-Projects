package com.victoriam.williamphilippe.poo_teste;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.victoriam.williamphilippe.poo_teste.newClass.Conta;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Conta novaConta = new Conta();
        novaConta.depositar(200);
        novaConta.sacar(50);
        System.out.println(novaConta.getSaldo());
    }
}
