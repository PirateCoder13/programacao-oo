package ed04;
/**
 * Representa um contato do tipo Pessoa Física, que estende {@link ContatoBase}
 * e adiciona o atributo CPF.
 */
public class PessoaFisica extends ContatoBase {
    private String cpf;

    /**
     * Construtor para PessoaFisica.
     * @param nome Nome do contato.
     * @param telefone Telefone do contato.
     * @param email Email do contato.
     * @param cpf CPF do contato. Deve conter 11 dígitos numéricos.
     * @throws IllegalArgumentException se o nome ou CPF forem inválidos.
     */
    public PessoaFisica(String nome, String telefone, String email, String cpf) {
        super(nome, telefone, email);
        setCpf(cpf); // Validação no setter
    }

    /**
     * Retorna o CPF do contato.
     * @return o CPF.
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Define o CPF do contato.
     * Realiza validação para 11 dígitos numéricos.
     * @param cpf o novo CPF.
     * @throws IllegalArgumentException se o CPF for inválido.
     */
    public void setCpf(String cpf) {
        if (cpf == null || !cpf.matches("\\d{11}")) {
            throw new IllegalArgumentException("CPF deve conter 11 dígitos numéricos.");
        }
        this.cpf = cpf;
    }

    @Override
    public String getIdentificador() {
        return getCpf();
    }

    @Override
    public String toString() {
        return super.toString() + ", CPF: " + cpf + " (Pessoa Física)";
    }
}