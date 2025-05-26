package ed03;

/**
 * Classe que representa um funcionário temporário
 */
public class FuncionarioTemporario extends Funcionario {
    private static final double DESCONTO_FIXO = 100.0;

    /**
     * Construtor da classe FuncionarioTemporario
     * @param nome Nome do funcionário
     * @param salarioBase Salário base do funcionário
     */
    public FuncionarioTemporario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    /**
     * Calcula o salário final do funcionário temporário
     * @return Salário base - desconto fixo
     */
    @Override
    public double calcularSalario() {
        return salarioBase - DESCONTO_FIXO;
    }
} 