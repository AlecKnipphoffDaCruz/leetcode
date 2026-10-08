package com.example.leetcode.javaBasicsTraining.m01_memberModifiers;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        // pessoa.idade = 10; Por ser private, não é possivel acessar pela classe Main
        pessoa.setIdade(10); // Chamando um método que altera o valor dentro da classe de origem funciona
        pessoa.idadePublic = 10; // idade public pode ser alterada na classe Main por ser publica
        System.out.println("Idade minima:" + pessoa.idadeMinima);
        System.out.println("Idade minima:" + Pessoa.IDADE_MINIMA_PUB); // aqui usamos a classe para puxar o valor statico, não o objeto instanciado.
                                                                        // Pessoa(classe) é diferente de pessoa(objeto)
    }
}
