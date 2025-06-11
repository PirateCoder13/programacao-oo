package ed04;

/**
 * Representa um contato do tipo Pessoa Jurídica, que estende {@link ContatoBase}
 * e adiciona o atributo CNPJ.
 */
public class PessoaJuridica extends ContatoBase {
    private String cnpj;

    /**
     * Construtor para PessoaJuridica.
     * @param nome Nome do contato (Razão Social/Nome Fantasia).
     * @param telefone Telefone do contato.
     * @param email Email do contato.
     * @param cnpj CNPJ do contato. Deve conter 14 dígitos numéricos.
     * @throws IllegalArgumentException se o nome ou CNPJ forem inválidos.
     */
    public PessoaJuridica(String nome, String telefone, String email, String cnpj) {
        super(nome, telefone, email);
        setCnpj(cnpj); // Validação no setter
    }

    /**
     * Retorna o CNPJ do contato.
     * @return o CNPJ.
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * Define o CNPJ do contato.
     * Realiza validação para 14 dígitos numéricos.
     * @param cnpj o novo CNPJ.
     * @throws IllegalArgumentException se o CNPJ for inválido.
     */
    public void setCnpj(String cnpj) {
        if (cnpj == null || !cnpj.matches("\\d{14}")) {
            throw new IllegalArgumentException("CNPJ deve conter 14 dígitos numéricos.");
        }
        this.cnpj = cnpj;
    }

    @Override
    public String getIdentificador() {
        return getCnpj();
    }

    @Override
    public String toString() {
        return super.toString() + ", CNPJ: " + cnpj + " (Pessoa Jurídica)";
    }
}