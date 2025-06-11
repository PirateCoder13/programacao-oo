package ed03.sistema_login;

/**
 * Representa um usuário Administrador do sistema.
 * Possui plenos poderes de autenticação, gerenciamento e log.
 */
public class Administrador extends Usuario implements Autenticavel, Gerenciavel, Logavel {

    /**
     * Construtor para criar um Administrador.
     * @param login O login do administrador.
     * @param senha A senha do administrador.
     */
    public Administrador(String login, String senha) {
        super(login, senha);
    }

    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }

    @Override
    public void alterarSenha(String novaSenha) {
        this.senha = novaSenha;
        System.out.println("Senha alterada com sucesso.");
    }

    @Override
    public void bloquearUsuario() {
        System.out.println("Usuário bloqueado com sucesso.");
    }

    @Override
    public void registrarLog(String operacao) {
        System.out.println("Log registrado: " + operacao);
    }
}