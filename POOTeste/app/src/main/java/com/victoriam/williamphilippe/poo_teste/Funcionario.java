package com.victoriam.williamphilippe.poo_teste;

class Funcionario {

    //propriedades
    String nome;
    double salario;

    //metodos sem retorno
    double recuperarSalario( double bonus ){
        this.salario = this.salario * 0.9 + bonus;
        return this.salario;
    }


}
