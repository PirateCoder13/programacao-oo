/**
 * Representa um jogador do jogo de adivinhação
 */
public class Jogador {
	private String nome;
	private int tentativas;
	private int pontuacao;

	/**
	 * Construtor que inicializa o jogador com nome
	 * 
	 * @param nome Nome do jogador
	 */
	public Jogador(String nome) {
		this.nome = nome;
		this.tentativas = 0;
		this.pontuacao = 0;
	}

	// Getters e Setters
	public String getNome() {
		return nome;
	}

	public int getTentativas() {
		return tentativas;
	}

	public int getPontuacao() {
		return pontuacao;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTentativas(int tentativas) {
		this.tentativas = tentativas;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}

	/**
	 * Incrementa o número de tentativas em 1
	 */
	public void incrementarTentativas() {
		this.tentativas++;
	}

	/**
	 * Adiciona pontos à pontuação do jogador
	 * 
	 * @param valor Pontos a serem adicionados
	 */
	public void atualizarPontuacao(int valor) {
		this.pontuacao += valor;
	}
}
