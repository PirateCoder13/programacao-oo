import java.util.Random;

// Classe que controla a lógica do jogo. Ela verifica as tentativas e dá o retorno de "maior", "menor" ou "acertou".
public class Jogo {
	private Jogador jogador;
	private int numeroSecreto;

	// Inicia o jogo com um jogador e sorteia um número secreto entre 1 e 100.
	public Jogo(Jogador jogador) {
		this.jogador = jogador;
		Random rand = new Random();
		this.numeroSecreto = rand.nextInt(100) + 1; // Sorteia o número
	}

	// Aumenta a quantidade de tentativas do jogador
	public String jogar(int tentativa) {
		jogador.incrementarTentativas();

		// Verifica se o jogador acertou o número secreto
		if (tentativa == numeroSecreto) {
			// Calcula os pontos baseados no número de tentativas
			int pontos = 100 - (jogador.getTentativas() * 10);
			jogador.atualizarPontuacao(pontos); // Adiciona os pontos ao jogador
			return "acertou"; // Retorna que o jogador acertou
		} else if (tentativa < numeroSecreto) {
			// Se o palpite foi menor que o número secreto
			return "maior";
		} else {
			// Se o palpite foi maior que o número secreto
			return "menor";
		}
	}
}
