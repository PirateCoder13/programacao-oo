package ed04;

import java.util.Scanner;

/**
 * Classe responsável pela interação com o usuário no console.
 */
public class ContatoView {

    private Scanner scanner;

    /**
     * Construtor da classe ContatoView.
     */
    public ContatoView() {
        scanner = new Scanner(System.in);
    }

    /**
     * Exibe o menu principal da aplicação.
     */
    public void exibirMenu() {
        System.out.println("\n--- Agenda de Contatos ---");
        System.out.println("1. Cadastrar Contato");
        System.out.println("2. Listar Contatos");
        System.out.println("3. Atualizar Contato");
        System.out.println("4. Excluir Contato");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");
    }

    /**
     * Obtém a opção do menu selecionada pelo usuário.
     * @return A opção selecionada.
     */
    public int getOpcaoMenu() {
        int opcao = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
        return opcao;
    }

    /**
     * Obtém o tipo de contato (Pessoa Física ou Pessoa Jurídica) do usuário.
     * @return O tipo de contato escolhido ('F' para Física, 'J' para Jurídica).
     */
    public char getTipoContato() {
        char tipo = ' ';
        while (tipo != 'F' && tipo != 'J') {
            System.out.print("Tipo de Contato (F - Física, J - Jurídica): ");
            String input = scanner.nextLine().toUpperCase();
            if (input.length() == 1) {
                tipo = input.charAt(0);
            }
        }
        return tipo;
    }

    /**
     * Obtém os dados comuns de um contato do usuário.
     * @return Um array de Strings contendo nome, telefone e email.
     */
    public String[] getDadosContatoComuns() {
        String[] dados = new String[3];
        System.out.print("Nome: ");
        dados[0] = scanner.nextLine();
        System.out.print("Telefone: ");
        dados[1] = scanner.nextLine();
        System.out.print("Email: ");
        dados[2] = scanner.nextLine();
        return dados;
    }

    /**
     * Obtém o CPF de uma Pessoa Física do usuário.
     * @return O CPF digitado.
     */
    public String getCpf() {
        System.out.print("CPF (apenas números): ");
        return scanner.nextLine();
    }

    /**
     * Obtém o CNPJ de uma Pessoa Jurídica do usuário.
     * @return O CNPJ digitado.
     */
    public String getCnpj() {
        System.out.print("CNPJ (apenas números): ");
        return scanner.nextLine();
    }

    /**
     * Obtém o identificador (CPF ou CNPJ) para busca.
     * @return O identificador digitado.
     */
    public String getIdentificadorParaBusca() {
        System.out.print("Digite o CPF ou CNPJ do contato: ");
        return scanner.nextLine();
    }

    /**
     * Exibe as informações de um contato.
     * @param contato O objeto Contato a ser exibido.
     */
    public void exibirContato(Contato contato) {
        contato.displayContactInfo();
    }

    /**
     * Exibe uma lista de contatos em formato simples.
     * @param contatos A lista de contatos a ser exibida.
     */
    public void exibirListaContatos(java.util.List<Contato> contatos) {
        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato cadastrado.");
            return;
        }
        System.out.println("\n--- Lista de Contatos ---");
        for (Contato contato : contatos) {
            contato.displayContactInfo();
            System.out.println("-------------------------");
        }
    }

    /**
     * Exibe uma mensagem informativa para o usuário.
     * @param mensagem A mensagem a ser exibida.
     */
    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}