package ed03.sistema_login;

/**
 * Interface para objetos cujas ações podem ser registradas em um log de auditoria.
 */
public interface Logavel {
    /**
     * Simula o registro de uma operação em um log.
     * @param operacao A descrição da operação a ser registrada.
     */
    void registrarLog(String operacao);
}