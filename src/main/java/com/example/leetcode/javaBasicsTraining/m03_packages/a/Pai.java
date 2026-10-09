package com.example.leetcode.javaBasicsTraining.m03_packages.a;

/*
 A classe Pai tem UM campo de cada nível de acesso.
 As outras classes (VizinhoDeA, Filho, Estranho) tentam acessar esses 4 campos,
 e é a partir delas que você vai montar a tabela de acesso no Main.

   pacote a: Pai, VizinhoDeA            (VizinhoDeA NÃO herda de Pai)
   pacote b: Filho extends Pai, Estranho (Estranho NÃO herda de ninguém)
 */
public class Pai {

    private String segredo = "private";
    String familia = "package-private";
    protected String heranca = "protected";
    public String nome = "public";

    // Usada no Main para demonstrar o "import static"
    public static final String SOBRENOME = "Silva";

    // Dentro da própria classe, TUDO é visível.
    public String mostrarTudo() {
        return "Pai vê: " + segredo + ", " + familia + ", " + heranca + ", " + nome;
    }

    /*
     PEGADINHA: private é por CLASSE, não por OBJETO.
     Aqui acessamos o campo private de OUTRO objeto (outro.segredo), e compila,
     porque o código está dentro da classe Pai. É assim que se escreve equals().
     */
    public boolean temOMesmoSegredo(Pai outro) {
        return this.segredo.equals(outro.segredo); // ✅
    }
}
