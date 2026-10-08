package com.example.leetcode.javaBasicsTraining.m02_classModifiers.acesso;

/*
 SEM MODIFICADOR = package-private (classe)
 - Visível SÓ dentro do pacote "acesso".
 - Para quem está em outro pacote, é como se esta classe não existisse.

 Para que serve? Para esconder detalhes de implementação. O pacote expõe só o que é public
 e mantém as classes auxiliares "internas".
 */
class ClasseDoPacote {

    String mensagem() {
        return "Sou package-private: só o pacote 'acesso' me enxerga";
    }
}
