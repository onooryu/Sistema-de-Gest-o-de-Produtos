package com.company;

public class Main {

    public static void main(String[] args) {
	    Estoque estoque = new Estoque();
        Eletronico celular = new Eletronico("Celular", 1500.00);
        Alimento pao = new Alimento("Pão", 5.00);

        estoque.adicionarProduto(celular);
        estoque.adicionarProduto(pao);

        System.out.println("Preços com desconto de 10%:");
        estoque.exibirPrecosComDesconto(10.0);
    }
}
