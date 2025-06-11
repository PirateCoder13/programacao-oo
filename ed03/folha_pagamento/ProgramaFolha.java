package ed03.folha_pagamento;

/**
 * Classe principal para demonstrar o funcionamento do sistema de folha de pagamento.
 */
public class ProgramaFolha {
    /**
     * Método principal que cria instâncias dos funcionários e exibe seus dados e salários.
     * @param args Argumentos da linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        // Instância do funcionário CLT
        Funcionario clt = new FuncionarioCLT("Carlos", 2000.0);
        clt.exibirDados();
        System.out.println("Salário Final: " + clt.calcularSalario());

        System.out.println(); // Linha em branco para separar as saídas

        // Instância do funcionário temporário
        Funcionario temporario = new FuncionarioTemporario("Ana", 2000.0);
        temporario.exibirDados();
        System.out.println("Salário Final: " + temporario.calcularSalario());
    }
}