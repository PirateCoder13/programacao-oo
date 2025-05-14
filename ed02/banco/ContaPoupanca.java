package ed02.banco;

/**
 * Classe que representa uma conta poupança, aplicando juros de 0.08% ao dia.
 */
public class ContaPoupanca extends Conta {
    public ContaPoupanca(String cliente, double saldo) {
        super(cliente, saldo);
    }

    @Override
    public void aplicarJurosDiarios() {
        saldo += saldo * 0.0008; // 0.08% ao dia
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Conta Poupança ===");
        super.imprimirExtrato();
    }
}
