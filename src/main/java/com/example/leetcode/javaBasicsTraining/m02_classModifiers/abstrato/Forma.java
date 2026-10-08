package com.example.leetcode.javaBasicsTraining.m02_classModifiers.abstrato;

/*
 ABSTRACT (classe)
 - NÃO pode ser instanciada: "new Forma()" não compila.
 - Serve de BASE para outras classes. Ela define o que toda forma TEM que saber fazer.
 - Pode ter métodos abstratos (sem corpo) E métodos normais (com corpo).
 - Pode ter construtor e campos. Quem usa o construtor são as subclasses, via super(...).

 Por que não dá para instanciar? Porque "uma forma qualquer" não existe na vida real.
 Qual seria a área de uma Forma? Só faz sentido para um Circulo, um Retangulo...

 🧪 Experimentos:
 1. No Main, descomente "new Forma(...)".  Erro: Forma is abstract; cannot be instantiated
 2. Apague o método area() do Circulo.     Erro: Circulo is not abstract and does not override abstract method area()
 3. Troque "abstract class" por "abstract final class".
    Erro: illegal combination of modifiers: abstract and final
    (abstract EXIGE herança e final PROÍBE herança, então as duas juntas não fazem sentido)
 */
public abstract class Forma {

    private final String nome;

    protected Forma(String nome) {
        this.nome = nome;
    }

    // Método abstrato: sem corpo. Toda subclasse concreta é OBRIGADA a implementar.
    public abstract double area();

    // Método concreto: já vem pronto e é herdado por todas as subclasses.
    public String descrever() {
        return nome + " com área " + String.format("%.2f", area());
    }
}
