package ed03;

/**
 * Classe principal que demonstra o uso do sistema de folha de pagamento
 */
public class ProgramaFolha {
    public static void main(String[] args) {
        // Criando instância de FuncionarioCLT
        FuncionarioCLT carlos = new FuncionarioCLT("Carlos", 2000.0);
        
        // Criando instância de FuncionarioTemporario
        FuncionarioTemporario ana = new FuncionarioTemporario("Ana", 2000.0);

        // Exibindo dados do funcionário CLT
        carlos.exibirDados();
        System.out.println("Salário Final: " + carlos.calcularSalario());
        System.out.println();

        // Exibindo dados do funcionário temporário
        ana.exibirDados();
        System.out.println("Salário Final: " + ana.calcularSalario());
    }
} 