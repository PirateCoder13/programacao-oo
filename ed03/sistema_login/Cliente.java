package ed03.sistema_login;

/**
 * Representa um usuário Cliente do sistema.
 * Pode se autenticar, mas não possui privilégios de gerenciamento.
 */
public class Cliente extends Usuario implements Autenticavel {

    /**
     * Construtor para criar um Cliente.
     * @param login O login do cliente.
     * @param senha A senha do cliente.
     */
    public Cliente(String login, String senha) {
        super(login, senha);
    }

    /**
     * Autentica o cliente com uma regra de negócio específica:
     * a senha deve ter mais de 6 caracteres e ser igual à senha armazenada.
     * @param senha A senha a ser verificada.
     * @return true se a senha for válida, false caso contrário.
     */
    @Override
    public boolean autenticar(String senha) {
        if (this.senha.length() > 6) {
            return this.senha.equals(senha);
        }
        return false;
    }
}