import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Placar placar = new Placar();
		int opcao;

		do {
			// Configuração do jogador
			System.out.print("\nDigite seu nome (ou 'sair' para sumir daqui): ");
			String nome = teclado.nextLine().trim();

			// Verifica se o jogador digitou "sair"
			if (nome.equalsIgnoreCase("sair")) {
				System.out.println("\nFinalmente! Vá embora!");
				break;
			}

			// Se o jogador não digitar um nome
			if (nome.isEmpty()) {
				nome = "Burro";
				System.out.println("\nVocê nem sabe escrever seu nome? Vou te chamar de BURRO então!");
			}

			Jogador jogador = new Jogador(nome);

			// Explicação do sistema de pontuação
			System.out.println("\nOlá, " + nome + "! Bem-vindo ao jogo de adivinhação!");
			System.out.println("📋 Sistema de Pontuação:");
			System.out.println("- Você começa com 100 pontos.");
			System.out.println("- A cada tentativa errada, perde 10 pontos.");
			System.out.println("- Tente acertar o número secreto com o menor número de tentativas possível!");
			System.out.println("Boa sorte! Ou não...\n");

			Jogo jogo = new Jogo(jogador);
			boolean acertou = false;

			// Loop do jogo
			System.out.println("Tente adivinhar a bosta desse número de 1 a 100");
			while (!acertou) {
				System.out.print("Tente ai: ");
				int tentativa = teclado.nextInt();
				teclado.nextLine(); // Limpa o buffer

				String resultado = jogo.jogar(tentativa);

				switch (resultado) {
				case "acertou":
					System.out.println("\n✅ Finalmente acertou depois de " + jogador.getTentativas() + " tentativas!");
					System.out.println("Pontuação: " + jogador.getPontuacao() + " pontos");
					acertou = true;
					break;
				case "maior":
					System.out.println("Dica: A bosta do número é MAIOR que " + tentativa);
					break;
				case "menor":
					System.out.println("Dica: A porcaria do número é MENOR que " + tentativa);
					break;
				}
			}

			placar.adicionarJogador(jogador);
			placar.mostrarRanking();

			// Menu de continuação
			System.out.println("\n=== MENU ===");
			System.out.println("1. Jogar de novo");
			System.out.println("2. Sair");
			System.out.print("Escolhe logo, " + nome + ": ");
			opcao = teclado.nextInt();
			teclado.nextLine(); // Limpa o buffer

		} while (opcao != 2);

		System.out.println("\nSuma daqui! Já deu sua hora!");
		teclado.close();
	}
}
