package ed03.ProgramaFolha;

/**
 * Classe principal para execução do programa de folha de pagamento.
 */
public class ProgramaFolha {
    /**
     * Método principal que cria instâncias e exibe os resultados.
     * @param args Argumentos da linha de comando
     */
    public static void main(String[] args) {
        FuncionarioCLT carlos = new FuncionarioCLT("Carlos", 2000);
        FuncionarioTemporario ana = new FuncionarioTemporario("Ana", 2000);

        carlos.exibirDados();
        System.out.println("Salário Final: " + carlos.calcularSalario() + "\n");

        ana.exibirDados();
        System.out.println("Salário Final: " + ana.calcularSalario());
    }
}