package ed02.banco;

/**
 * Classe que representa uma conta corrente, aplicando juros de 0.1% ao dia.
 */
public class ContaCorrente extends Conta {
    public ContaCorrente(String cliente, double saldo) {
        super(cliente, saldo);
    }

    @Override
    public void aplicarJurosDiarios() {
        saldo += saldo * 0.001; // 0.1% ao dia
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Conta Corrente ===");
        super.imprimirExtrato();
    }
}
