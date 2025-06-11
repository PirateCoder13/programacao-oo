package ed04;

/**
 * Classe abstrata base para contatos, contendo atributos e métodos comuns.
 * Implementa a interface {@link Contato}.
 */
public abstract class ContatoBase implements Contato {
    private String nome;
    private String telefone;
    private String email;

    /**
     * Construtor para ContatoBase.
     * @param nome Nome do contato. Deve ter no mínimo 3 caracteres.
     * @param telefone Telefone do contato.
     * @param email Email do contato.
     * @throws IllegalArgumentException se o nome for inválido.
     */
    public ContatoBase(String nome, String telefone, String email) {
        setNome(nome); // Validação no setter
        this.telefone = telefone;
        this.email = email;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        if (nome == null || nome.trim().length() < 3) {
            throw new IllegalArgumentException("Nome é obrigatório e deve conter no mínimo 3 caracteres.");
        }
        this.nome = nome.trim();
    }

    @Override
    public String getTelefone() {
        return telefone;
    }

    @Override
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Retorna uma representação textual básica do contato.
     * Classes filhas devem sobrescrever para incluir informações específicas.
     * @return String com nome, telefone e email.
     */
    @Override
    public String toString() {
        return "Nome: " + nome + ", Telefone: " + telefone + ", Email: " + email;
    }
}