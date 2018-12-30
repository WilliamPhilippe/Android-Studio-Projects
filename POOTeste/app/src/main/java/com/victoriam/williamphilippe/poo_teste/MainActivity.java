package com.victoriam.williamphilippe.poo_teste;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Funcionario funcionario = new Funcionario();
       funcionario.nome = "Maria";
       funcionario.salario = 920;
       double salary = funcionario.recuperarSalario( 150.0 );
       System.out.println("This is your salary: " + (salary) );

    }
}
