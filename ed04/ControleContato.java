package ed04;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * The ContatoController class manages the list of contacts and the application logic.
 */
public class ContatoController {
    private List<Contato> listaContatos;
    private ContatoView view;
    private Scanner scanner;

    /**
     * Constructs a new ContatoController.
     */
    public ContatoController() {
        listaContatos = new ArrayList<>();
        view = new ContatoView();
        scanner = new Scanner(System.in);
    }

    /**
     * Adds a new contact to the list.
     */
    public void adicionarContato() {
        String tipoContato = view.getTipoContato(scanner);

        if (tipoContato == null) {
            view.exibirMensagem("Tipo de contato inválido.");
            return;
        }

        String nome = view.getInput("Nome:", scanner);
        if (!validarNome(nome)) {
            view.exibirMensagem("Nome inválido. O nome é obrigatório e deve ter no mínimo 3 caracteres.");
            return;
        }

        String telefone = view.getInput("Telefone:", scanner);
        String email = view.getInput("Email:", scanner);

        if (tipoContato.equalsIgnoreCase("PF")) {
            String cpf = view.getInput("CPF:", scanner);
            if (!validarCpf(cpf)) {
                view.exibirMensagem("CPF inválido. Deve conter 11 dígitos numéricos.");
                return;
            }
            if (contatoExiste(cpf)) {
                view.exibirMensagem("Já existe um contato com este CPF.");
                return;
            }
            listaContatos.add(new PessoaFisica(nome, telefone, email, cpf));
            view.exibirMensagem("Pessoa Física adicionada com sucesso!");
        } else if (tipoContato.equalsIgnoreCase("PJ")) {
            String cnpj = view.getInput("CNPJ:", scanner);
            if (!validarCnpj(cnpj)) {
                view.exibirMensagem("CNPJ inválido. Deve conter 14 dígitos numéricos.");
                return;
            }
            if (contatoExiste(cnpj)) {
                view.exibirMensagem("Já existe um contato com este CNPJ.");
                return;
            }
            listaContatos.add(new PessoaJuridica(nome, telefone, email, cnpj));
            view.exibirMensagem("Pessoa Jurídica adicionada com sucesso!");
        }
    }

    /**
     * Lists all contacts.
     */
    public void listarContatos() {
        if (listaContatos.isEmpty()) {
            view.exibirMensagem("Nenhum contato cadastrado.");
            return;
        }
        view.exibirListaContatos(listaContatos);
    }

    /**
     * Updates an existing contact.
     */
    public void atualizarContato() {
        String identificador = view.getInput("Digite o CPF ou CNPJ do contato a ser atualizado:", scanner);
        Contato contatoParaAtualizar = encontrarContatoPorIdentificador(identificador);

        if (contatoParaAtualizar == null) {
            view.exibirMensagem("Contato não encontrado.");
            return;
        }

        view.exibirMensagem("Informações atuais do contato:");
        contatoParaAtualizar.displayContactInfo();

        view.exibirMensagem("Digite as novas informações (deixe em branco para manter o valor atual):");

        String novoNome = view.getInput("Novo Nome:", scanner);
        if (!novoNome.trim().isEmpty()) {
             if (!validarNome(novoNome)) {
                view.exibirMensagem("Nome inválido. O nome é obrigatório e deve ter no mínimo 3 caracteres.");
                return;
            }
            contatoParaAtualizar.setNome(novoNome);
        }

        String novoTelefone = view.getInput("Novo Telefone:", scanner);
        if (!novoTelefone.trim().isEmpty()) {
            contatoParaAtualizar.setTelefone(novoTelefone);
        }

        String novoEmail = view.getInput("Novo Email:", scanner);
        if (!novoEmail.trim().isEmpty()) {
            contatoParaAtualizar.setEmail(novoEmail);
        }

        view.exibirMensagem("Contato atualizado com sucesso!");
    }

    /**
     * Deletes a contact.
     */
    public void excluirContato() {
        String identificador = view.getInput("Digite o CPF ou CNPJ do contato a ser excluído:", scanner);
        Contato contatoParaExcluir = encontrarContatoPorIdentificador(identificador);

        if (contatoParaExcluir == null) {
            view.exibirMensagem("Contato não encontrado.");
            return;
        }

        listaContatos.remove(contatoParaExcluir);
        view.exibirMensagem("Contato excluído com sucesso!");
    }

    /**
     * Finds a contact by its identifier (CPF or CNPJ).
     * @param identifier The CPF or CNPJ to search for.
     * @return The Contato object if found, null otherwise.
     */
    private Contato encontrarContatoPorIdentificador(String identifier) {
        for (Contato contato : listaContatos) {
            if (contato.getIdentifier().equals(identifier)) {
                return contato;
            }
        }
        return null;
    }

    /**
     * Checks if a contact with the given identifier already exists.
     * @param identifier The CPF or CNPJ to check.
     * @return True if a contact with the identifier exists, false otherwise.
     */
    private boolean contatoExiste(String identifier) {
        return encontrarContatoPorIdentificador(identifier) != null;
    }

    /**
     * Validates the name.
     * @param nome The name to validate.
     * @return True if the name is valid, false otherwise.
     */
    private boolean validarNome(String nome) {
        return nome != null && nome.trim().length() >= 3;
    }

    /**
     * Validates the CPF.
     * @param cpf The CPF to validate.
     * @return True if the CPF is valid, false otherwise.
     */
    private boolean validarCpf(String cpf) {
        return cpf != null && cpf.matches("\\d{11}");
    }

    /**
     * Validates the CNPJ.
     * @param cnpj The CNPJ to validate.
     * @return True if the CNPJ is valid, false otherwise.
     */
    private boolean validarCnpj(String cnpj) {
        return cnpj != null && cnpj.matches("\\d{14}");
    }


    /**
     * Runs the contact agenda application.
     */
    public void run() {
        int opcao;
        do {
            view.exibirMenu();
            try {
                opcao = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (opcao) {
                    case 1:
                        adicionarContato();
                        break;
                    case 2:
                        listarContatos();
                        break;
                    case 3:
                        atualizarContato();
                        break;
                    case 4:
                        excluirContato();
                        break;
                    case 5:
                        view.exibirMensagem("Saindo...");
                        break;
                    default:
                        view.exibirMensagem("Opção inválida. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                view.exibirMensagem("Entrada inválida. Digite um número.");
                scanner.next(); // Consume invalid input
                opcao = 0; // Keep the loop going
            }
        } while (opcao != 5);

        scanner.close();
    }

    /**
     * The main method to start the application.
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        ContatoController controller = new ContatoController();
        controller.run();
    }
}