package ed03.sistema_login;

/**
 * Classe abstrata que representa um usuário genérico do sistema.
 * Contém atributos e comportamentos comuns a todos os tipos de usuários.
 */
public abstract class Usuario {
    protected String login;
    protected String senha;

    /**
     * Construtor para criar um usuário.
     * @param login O login de acesso do usuário.
     * @param senha A senha do usuário.
     */
    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    /**
     * Exibe o login do usuário no console.
     */
    public void exibirLogin() {
        System.out.println("Login: " + this.login);
    }
}