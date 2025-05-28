package ed03.ProgramaLogin;

/**
 * Classe abstrata que representa um usuário genérico do sistema.
 */
public abstract class Usuario {
    protected String login;
    protected String senha;

    /**
     * Construtor que inicializa os dados básicos do usuário.
     * @param login Identificação do usuário
     * @param senha Senha de acesso
     */
    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    /**
     * Exibe o login do usuário no formato padrão.
     */
    public void exibirLogin() {
        System.out.println("Login: " + login);
    }
}
