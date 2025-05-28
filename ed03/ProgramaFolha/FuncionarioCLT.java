package ed03.ProgramaFolha;

/**
 * Classe que representa um funcionário CLT.
 */
public class FuncionarioCLT extends Funcionario {
    /**
     * Construtor da classe FuncionarioCLT.
     * @param nome Nome do funcionário
     * @param salarioBase Salário base do funcionário
     */
    public FuncionarioCLT(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    /**
     * Calcula o salário final com adicional fixo.
     * @return Salário base + R$ 300,00
     */
    @Override
    public double calcularSalario() {
        return salarioBase + 300;
    }
}