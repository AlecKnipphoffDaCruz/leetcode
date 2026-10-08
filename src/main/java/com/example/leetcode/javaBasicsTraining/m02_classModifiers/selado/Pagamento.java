package com.example.leetcode.javaBasicsTraining.m02_classModifiers.selado;

/*
 SEALED (classe) — Java 17+
 - SÓ as classes listadas em "permits" podem herdar dela.
 - Fica no meio do caminho entre "qualquer um herda" (classe normal) e "ninguém herda" (final).

 REGRA OBRIGATÓRIA: toda subclasse permitida precisa declarar como CONTINUA a herança:
   final       -> a herança para aqui                         (ex.: Pix, Boleto)
   sealed      -> continua fechada, com o seu próprio permits
   non-sealed  -> reabre: a partir dela qualquer um herda      (ex.: Cartao)

 Para que serve? Para modelar um conjunto FECHADO de opções. Aqui, o sistema só aceita
 3 formas de pagamento. Como o compilador conhece TODAS as subclasses, um switch sobre
 Pagamento não precisa de "default" (veja ProcessadorPagamento).

 🧪 Experimentos:
 1. Descomente a classe Bitcoin no fim deste arquivo.
    Erro: class is not allowed to extend sealed class: Pagamento
 2. No Pix.java, apague o "final".
    Erro: sealed, non-sealed or final modifiers expected
 */
public sealed abstract class Pagamento permits Pix, Boleto, Cartao {

    private final double valor;

    protected Pagamento(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}

// final class Bitcoin extends Pagamento {
//     Bitcoin(double valor) { super(valor); }
// }
