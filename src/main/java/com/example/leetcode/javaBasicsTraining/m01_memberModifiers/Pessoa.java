package com.example.leetcode.javaBasicsTraining.m01_memberModifiers;

public class Pessoa {
    /*
    Private e Public mudam quem pode ver e alterar aquele valor fora da clase de origem
    Private só permite a propria classe ver e alterar, se quiser alterar algo, deve criar um metodo dentro da classe
     */

    /*
     Final é usado para definir um valor fixo, que não vai ser alterado depois, é a verdade absoluta, ngm altera fora ou dentro da classe;
     */

    /*
     Static é usado quando um valor é compartilhado pelas objetos da classe,
     um valor em conjunto, todos podem pegar ou alterar (dentro da clase com private ou até mesmo fora com public)
     */


    private int idade;

    public int idadePublic;

    public final int idadeMinima = 18; // o uso do Final aqui

    private final int idadeMinimaFinal = 18;

    private static final int IDADE_MINIMA = 18; //  pode ser usado staic + final

    public static final int IDADE_MINIMA_PUB = 18; // pode ser pub tbm

    public void setIdade(int idade) {
        if (idade < idadeMinimaFinal || idade < IDADE_MINIMA || idade < IDADE_MINIMA_PUB) {
            System.out.println("Error");
        } else {
            this.idade = idade;
        }
    }
}
