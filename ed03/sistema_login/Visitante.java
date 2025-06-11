package ed03.sistema_login;

/**
 * Representa um usuário Visitante com acesso limitado.
 * Não pode se autenticar ou realizar ações de gerenciamento.
 */
public class Visitante extends Usuario {
    
    /**
     * Construtor para criar um Visitante.
     * @param login O login do visitante.
     * @param senha Uma senha simbólica (não utilizada para autenticação).
     */
    public Visitante(String login, String senha) {
        super(login, senha);
    }

    /**
     * Sobrescreve o método para exibir uma mensagem de acesso restrito.
     */
    @Override
    public void exibirLogin() {
        System.out.println("Visitante - acesso restrito ao sistema.");
    }
}