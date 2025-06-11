package ed04;
/**
 * Interface que define o contrato básico para um contato.
 * Estabelece os métodos públicos obrigatórios que toda classe de contato deve implementar.
 */
public interface Contato {
    /**
     * Retorna o nome do contato.
     * @return o nome do contato.
     */
    String getNome();

    /**
     * Define o nome do contato.
     * @param nome o novo nome do contato.
     */
    void setNome(String nome);

    /**
     * Retorna o telefone do contato.
     * @return o telefone do contato.
     */
    String getTelefone();

    /**
     * Define o telefone do contato.
     * @param telefone o novo telefone do contato.
     */
    void setTelefone(String telefone);

    /**
     * Retorna o email do contato.
     * @return o email do contato.
     */
    String getEmail();

    /**
     * Define o email do contato.
     * @param email o novo email do contato.
     */
    void setEmail(String email);

    /**
     * Retorna o identificador único do contato (CPF ou CNPJ).
     * @return o identificador único.
     */
    String getIdentificador();
}