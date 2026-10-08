package com.example.leetcode.javaBasicsTraining.m02_classModifiers.selado;

// final: a hierarquia termina aqui. Ninguém herda de Pix.
public final class Pix extends Pagamento {

    private final String chave;

    public Pix(double valor, String chave) {
        super(valor);
        this.chave = chave;
    }

    public String getChave() {
        return chave;
    }
}
