package ed03.sistema_login;

/**
 * Interface para objetos que representam usuários cujas contas podem ser gerenciadas.
 */
public interface Gerenciavel {
    /**
     * Altera a senha do usuário.
     * @param novaSenha A nova senha a ser definida.
     */
    void alterarSenha(String novaSenha);

    /**
     * Bloqueia o acesso do usuário ao sistema.
     */
    void bloquearUsuario();
}