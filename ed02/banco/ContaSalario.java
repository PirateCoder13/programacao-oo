package ed02.banco;

/**
 * Representa uma conta salário, que não aplica juros.
 */
public class ContaSalario extends Conta {
    /**
     * Cria uma nova Conta Salário.
     * @param cliente Nome do cliente
     * @param saldoInicial Saldo inicial
     */
    public ContaSalario(String cliente, double saldoInicial) {
        super(cliente, saldoInicial);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void imprimirExtrato(double saldoAntesJuros) {
        System.out.println("======================================");
        System.out.println("Extrato da Conta Salário");
        System.out.println("Cliente: " + cliente);
        System.out.printf("Saldo antes dos juros: R$ %.2f\n", saldoAntesJuros);
        System.out.printf("Saldo após os juros:  R$ %.2f\n", saldo);
        System.out.println("Juros diário aplicado: 0.00%");
        System.out.println("======================================");
    }

    /**
     * Não aplica juros ao saldo.
     */
    @Override
    public void aplicarJurosDiarios() {
        // Não aplica juros
    }
}
