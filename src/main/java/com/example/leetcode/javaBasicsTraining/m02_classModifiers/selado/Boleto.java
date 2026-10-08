package com.example.leetcode.javaBasicsTraining.m02_classModifiers.selado;

// final: a hierarquia termina aqui. Ninguém herda de Boleto.
public final class Boleto extends Pagamento {

    private final String codigoDeBarras;

    public Boleto(double valor, String codigoDeBarras) {
        super(valor);
        this.codigoDeBarras = codigoDeBarras;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }
}
