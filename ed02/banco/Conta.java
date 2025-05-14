package ed02.banco;

/**
 * Classe base que representa uma conta bancária genérica.
 */
public abstract class Conta {
    private String cliente;
    protected double saldo;

    /**
     * Construtor que inicializa a conta com cliente e saldo.
     * 
     * @param cliente Nome do titular da conta
     * @param saldo   Saldo inicial
     */
    public Conta(String cliente, double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }

    /**
     * Deposita um valor na conta.
     * 
     * @param valor Valor a ser depositado
     */
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
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
        if (sacar(valor)) {
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
     * Aplica juros diários específicos de cada tipo de conta.
     */
    public abstract void aplicarJurosDiarios();

    /**
     * Imprime o extrato da conta.
     */
    public void imprimirExtrato() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Saldo: R$ " + saldo);
    }
}
