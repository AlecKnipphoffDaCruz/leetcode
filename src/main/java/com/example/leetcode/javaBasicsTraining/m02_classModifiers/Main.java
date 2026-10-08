package com.example.leetcode.javaBasicsTraining.m02_classModifiers;

import com.example.leetcode.javaBasicsTraining.m02_classModifiers.abstrato.Circulo;
import com.example.leetcode.javaBasicsTraining.m02_classModifiers.abstrato.Forma;
import com.example.leetcode.javaBasicsTraining.m02_classModifiers.abstrato.Retangulo;
import com.example.leetcode.javaBasicsTraining.m02_classModifiers.acesso.ClassePublica;
import com.example.leetcode.javaBasicsTraining.m02_classModifiers.acesso.VizinhoDoPacote;
import com.example.leetcode.javaBasicsTraining.m02_classModifiers.finais.Moeda;
import com.example.leetcode.javaBasicsTraining.m02_classModifiers.selado.Boleto;
import com.example.leetcode.javaBasicsTraining.m02_classModifiers.selado.CartaoCredito;
import com.example.leetcode.javaBasicsTraining.m02_classModifiers.selado.Cartao;
import com.example.leetcode.javaBasicsTraining.m02_classModifiers.selado.Pagamento;
import com.example.leetcode.javaBasicsTraining.m02_classModifiers.selado.Pix;
import com.example.leetcode.javaBasicsTraining.m02_classModifiers.selado.ProcessadorPagamento;

/*
 Rode este main e depois faça os 🧪 experimentos que estão nos comentários de cada arquivo.
 Este Main está no pacote "classModifiers", ou seja, FORA dos pacotes acesso/abstrato/finais/selado.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("===== public vs (nenhum) =====");
        System.out.println(new ClassePublica().mensagem()); // ✅ public: visível daqui

        // 🧪 Descomente a linha abaixo.
        //    Erro: ClasseDoPacote is not public in ...acesso; cannot be accessed from outside package
        // new com.example.leetcode.javaBasicsTraining.m02_classModifiers.acesso.ClasseDoPacote();

        VizinhoDoPacote.demonstrar(); // quem está DENTRO do pacote "acesso" enxerga tudo

        System.out.println("\n===== abstract =====");
        // new Forma("Qualquer");  // 🧪 Erro: Forma is abstract; cannot be instantiated
        Forma[] formas = {new Circulo(2), new Retangulo(3, 4)}; // ✅ a VARIÁVEL pode ser do tipo abstrato
        for (Forma forma : formas) {
            System.out.println(forma.descrever()); // cada uma usa o seu próprio area()
        }

        System.out.println("\n===== final =====");
        Moeda moeda = new Moeda("BRL", 49.9); // ✅ final não impede instanciar, só impede herdar
        System.out.println(moeda.formatar());

        System.out.println("\n===== sealed / non-sealed =====");
        Pagamento[] pagamentos = {
                new Pix(100, "alec@email.com"),
                new Boleto(250, "34191.79001"),
                new Cartao(80, "4321"),
                new CartaoCredito(1200, "9876", 10),
        };
        for (Pagamento pagamento : pagamentos) {
            System.out.println(ProcessadorPagamento.processar(pagamento));
        }
    }
}
