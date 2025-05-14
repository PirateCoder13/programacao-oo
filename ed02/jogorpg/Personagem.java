package ed02.jogorpg;

/**
 * Classe base para personagens do RPG.
 * Define atributos e métodos comuns a todos os personagens.
 */
public abstract class Personagem {
    /** Nome do personagem */
    protected String nome;
    /** Pontos de vida */
    protected int vida;
    /** Pontos de ataque */
    protected int ataque;

    /**
     * Construtor do personagem.
     * @param nome Nome do personagem
     * @param vida Pontos de vida iniciais
     * @param ataque Pontos de ataque iniciais
     */
    public Personagem(String nome, int vida, int ataque) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
    }

    /**
     * Exibe o status atual do personagem.
     */
    public void status() {
        System.out.printf("%s - Vida: %d | Ataque: %d\n", nome, vida, ataque);
    }

    /**
     * Realiza um ataque em outro personagem.
     * @param alvo Personagem alvo do ataque
     */
    public void atacar(Personagem alvo) {
        System.out.printf("%s ataca %s causando %d de dano!\n", nome, alvo.nome, ataque);
        alvo.receberDano(ataque);
    }

    /**
     * Reduz a vida do personagem ao receber dano.
     * @param dano Quantidade de dano recebido
     */
    public void receberDano(int dano) {
        vida -= dano;
        if (vida < 0) vida = 0;
    }

    /**
     * Usa a habilidade especial do personagem.
     */
    public abstract void usarHabilidadeEspecial();
}
