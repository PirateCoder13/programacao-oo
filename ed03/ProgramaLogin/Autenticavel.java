package ed03.ProgramaLogin;

/**
 * Interface que define o mecanismo básico de autenticação.
 */
public interface Autenticavel {
    /**
     * Verifica se a senha fornecida é válida.
     * @param senha Senha a ser verificada
     * @return true se a autenticação for bem-sucedida, false caso contrário
     */
    boolean autenticar(String senha);
}
