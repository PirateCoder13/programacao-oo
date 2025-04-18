import java.util.Scanner;

//Classe principal que executa o jogo de adivinhação.

public class Main {

    // Método principal que executa o loop do jogo, interage com o usuário e exibe o ranking.
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Placar placar = new Placar(); // Cria um placar para armazenar o ranking dos jogadores.
        int opcao;

        do {
            // Configuração do jogador.
            System.out.print("\nDigite seu nome (ou 'sair' para sumir daqui): ");
            String nome = teclado.nextLine().trim();

            // Verifica se o jogador digitou sair.
            if (nome.equalsIgnoreCase("sair")) {
                System.out.println("\nFinalmente! Vá embora!");
                break;
            }

            // Se o jogador não digitar um nome.
            if (nome.isEmpty()) {
                nome = "Burro"; // O nome "Burro" é adicionado ao jogador se ele não digitar o nome.
                System.out.println("\nVocê nem sabe escrever seu nome? Vou te chamar de BURRO então!");
            }

            // Cria o jogador com o nome fornecido.
            Jogador jogador = new Jogador(nome);

            // Explicação do sistema de pontuação.
            System.out.println("\nOlá, " + nome + "! Bem-vindo ao jogo de adivinhação!");
            System.out.println("--=+Sistema de Pontuação+=--");
            System.out.println("- Você começa com 100 pontos.");
            System.out.println("- A cada tentativa errada, perde 10 pontos.");
            System.out.println("- Tente acertar o número secreto com o menor número de tentativas possível!");
            System.out.println("Boa sorte! Ou não...\n");

            // Cria o objeto Jogo para o jogador.
            Jogo jogo = new Jogo(jogador);
            boolean acertou = false;

            // Loop do jogo.
            System.out.println("Tente adivinhar a bosta desse número de 1 a 100");
            while (!acertou) {
                // Inicia a tentativa.
                System.out.print("Tente ai: ");
                int tentativa = teclado.nextInt();
                teclado.nextLine(); // Limpa o buffer.

                // Chama o método jogar para verificar a tentativa do jogador.
                String resultado = jogo.jogar(tentativa);

                // Dependendo do resultado da tentativa, o jogador recebe dicas.
                switch (resultado) {
                    case "acertou":
                        System.out.println(
                                "\n Finalmente acertou depois de " + jogador.getTentativas() + " tentativas!");
                        System.out.println("Pontuação: " + jogador.getPontuacao() + " pontos");
                        acertou = true; // Marca o final do jogo quando o jogador acerta.
                        break;
                    case "maior":
                        System.out.println("Dica: A bosta do número é MAIOR que " + tentativa); // Dica quando o palpite é menor.
                        break;
                    case "menor":
                        System.out.println("Dica: A porcaria do número é MENOR que " + tentativa); // Dica quando o palpite é maior.
                        break;
                }
            }

            // Adiciona o jogador ao ranking.
            placar.adicionarJogador(jogador);
            placar.mostrarRanking();

            // Menu para decidir o que fazer depois do jogo.
            System.out.println("\n=== MENU ===");
            System.out.println("1. Jogar de novo");
            System.out.println("2. Sair");
            System.out.print("Escolhe logo, " + nome + ": ");
            opcao = teclado.nextInt();
            teclado.nextLine(); // Limpa o buffer.

        } while (opcao != 2);

        // Mensagem final quando o jogador escolhe sair.
        System.out.println("\nSuma daqui! Já deu sua hora!");
        teclado.close(); // Fecha o scanner ao final do jogo.
    }
}
