package ed03;

/**
 * Classe que representa um cliente do sistema
 */
public class Cliente extends Usuario implements Autenticavel {
    /**
     * Construtor da classe Cliente
     * @param login Login do cliente
     * @param senha Senha do cliente
     */
    public Cliente(String login, String senha) {
        super(login, senha);
    }

    /**
     * Verifica se a senha fornecida é válida
     * @param senha Senha a ser verificada
     * @return true se a senha tiver mais de 6 caracteres e for igual à armazenada
     */
    @Override
    public boolean autenticar(String senha) {
        return senha.length() > 6 && this.senha.equals(senha);
    }
} 