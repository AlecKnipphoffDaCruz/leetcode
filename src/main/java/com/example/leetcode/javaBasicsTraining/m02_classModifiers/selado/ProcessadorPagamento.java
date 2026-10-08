package com.example.leetcode.javaBasicsTraining.m02_classModifiers.selado;

/*
 A grande vantagem do sealed: o compilador sabe TODAS as subclasses possíveis.
 Por isso este switch não precisa de "default". Ele é EXAUSTIVO.

 🧪 Experimento: apague o "case Boleto b" abaixo.
    Erro: the switch expression does not cover all possible input values
    Ou seja: se um dia alguém adicionar uma forma de pagamento nova no permits,
    o compilador avisa TODOS os switches que esqueceram de tratá-la.
 */
public class ProcessadorPagamento {

    public static String processar(Pagamento pagamento) {
        return switch (pagamento) {
            case Pix p -> "Pix de R$ " + p.getValor() + " para a chave " + p.getChave();
            case Boleto b -> "Boleto de R$ " + b.getValor() + " (" + b.getCodigoDeBarras() + ")";
            case CartaoCredito c -> "Crédito de R$ " + c.getValor() + " em " + c.getParcelas() + "x";
            case Cartao c -> "Cartão final " + c.getNumeroFinal() + " de R$ " + c.getValor();
        };
    }
}
