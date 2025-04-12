// Classe que representa um jogador: guarda o nome, quantas tentativas ele já fez e a pontuação.
public class Jogador {
	private String nome;
	private int tentativas;
	private int pontuacao;

	// Cria o jogador com um nome e começa com 0 tentativas e 0 pontos.
	public Jogador(String nome) {
		this.nome = nome;
		this.tentativas = 0;
		this.pontuacao = 0;
	}

	// Getters e Setters (métodos pra pegar e mudar os dados do jogador)

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

	// Aumenta em 1 o número de tentativas do jogador.
	public void incrementarTentativas() {
		this.tentativas++;
	}

	// Adiciona pontos à pontuação do jogador (geralmente quando acerta).
	public void atualizarPontuacao(int valor) {
		this.pontuacao += valor;
	}
}
