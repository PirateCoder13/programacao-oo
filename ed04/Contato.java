package ed04;

/**
 * Interface para representar um contato genérico.
 */
public interface Contato {

    /**
     * Obtém o nome do contato.
     * @return O nome do contato.
     */
    String getNome();

    /**
     * Define o nome do contato.
     * @param nome O nome do contato.
     */
    void setNome(String nome);

    /**
     * Obtém o telefone do contato.
     * @return O telefone do contato.
     */
    String getTelefone();

    /**
     * Define o telefone do contato.
     * @param telefone O telefone do contato.
     */
    void setTelefone(String telefone);

    /**
     * Obtém o email do contato.
     * @return O email do contato.
     */
    String getEmail();

    /**
     * Define o email do contato.
     * @param email O email do contato.
     */
    void setEmail(String email);

    /**
     * Obtém o identificador único do contato (CPF ou CNPJ).
     * @return O identificador único do contato.
     */
    String getIdentificadorUnico();

    /**
     * Exibe as informações do contato.
     */
    void exibirInformacoes();
}