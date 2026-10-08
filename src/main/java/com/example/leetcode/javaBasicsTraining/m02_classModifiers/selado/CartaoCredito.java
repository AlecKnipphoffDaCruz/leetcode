package com.example.leetcode.javaBasicsTraining.m02_classModifiers.selado;

// Só pode herdar de Cartao porque Cartao é non-sealed.
// Uma classe comum (sem final/sealed/non-sealed) é permitida aqui: a regra só vale para quem herda DIRETO de uma sealed.
public class CartaoCredito extends Cartao {

    private final int parcelas;

    public CartaoCredito(double valor, String numeroFinal, int parcelas) {
        super(valor, numeroFinal);
        this.parcelas = parcelas;
    }

    public int getParcelas() {
        return parcelas;
    }
}
