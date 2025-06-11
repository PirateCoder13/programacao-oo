package ed03.sistema_login;

/**
 * Interface para objetos que podem ser autenticados no sistema.
 */
public interface Autenticavel {
    /**
     * Verifica se a senha fornecida corresponde à senha armazenada.
     * @param senha A senha a ser verificada.
     * @return true se a autenticação for bem-sucedida, false caso contrário.
     */
    boolean autenticar(String senha);
}