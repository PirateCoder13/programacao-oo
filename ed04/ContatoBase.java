package ed04;

/**
 * Classe base abstrata para contatos, implementando a interface Contato.
 * Contém atributos comuns como nome, telefone e email.
 */
public abstract class ContatoBase implements Contato {

    protected String nome;
    protected String telefone;
    protected String email;

    /**
     * Construtor para criar um ContatoBase.
     *
     * @param nome O nome do contato.
     * @param telefone O telefone do contato.
     * @param email O email do contato.
     */
    public ContatoBase(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
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
     * Obtém o identificador único do contato (CPF ou CNPJ).
     *
     * @return O identificador único do contato.
     */
    @Override
    public abstract String getIdentifier();

    /**
     * Exibe as informações do contato.
     */
    @Override
    public abstract void displayContactInfo();
}