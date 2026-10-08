package com.example.leetcode.javaBasicsTraining.m02_classModifiers.acesso;

/*
 PUBLIC (classe)
 - Visível em QUALQUER pacote.
 - Só pode existir UMA classe public por arquivo, e ela precisa ter o MESMO nome do arquivo.
   Este arquivo se chama ClassePublica.java, então a classe public tem que se chamar ClassePublica.
 */
public class ClassePublica {

    public String mensagem() {
        return "Sou public: qualquer pacote me enxerga";
    }
}

/*
 Uma SEGUNDA classe no mesmo arquivo é permitida, mas ela NÃO pode ser public.
 Ela fica sem modificador (package-private), então só o pacote "acesso" enxerga.

 🧪 Experimento: coloque "public" na frente de "class Ajudante" abaixo.
    Erro: class Ajudante is public, should be declared in a file named Ajudante.java
 */
class Ajudante {

    String ajudar() {
        return "Sou uma segunda classe no arquivo ClassePublica.java";
    }
}
