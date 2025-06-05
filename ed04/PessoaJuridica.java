package ed04;

/**
 * Represents a legal entity contact (Pessoa Juridica).
 */
public class PessoaJuridica extends ContatoBase {
    private String cnpj;

    /**
     * Constructs a new PessoaJuridica object.
     *
     * @param nome  The name of the legal entity.
     * @param telefone The phone number of the legal entity.
     * @param email The email address of the legal entity.
     * @param cnpj  The CNPJ of the legal entity.
     */
    public PessoaJuridica(String nome, String telefone, String email, String cnpj) {
        super(nome, telefone, email);
        this.cnpj = cnpj;
    }

    /**
     * Gets the CNPJ of the legal entity.
     *
     * @return The CNPJ.
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * Gets the unique identifier of the contact, which is the CNPJ for PessoaJuridica.
     *
     * @return The CNPJ.
     */
    @Override
    public String getIdentifier() {
        return cnpj;
    }

    /**
     * Displays the contact information for the legal entity.
     */
    @Override
    public void displayContactInfo() {
        System.out.println("--- Pessoa Juridica ---");
        System.out.println("Nome: " + getNome());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Email: " + getEmail());
        System.out.println("CNPJ: " + cnpj);
        System.out.println("-----------------------");
    }
}