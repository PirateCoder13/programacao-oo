package ed02.banco;

/**
 * Classe que representa uma conta poupança, aplicando juros de 0.08% ao dia.
 */
public class ContaPoupanca extends Conta {
    public ContaPoupanca(String cliente, double saldoInicial) {
        super(cliente, saldoInicial);
    }

    @Override
    public void aplicarJurosDiarios() {
        saldo += saldo * 0.0008; // 0.08% ao dia
    }

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
}
