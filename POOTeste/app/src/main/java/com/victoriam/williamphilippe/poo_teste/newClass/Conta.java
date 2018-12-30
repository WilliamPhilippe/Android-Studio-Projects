package com.victoriam.williamphilippe.poo_teste.newClass;

public class Conta {
    int idConta;
    private double saldo = 100.0;

    public void depositar(double deposito){
        this.saldo += deposito;
    }

    public void sacar(double saque){
        this.saldo -= saque;
    }

    public double getSaldo() {
        return saldo;
    }
}
