package com.example.leetcode.javaBasicsTraining.m03_packages;

// ===== IMPORTS =====

// Import normal: permite escrever "Pai" em vez do nome completo do pacote.
import com.example.leetcode.javaBasicsTraining.m03_packages.a.Pai;
import com.example.leetcode.javaBasicsTraining.m03_packages.a.VizinhoDeA;

// Import com * (wildcard): traz TODAS as classes public do pacote b.
// Atenção: o * NÃO inclui subpacotes. "import java.util.*" não traz java.util.concurrent.
import com.example.leetcode.javaBasicsTraining.m03_packages.b.*;

// Import static: traz um membro STATIC, que passa a ser usado sem o nome da classe.
// Em vez de Pai.SOBRENOME, dá para escrever só SOBRENOME.
import static com.example.leetcode.javaBasicsTraining.m03_packages.a.Pai.SOBRENOME;

import java.util.Date;
// 🧪 Descomente a linha abaixo.
//    Erro: a type with the same simple name is already defined by the single-type-import of Date
// import java.sql.Date;

/*
 PACOTES
 - Servem para ORGANIZAR o código e para CONTROLAR o acesso (package-private e protected dependem deles).
 - O nome do pacote espelha as pastas: m03_packages/a/Pai.java -> package ...m03_packages.a;
 - java.lang (String, Integer, Math, System...) é importado automaticamente. Por isso nunca se importa String.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("===== Quem vê o quê =====");
        Pai pai = new Pai();
        System.out.println(pai.mostrarTudo());
        System.out.println(VizinhoDeA.demonstrar());
        System.out.println(new Filho().demonstrar());
        System.out.println(new Filho().pegadinhaDoProtected(pai, new Filho()));
        System.out.println(Estranho.demonstrar());

        System.out.println("\n===== private é por classe, não por objeto =====");
        System.out.println("Dois Pais têm o mesmo segredo? " + pai.temOMesmoSegredo(new Pai()));

        System.out.println("\n===== import static =====");
        System.out.println("Sobrenome: " + SOBRENOME);

        System.out.println("\n===== Nome totalmente qualificado =====");
        // Duas classes com o mesmo nome (java.util.Date e java.sql.Date) não podem ser importadas juntas.
        // Solução: importa uma e usa a outra pelo nome COMPLETO (pacote + classe).
        Date agora = new Date();
        java.sql.Date hojeNoBanco = new java.sql.Date(agora.getTime());
        System.out.println("java.util.Date: " + agora);
        System.out.println("java.sql.Date:  " + hojeNoBanco);
    }
}

/*
 ===== 📝 SUA TAREFA: monte a tabela de acesso =====
 Faça os 🧪 experimentos de Pai, VizinhoDeA, Filho e Estranho e preencha com ✅ ou ❌.
 Descomente UMA linha por vez (todas declaram "String x", então duas juntas dão erro de variável duplicada).
 Não copie da aula: preencha SÓ com o que o compilador te mostrou.

 | Modificador      | Pai (própria classe) | VizinhoDeA (mesmo pacote) | Filho (outro pacote, herda) | Estranho (outro pacote) |
 |------------------|----------------------|---------------------------|-----------------------------|-------------------------|
 | private          |                      |                           |                             |                         |
 | (nenhum)         |                      |                           |                             |                         |
 | protected        |                      |                           |                             |                         |
 | public           |                      |                           |                             |                         |

 Depois responda nos comentários:
 1. Qual modificador é MAIS aberto: (nenhum) ou protected? Por quê?
 2. Por que o Filho acessa outroFilho.heranca mas não umPai.heranca?
 3. Ordene do mais restrito para o mais aberto: public, private, protected, (nenhum).
 */
