import java.util.Random;

/**
 * Classe que controla a lógica do jogo. Ela verifica as tentativas e retorna:
 * "maior", "menor" e "acertou".
 */
public class Jogo {

    private Jogador jogador;
    private int numeroSecreto;

    /**
     * Inicia o jogo e sorteia um número secreto de 1 à 100.
     * 
     * @param jogador Jogador que vai jogar
     */
    public Jogo(Jogador jogador) {
        this.jogador = jogador;
        Random rand = new Random();
        this.numeroSecreto = rand.nextInt(100) + 1; // Sorteia o número
    }

    /**
     * Realiza uma tentativa do jogador e retorna o resultado.
     * 
     * @param tentativa Número tentado pelo jogador
     * @return "acertou", "maior", "menor"
     */
    public String jogar(int tentativa) {
        jogador.incrementarTentativas();
        // Verifica se o jogador acertou o número secreto.
        if (tentativa == numeroSecreto) {
            // Calcula os pontos baseados no número de tentativas.
            int pontos = 100 - (jogador.getTentativas() * 10);
            jogador.atualizarPontuacao(pontos); // Adiciona os pontos ao jogador.
            return "acertou"; // Retorna que o jogador acertou.
        } else if (tentativa < numeroSecreto) {
            // Se o palpite foi menor que o número secreto.
            return "maior";
        } else {
            // Se o palpite foi maior que o número secreto.
            return "menor";
        }
    }
}
