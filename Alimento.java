package com.company;

public class Alimento extends Produto{
    public Alimento(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularDesconto(double porcentagem) {
        //Desconto simples
        return preco - (preco * porcentagem / 100);
    }
}
