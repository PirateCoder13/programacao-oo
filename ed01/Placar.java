import java.util.ArrayList;

/**
 * Classe que gerencia o ranking dos jogadores, armazena os jogadores e suas
 * pontuações.
 */
public class Placar {

    private ArrayList<Jogador> ranking;

    // Construtor que inicializa a lista do ranking.
    public Placar() {
        ranking = new ArrayList<>();
    }

    /**
     * Adiciona um jogador ao ranking para que ele seja classificado.
     * 
     * @param j Jogador a ser adicionado
     */
    public void adicionarJogador(Jogador j) {
        ranking.add(j);
    }

    // Exibe o ranking de jogadores.
    public void mostrarRanking() {
        // Ordena o ranking, colocando o jogador com maior pontuação primeiro
        ranking.sort((j1, j2) -> j2.getPontuacao() - j1.getPontuacao());
        // Exibe o ranking na tela
        System.out.println("\n=== RANKING ===");
        for (Jogador j : ranking) {
            // Loop para mostrar o nome do jogador e a pontuação dele
            System.out.println(j.getNome() + ": " + j.getPontuacao() + " pontos");
        }
    }
}
