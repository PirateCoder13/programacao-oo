import java.util.Random;

/**
 * Controla a lógica do jogo de adivinhação
 */
public class Jogo {
	private Jogador jogador;
	private int numeroSecreto;

	/**
	 * Inicializa o jogo com um jogador e sorteia o número
	 * 
	 * @param jogador Jogador da partida
	 */
	public Jogo(Jogador jogador) {
		this.jogador = jogador;
		Random rand = new Random();
		this.numeroSecreto = rand.nextInt(100) + 1;
	}

	/**
	 * Realiza uma tentativa de adivinhação
	 * 
	 * @param tentativa Número informado pelo jogador
	 * @return Resultado da tentativa
	 */
	public String jogar(int tentativa) {
		jogador.incrementarTentativas();

		if (tentativa == numeroSecreto) {
			int pontos = 100 - (jogador.getTentativas() * 10);
			jogador.atualizarPontuacao(pontos);
			return "acertou";
		} else if (tentativa < numeroSecreto) {
			return "maior";
		} else {
			return "menor";
		}
	}
}
