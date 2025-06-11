package ed03.folha_pagamento;
/**
 * Representa um funcionário genérico, servindo como base para especializações.
 * Esta classe é abstrata e define a estrutura comum de todos os funcionários.
 */
public abstract class Funcionario {
    private String nome;
    private double salarioBase;

    /**
     * Construtor para criar um funcionário.
     * @param nome O nome do funcionário.
     * @param salarioBase O salário base do funcionário.
     */
    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    /**
     * Exibe os dados básicos do funcionário (nome e salário base).
     */
    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário Base: " + this.salarioBase);
    }

    /**
     * Método abstrato para calcular o salário final.
     * Cada classe filha deve fornecer sua própria implementação.
     * @return O valor do salário final calculado.
     */
    public abstract double calcularSalario();

    // Getters para permitir acesso controlado às subclasses
    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
}