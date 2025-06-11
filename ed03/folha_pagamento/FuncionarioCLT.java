package ed03.folha_pagamento;

/**
 * Representa um funcionário contratado sob o regime CLT.
 * Possui um cálculo de salário específico com um adicional fixo.
 */
public class FuncionarioCLT extends Funcionario {

    /**
     * Construtor para criar um funcionário CLT.
     * @param nome O nome do funcionário.
     * @param salarioBase O salário base do funcionário.
     */
    public FuncionarioCLT(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    /**
     * Calcula o salário final para um funcionário CLT.
     * O cálculo inclui o salário base mais um adicional fixo de R$ 300,00.
     * @return O salário final calculado.
     */
    @Override
    public double calcularSalario() {
        return getSalarioBase() + 300.0;
    }
}