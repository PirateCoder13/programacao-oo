package ed02.banco;

/**
 * Classe que representa uma conta salário, sem aplicação de juros.
 */
public class ContaSalario extends Conta {
    public ContaSalario(String cliente, double saldoInicial) {
        super(cliente, saldoInicial);
    }

    @Override
    public void aplicarJurosDiarios() {
        // Não aplica juros
    }

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
}
