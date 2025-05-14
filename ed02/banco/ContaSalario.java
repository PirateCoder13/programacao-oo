package ed02.banco;

/**
 * Classe que representa uma conta salário, sem aplicação de juros.
 */
public class ContaSalario extends Conta {
    public ContaSalario(String cliente, double saldo) {
        super(cliente, saldo);
    }

    @Override
    public void aplicarJurosDiarios() {
        // Conta salário não aplica juros
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Conta Salário ===");
        super.imprimirExtrato();
    }
}
