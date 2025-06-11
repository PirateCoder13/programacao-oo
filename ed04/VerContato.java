package ed04;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

/**
 * Classe responsável pela interação com o usuário (entrada e saída de dados)
 * para a agenda de contatos.
 */
public class VerContato {
    private ControleContato controller;
    private Scanner scanner;

    /**
     * Construtor da VerContato.
     * @param controller O controlador de contatos a ser utilizado.
     */
    public VerContato(ControleContato controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    /**
     * Inicia a execução da interface da agenda, exibindo o menu principal.
     */
    public void iniciar() {
        int opcao;
        do {
            exibirMenu();
            while (!scanner.hasNextInt()) {
                System.out.println("Opção inválida. Digite um número.");
                scanner.next(); // consome a entrada inválida
            }
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

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
                    removerContato();
                    break;
                case 5:
                    buscarContato();
                    break;
                case 0:
                    System.out.println("Saindo da agenda...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
            System.out.println(); // Linha em branco para melhor formatação
        } while (opcao != 0);
    }

    /**
     * Exibe o menu principal de opções para o usuário.
     */
    public void exibirMenu() {
        System.out.println("--- Agenda de Contatos ---");
        System.out.println("1. Adicionar Contato");
        System.out.println("2. Listar Contatos");
        System.out.println("3. Atualizar Contato");
        System.out.println("4. Remover Contato");
        System.out.println("5. Buscar Contato por Identificador");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private void adicionarContato() {
        System.out.println("--- Adicionar Novo Contato ---");
        System.out.print("Tipo de contato (1-Pessoa Física, 2-Pessoa Jurídica): ");
        int tipo;
         while (!scanner.hasNextInt()) {
            System.out.println("Tipo inválido. Digite 1 ou 2.");
            scanner.next();
        }
        tipo = scanner.nextInt();
        scanner.nextLine(); // Consumir nova linha

        try {
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Telefone: ");
            String telefone = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();

            Contato novoContato;
            if (tipo == 1) {
                System.out.print("CPF (11 dígitos): ");
                String identificador = scanner.nextLine();
                novoContato = new PessoaFisica(nome, telefone, email, identificador);
            } else if (tipo == 2) {
                System.out.print("CNPJ (14 dígitos): ");
                String identificador = scanner.nextLine();
                novoContato = new PessoaJuridica(nome, telefone, email, identificador);
            } else {
                System.out.println("Tipo de contato inválido.");
                return;
            }

            if (controller.adicionar(novoContato)) {
                System.out.println("Contato adicionado com sucesso!");
            } else {
                System.out.println("Erro: Contato com este identificador (CPF/CNPJ) já existe.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao adicionar contato: " + e.getMessage());
        }
    }

    private void atualizarContato() {
        System.out.println("--- Atualizar Contato ---");
        System.out.print("Digite o CPF/CNPJ do contato a ser atualizado: ");
        String identificador = scanner.nextLine();

        if (!controller.buscarPorIdentificador(identificador).isPresent()) {
            System.out.println("Contato não encontrado.");
            return;
        }

        try {
            System.out.print("Novo Nome: ");
            String novoNome = scanner.nextLine();
            System.out.print("Novo Telefone: ");
            String novoTelefone = scanner.nextLine();
            System.out.print("Novo Email: ");
            String novoEmail = scanner.nextLine();

            if (controller.atualizar(identificador, novoNome, novoTelefone, novoEmail)) {
                System.out.println("Contato atualizado com sucesso!");
            } else {
                System.out.println("Erro ao atualizar o contato.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao atualizar contato: " + e.getMessage());
        }
    }

    private void removerContato() {
        System.out.println("--- Remover Contato ---");
        System.out.print("Digite o CPF/CNPJ do contato a ser removido: ");
        String identificador = scanner.nextLine();

        if (controller.remover(identificador)) {
            System.out.println("Contato removido com sucesso!");
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    public void mostrarContatos(List<Contato> contatos) {
        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato cadastrado.");
            return;
        }
        System.out.println("--- Lista de Contatos ---");
        String format = "| %-25s | %-15s | %-25s | %-18s | %-15s |%n";
        System.out.format("+---------------------------+-----------------+---------------------------+--------------------+-----------------+%n");
        System.out.format(format, "Nome", "Telefone", "Email", "Identificador", "Tipo");
        System.out.format("+---------------------------+-----------------+---------------------------+--------------------+-----------------+%n");

        for (Contato contato : contatos) {
            String tipoContato = (contato instanceof PessoaFisica) ? "Pessoa Física" : "Pessoa Jurídica";
            System.out.format(format, 
                truncate(contato.getNome(), 25), 
                truncate(contato.getTelefone(), 15), 
                truncate(contato.getEmail(), 25),
                truncate(contato.getIdentificador(), 18),
                tipoContato);
        }
        System.out.format("+---------------------------+-----------------+---------------------------+--------------------+-----------------+%n");
    }
    
    private String truncate(String value, int length) {
        if (value == null) return "";
        return value.length() > length ? value.substring(0, length) : value;
    }

    private void listarContatos() {
        mostrarContatos(controller.listar());
    }

    private void buscarContato() {
        System.out.println("--- Buscar Contato ---");
        System.out.print("Digite o CPF/CNPJ do contato: ");
        String identificador = scanner.nextLine();
        Optional<Contato> contatoOpt = controller.buscarPorIdentificador(identificador);
        if (contatoOpt.isPresent()) {
            System.out.println("Contato encontrado:");
            System.out.println(contatoOpt.get().toString());
        } else {
            System.out.println("Contato não encontrado.");
        }
    }
}