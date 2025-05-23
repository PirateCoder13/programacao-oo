package ed03;

/**
 * Classe principal que demonstra o sistema de folha de pagamento.
 * Cria instâncias de diferentes tipos de funcionários e exibe seus dados e salários.
 */
public class ProgramaFolha {
    /**
     * Método principal que executa o exemplo do sistema de folha de pagamento.
     * @param args Argumentos da linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        // Criando instância de FuncionarioCLT
        FuncionarioCLT carlos = new FuncionarioCLT("Carlos", 2000.0);
        
        // Criando instância de FuncionarioTemporario
        FuncionarioTemporario ana = new FuncionarioTemporario("Ana", 2000.0);
        
        // Exibindo dados e salário do funcionário CLT
        carlos.exibirDados();
        System.out.println("Salário Final: " + carlos.calcularSalario());
        System.out.println();
        
        // Exibindo dados e salário do funcionário temporário
        ana.exibirDados();
        System.out.println("Salário Final: " + ana.calcularSalario());
    }
}

/**
 * Classe abstrata que representa um funcionário genérico.
 */
abstract class Funcionario {
    protected String nome;
    protected double salarioBase;
    
    /**
     * Construtor da classe Funcionario.
     * @param nome Nome do funcionário
     * @param salarioBase Salário base do funcionário
     */
    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
    
    /**
     * Exibe os dados básicos do funcionário.
     */
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário Base: " + salarioBase);
    }
    
    /**
     * Método abstrato para cálculo do salário final.
     * @return Salário final calculado
     */
    public abstract double calcularSalario();
}

/**
 * Classe que representa um funcionário CLT.
 */
class FuncionarioCLT extends Funcionario {
    private static final double ADICIONAL = 300.0;
    
    /**
     * Construtor da classe FuncionarioCLT.
     * @param nome Nome do funcionário
     * @param salarioBase Salário base do funcionário
     */
    public FuncionarioCLT(String nome, double salarioBase) {
        super(nome, salarioBase);
    }
    
    /**
     * Calcula o salário final do funcionário CLT.
     * @return Salário base + adicional fixo
     */
    @Override
    public double calcularSalario() {
        return salarioBase + ADICIONAL;
    }
}

/**
 * Classe que representa um funcionário temporário.
 */
class FuncionarioTemporario extends Funcionario {
    private static final double DESCONTO = 100.0;
    
    /**
     * Construtor da classe FuncionarioTemporario.
     * @param nome Nome do funcionário
     * @param salarioBase Salário base do funcionário
     */
    public FuncionarioTemporario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }
    
    /**
     * Calcula o salário final do funcionário temporário.
     * @return Salário base - desconto fixo
     */
    @Override
    public double calcularSalario() {
        return salarioBase - DESCONTO;
    }
} 