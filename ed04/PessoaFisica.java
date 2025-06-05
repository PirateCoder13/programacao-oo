package ed04;

/**
 * Represents a physical person contact.
 */
public class PessoaFisica extends ContatoBase {
    private String cpf;

    /**
     * Constructs a new PessoaFisica object.
     *
     * @param nome  The name of the contact.
     * @param telefone The phone number of the contact.
     * @param email The email address of the contact.
     * @param cpf   The CPF of the contact.
     */
    public PessoaFisica(String nome, String telefone, String email, String cpf) {
        super(nome, telefone, email);
        this.cpf = cpf;
    }

    /**
     * Gets the CPF of the contact.
     *
     * @return The CPF.
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Gets the unique identifier (CPF) of the contact.
     *
     * @return The CPF.
     */
    @Override
    public String getIdentifier() {
        return this.cpf;
    }

    /**
     * Displays the contact information including CPF.
     */
    @Override
    public void displayContactInfo() {
        System.out.println("Tipo: Pessoa Física");
        System.out.println("Nome: " + getNome());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Email: " + getEmail());
        System.out.println("CPF: " + this.cpf);
    }
}