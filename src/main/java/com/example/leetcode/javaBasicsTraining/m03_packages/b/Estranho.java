package com.example.leetcode.javaBasicsTraining.m03_packages.b;

import com.example.leetcode.javaBasicsTraining.m03_packages.a.Pai;

/*
 Estranho: OUTRO pacote e NÃO herda de Pai. É o caso mais restrito.
 */
public class Estranho {

    public static String demonstrar() {
        Pai pai = new Pai();
        // String x = pai.segredo; // 🧪 Erro: segredo has private access in Pai
        // String x = pai.familia; // 🧪 Erro: familia is not public in Pai; cannot be accessed from outside package
        // String x = pai.heranca; // 🧪 Erro: heranca has protected access in Pai
        return "Estranho vê: " + pai.nome; // ✅ só o public
    }
}
