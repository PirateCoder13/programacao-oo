package ed02.banco;

/**
 * Representa uma conta corrente, que aplica 0.1% de juros ao dia.
 */
public class ContaCorrente extends Conta {
    /**
     * Cria uma nova Conta Corrente.
     * @param cliente Nome do cliente
     * @param saldoInicial Saldo inicial
     */
    public ContaCorrente(String cliente, double saldoInicial) {
        super(cliente, saldoInicial);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void imprimirExtrato(double saldoAntesJuros) {
        System.out.println("======================================");
        System.out.println("Extrato da Conta Corrente");
        System.out.println("Cliente: " + cliente);
        System.out.printf("Saldo antes dos juros: R$ %.2f\n", saldoAntesJuros);
        System.out.printf("Saldo após os juros:  R$ %.2f\n", saldo);
        System.out.println("Juros diário aplicado: 0.10%");
        System.out.println("======================================");
    }

    /**
     * Aplica 0.1% de juros ao saldo.
     */
    @Override
    public void aplicarJurosDiarios() {
        saldo += saldo * 0.001;
    }
}
