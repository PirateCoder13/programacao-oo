package ed02.banco;

/**
 * Classe base que representa uma conta bancária genérica.
 */
public abstract class Conta {
    protected String cliente;
    protected double saldo;

    /**
     * Construtor que inicializa a conta com cliente e saldo.
     * 
     * @param cliente Nome do titular da conta
     * @param saldoInicial Saldo inicial
     */
    public Conta(String cliente, double saldoInicial) {
        this.cliente = cliente;
        this.saldo = saldoInicial;
    }

    /**
     * Deposita um valor na conta.
     * 
     * @param valor Valor a ser depositado
     */
    public void depositar(double valor) {
        if (valor > 0) saldo += valor;
    }

    /**
     * Realiza um saque na conta.
     * 
     * @param valor Valor a ser sacado
     * @return true se o saque foi bem-sucedido, false caso contrário
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
     * 
     * @param destino Conta que receberá a transferência
     * @param valor   Valor a ser transferido
     * @return true se a transferência foi bem-sucedida
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
     * 
     * @return Saldo atual
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Imprime o extrato da conta.
     */
    public abstract void imprimirExtrato();

    /**
     * Imprime o extrato da conta com saldo antes dos juros.
     * 
     * @param saldoAntesJuros Saldo antes da aplicação dos juros
     */
    public abstract void imprimirExtrato(double saldoAntesJuros);

    /**
     * Aplica juros diários específicos de cada tipo de conta.
     */
    public abstract void aplicarJurosDiarios();
}
