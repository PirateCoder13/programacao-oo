package ed01;

import java.util.ArrayList;

/**
 * Gerencia o ranking de jogadores
 */
public class Placar {
    private ArrayList<Jogador> ranking;

    /**
     * Construtor que inicializa a lista de jogadores
     */
    public Placar() {
        ranking = new ArrayList<>();
    }

    /**
     * Adiciona um jogador ao ranking
     * @param j Jogador a ser adicionado
     */
    public void adicionarJogador(Jogador j) {
        ranking.add(j);
    }

    /**
     * Exibe o ranking de jogadores ordenado por pontuação
     */
    public void mostrarRanking() {
        // Ordena do maior para o menor
        ranking.sort((j1, j2) -> j2.getPontuacao() - j1.getPontuacao());
        
        System.out.println("\n=== RANKING ===");
        for(Jogador j : ranking) {
            System.out.println(j.getNome() + ": " + j.getPontuacao() + " pontos");
        }
    }
}
