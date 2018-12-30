package com.victoriam.williamphilippe.poo_teste;

class Animal {

    int tamanho;
    String cor;
    double peso;

    void setCor(String cor){
        this.cor = cor;
    }

    String getCor(){
        return this.cor;
    }

    void dormir(){
        System.out.println("Dormir como animal");
    }

    void correr(){
        System.out.println("Correr como um animal");
    }



}
