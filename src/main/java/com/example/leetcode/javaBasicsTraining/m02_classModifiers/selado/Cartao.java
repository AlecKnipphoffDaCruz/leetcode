package com.example.leetcode.javaBasicsTraining.m02_classModifiers.selado;

/*
 NON-SEALED: Cartao foi PERMITIDO pela Pagamento (sealed), mas REABRE a herança.
 A partir daqui qualquer classe pode herdar de Cartao, sem precisar de permits
 (ex.: CartaoCredito, CartaoDebito, e quantos tipos de cartão surgirem no futuro).

 Repare: CartaoCredito NÃO está no permits da Pagamento, e mesmo assim é um Pagamento
 (de forma indireta). O que o sealed garante é: todo Pagamento é um Pix, um Boleto ou um Cartao.
 */
public non-sealed class Cartao extends Pagamento {

    private final String numeroFinal;

    public Cartao(double valor, String numeroFinal) {
        super(valor);
        this.numeroFinal = numeroFinal;
    }

    public String getNumeroFinal() {
        return numeroFinal;
    }
}
