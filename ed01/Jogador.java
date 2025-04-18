/**
 * Classe que representa um jogador: guarda o nome, tentativas e pontuação.
 */
public class Jogador {

    private String nome;
    private int tentativas;
    private int pontuacao;

    /**
     * Cria o jogador com um nome e define 0 tentativas e 0 pontos
     * 
     * @param nome Nome do jogador
     */
    public Jogador(String nome) {
        this.nome = nome;
        this.tentativas = 0;
        this.pontuacao = 0;
    }

    /**
     * Retorna o nome do jogador.
     * 
     * @return nome do jogador
     */
    public String getNome() {
        return nome;
    }

    /**
     * Retorna o número de tentativas.
     * 
     * @return tentativas feitas
     */
    public int getTentativas() {
        return tentativas;
    }

    /**
     * Retorna a pontuação.
     * 
     * @return pontuação do jogador
     */
    public int getPontuacao() {
        return pontuacao;
    }

    /**
     * Define o nome.
     * 
     * @param nome Novo nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Define o número de tentativas.
     * 
     * @param tentativas Novo número de tentativas
     */
    public void setTentativas(int tentativas) {
        this.tentativas = tentativas;
    }

    /**
     * Define a pontuação.
     * 
     * @param pontuacao Nova pontuação
     */
    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    /**
     * Aumenta o número de tentativas.
     */
    public void incrementarTentativas() {
        this.tentativas++;
    }

    /**
     * Adiciona pontos à pontuação do jogador.
     * 
     * @param valor Pontos a serem adicionados
     */
    public void atualizarPontuacao(int valor) {
        this.pontuacao += valor;
    }
}
