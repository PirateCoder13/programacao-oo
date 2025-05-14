package ed02.banco;

/**
 * Classe abstrata que representa uma conta bancária genérica.
 * Fornece métodos para operações básicas e deve ser estendida por tipos específicos de conta.
 */
public abstract class Conta {
    /** Nome do cliente titular da conta */
    protected String cliente;
    /** Saldo atual da conta */
    protected double saldo;

    /**
     * Construtor da conta.
     * @param cliente Nome do cliente
     * @param saldoInicial Saldo inicial da conta
     */
    public Conta(String cliente, double saldoInicial) {
        this.cliente = cliente;
        this.saldo = saldoInicial;
    }

    /**
     * Realiza um depósito na conta.
     * @param valor Valor a ser depositado
     */
    public void depositar(double valor) {
        if (valor > 0) saldo += valor;
    }

    /**
     * Realiza um saque na conta.
     * @param valor Valor a ser sacado
     * @return true se o saque foi realizado, false caso contrário
     */
    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    /**
     * Transfere um valor para outra conta.
     * @param destino Conta de destino
     * @param valor Valor a ser transferido
     * @return true se a transferência foi realizada, false caso contrário
     */
    public boolean transferir(Conta destino, double valor) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    /**
     * Retorna o saldo atual da conta.
     * @return Saldo da conta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Imprime o extrato da conta, mostrando saldo antes e depois dos juros.
     * @param saldoAntesJuros Saldo antes da aplicação dos juros
     */
    public abstract void imprimirExtrato(double saldoAntesJuros);

    /**
     * Aplica os juros diários conforme o tipo da conta.
     */
    public abstract void aplicarJurosDiarios();
}
