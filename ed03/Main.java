package ed03;

import ed03.folha_pagamento.ProgramaFolha;
import ed03.grafica_online.ProgramaImpressao;
import ed03.sistema_login.ProgramaLogin;

/**
 * Classe principal para executar todos os exercícios do Estudo Dirigido 03.
 * Cada exercício é chamado a partir de seu respectivo pacote.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("### Executando Folha de Pagamento ###");
        System.out.println("=========================================");
        // Chama o método main da classe ProgramaFolha
        ProgramaFolha.main(null);
        System.out.println("\n");

        System.out.println("=========================================");
        System.out.println("### Executando Gráfica Online ###");
        System.out.println("=========================================");
        // Chama o método main da classe ProgramaImpressao
        ProgramaImpressao.main(null);
        System.out.println("\n");

        System.out.println("=========================================");
        System.out.println("### Executando Sistema de Login ###");
        System.out.println("=========================================");
        // Chama o método main da classe ProgramaLogin
        ProgramaLogin.main(null);
        System.out.println("\n");

        System.out.println("=========================================");
        System.out.println("### Todos foram executados. ###");
        System.out.println("=========================================");
    }
}