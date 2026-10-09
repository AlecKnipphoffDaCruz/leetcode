package com.example.leetcode.javaBasicsTraining.m03_packages.a;

/*
 VizinhoDeA: MESMO pacote da Pai, mas NÃO herda dela.

 Repare que não precisa de import: classes do mesmo pacote se enxergam direto.
 */
public class VizinhoDeA {

    public static String demonstrar() {
        Pai pai = new Pai();
        // String x = pai.segredo; // 🧪 Erro: segredo has private access in Pai
        String r = pai.familia;  // ✅ mesmo pacote
        r += ", " + pai.heranca; // ✅ SURPRESA: protected também libera o pacote inteiro, mesmo sem herança!
        r += ", " + pai.nome;    // ✅ public
        return "VizinhoDeA vê: " + r;
    }
}
