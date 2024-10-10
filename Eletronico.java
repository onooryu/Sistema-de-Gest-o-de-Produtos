package com.company;

public class Eletronico extends Produto {

    public Eletronico(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularDesconto(double porcentagem) {
        //Desconto de 5% a mais no valor base de desconto
        return preco - (preco * (porcentagem+5)/100);
    }
}
