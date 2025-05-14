package ed02.banco;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("Alice", 1000);
        ContaPoupanca cp = new ContaPoupanca("Bob", 1500);
        ContaSalario cs = new ContaSalario("Carlos", 1200);

        cc.depositar(200);
        cp.sacar(100);
        cs.transferir(cc, 300);

        double saldoAntesJurosCC = cc.getSaldo();
        double saldoAntesJurosCP = cp.getSaldo();
        double saldoAntesJurosCS = cs.getSaldo();

        cc.aplicarJurosDiarios();
        cp.aplicarJurosDiarios();
        cs.aplicarJurosDiarios();

        cc.imprimirExtrato(saldoAntesJurosCC);
        cp.imprimirExtrato(saldoAntesJurosCP);
        cs.imprimirExtrato(saldoAntesJurosCS);
    }
}
