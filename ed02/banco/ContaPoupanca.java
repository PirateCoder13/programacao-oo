package ed02.banco;

/**
 * Representa uma conta poupança, que aplica 0.08% de juros ao dia.
 */
public class ContaPoupanca extends Conta {
    /**
     * Cria uma nova Conta Poupança.
     * @param cliente Nome do cliente
     * @param saldoInicial Saldo inicial
     */
    public ContaPoupanca(String cliente, double saldoInicial) {
        super(cliente, saldoInicial);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void imprimirExtrato(double saldoAntesJuros) {
        System.out.println("======================================");
        System.out.println("Extrato da Conta Poupança");
        System.out.println("Cliente: " + cliente);
        System.out.printf("Saldo antes dos juros: R$ %.2f\n", saldoAntesJuros);
        System.out.printf("Saldo após os juros:  R$ %.2f\n", saldo);
        System.out.println("Juros diário aplicado: 0.08%");
        System.out.println("======================================");
    }

    /**
     * Aplica 0.08% de juros ao saldo.
     */
    @Override
    public void aplicarJurosDiarios() {
        saldo += saldo * 0.0008;
    }
}
