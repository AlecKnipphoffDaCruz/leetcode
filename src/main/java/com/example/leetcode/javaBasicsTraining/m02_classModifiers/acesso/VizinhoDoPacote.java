package com.example.leetcode.javaBasicsTraining.m02_classModifiers.acesso;

/*
 Esta classe está no MESMO pacote ("acesso"), então ela enxerga TUDO daqui:
 a classe public, a package-private e até a classe Ajudante do arquivo ClassePublica.java.
 */
public class VizinhoDoPacote {

    public static void demonstrar() {
        System.out.println(new ClassePublica().mensagem());   // ✅ public
        System.out.println(new ClasseDoPacote().mensagem());  // ✅ mesmo pacote
        System.out.println(new Ajudante().ajudar());          // ✅ mesmo pacote
    }
}
