package ed03.ProgramaFolha;

/**
 * Classe que representa um funcionário temporário.
 */
public class FuncionarioTemporario extends Funcionario {
    /**
     * Construtor da classe FuncionarioTemporario.
     * @param nome Nome do funcionário
     * @param salarioBase Salário base do funcionário
     */
    public FuncionarioTemporario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    /**
     * Calcula o salário final com desconto fixo.
     * @return Salário base - R$ 100,00
     */
    @Override
    public double calcularSalario() {
        return salarioBase - 100;
    }
}