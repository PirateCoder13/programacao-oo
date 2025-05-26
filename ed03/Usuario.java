package ed03;

/**
 * Classe abstrata que representa um usuário do sistema
 */
public abstract class Usuario {
    protected String login;
    protected String senha;

    /**
     * Construtor da classe Usuario
     * @param login Login do usuário
     * @param senha Senha do usuário
     */
    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    /**
     * Exibe o login do usuário
     */
    public void exibirLogin() {
        System.out.println("Login: " + login);
    }
} 