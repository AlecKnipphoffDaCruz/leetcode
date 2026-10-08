package com.example.leetcode.javaBasicsTraining.m02_classModifiers.finais;

/*
 FINAL (classe)
 - NÃO pode ser herdada: ninguém pode fazer "extends Moeda".
 - A classe pode ser instanciada normalmente. O final só bloqueia a HERANÇA.

 Por que usar? Para garantir que o comportamento da classe NUNCA seja alterado por uma subclasse.
 Exemplo famoso: String é "public final class String". Se alguém pudesse herdar de String,
 poderia criar uma "String mutável" e quebrar a segurança do HashMap, do String pool etc.
 Integer, Double e as outras classes wrapper também são final.

 Lembrete: o mesmo "final" muda de sentido dependendo de onde está:
   final na CLASSE    -> não pode ser herdada
   final no MÉTODO    -> não pode ser sobrescrito
   final na VARIÁVEL  -> não pode ser reatribuída

 🧪 Experimento: descomente a classe MoedaFalsa no fim do arquivo.
    Erro: cannot inherit from final Moeda
 */
public final class Moeda {

    private final String codigo;
    private final double valor;

    public Moeda(String codigo, double valor) {
        this.codigo = codigo;
        this.valor = valor;
    }

    public String formatar() {
        return codigo + " " + String.format("%.2f", valor);
    }
}

// class MoedaFalsa extends Moeda {
//     MoedaFalsa() { super("FAKE", 0); }
// }
