package ed03.folha_pagamento;
/**
 * Representa um funcionário com contrato temporário.
 * Possui um cálculo de salário específico com um desconto fixo.
 */
public class FuncionarioTemporario extends Funcionario {

    /**
     * Construtor para criar um funcionário temporário.
     * @param nome O nome do funcionário.
     * @param salarioBase O salário base do funcionário.
     */
    public FuncionarioTemporario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    /**
     * Calcula o salário final para um funcionário temporário.
     * O cálculo inclui o salário base menos um desconto fixo de R$ 100,00.
     * @return O salário final calculado.
     */
    @Override
    public double calcularSalario() {
        return getSalarioBase() - 100.0;
    }
}