package ed03.ProgramaLogin;

/**
 * Classe que representa um usuário administrador.
 */
public class Administrador extends Usuario implements Autenticavel {
    /**
     * Construtor da classe Administrador.
     * @param login Login do administrador
     * @param senha Senha do administrador
     */
    public Administrador(String login, String senha) {
        super(login, senha);
    }

    /**
     * Método de autenticação do administrador.
     * @param senha Senha fornecida para autenticação
     * @return true se a senha estiver correta, false caso contrário
     */
    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }
}
