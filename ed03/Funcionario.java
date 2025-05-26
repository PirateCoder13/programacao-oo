package ed03;

/**
 * Classe abstrata que representa um funcionário genérico
 */
public abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    /**
     * Construtor da classe Funcionario
     * @param nome Nome do funcionário
     * @param salarioBase Salário base do funcionário
     */
    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    /**
     * Exibe os dados básicos do funcionário
     */
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário Base: " + salarioBase);
    }

    /**
     * Método abstrato para calcular o salário final
     * @return Salário final calculado
     */
    public abstract double calcularSalario();
} 