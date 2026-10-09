package com.example.leetcode.javaBasicsTraining.m03_packages.b;

import com.example.leetcode.javaBasicsTraining.m03_packages.a.Pai;

/*
 Filho: OUTRO pacote, mas HERDA de Pai.
 Este é o caso que mais confunde em entrevista, por causa do protected.
 */
public class Filho extends Pai {

    public String demonstrar() {
        // String x = this.segredo; // 🧪 Erro: segredo has private access in Pai
        // String x = this.familia; // 🧪 Erro: familia is not public in Pai; cannot be accessed from outside package
        //    ↑ herdar NÃO dá acesso ao package-private: o que conta é estar no mesmo pacote
        String r = this.heranca;  // ✅ protected via herança
        r += ", " + super.heranca; // ✅ mesma coisa, usando super
        r += ", " + this.nome;     // ✅ public
        return "Filho vê: " + r;
    }

    /*
     A PEGADINHA DO PROTECTED:
     Fora do pacote, a subclasse só acessa o membro protected por uma referência
     do PRÓPRIO tipo (Filho) ou de uma subclasse dele. Por uma referência do tipo Pai, não.

     Por quê? O protected existe para a subclasse usar o que HERDOU. Ele não serve para
     mexer no estado de qualquer objeto Pai (que poderia ser de outra subclasse, ex.: uma Filha).
     */
    public String pegadinhaDoProtected(Pai umPai, Filho outroFilho) {
        // String x = umPai.heranca; // 🧪 Erro: heranca has protected access in Pai
        return "Filho vê via outroFilho: " + outroFilho.heranca; // ✅ a referência é do tipo Filho
    }
}
