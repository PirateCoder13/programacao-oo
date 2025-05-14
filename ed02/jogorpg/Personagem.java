package ed02.jogorpg;

/**
 * Classe base para personagens do RPG.
 */
public abstract class Personagem {
    private String nome;
    protected int hp;
    protected int ataqueBase;

    public Personagem(String nome, int hp, int ataqueBase) {
        this.nome = nome;
        this.hp = hp;
        this.ataqueBase = ataqueBase;
    }

    /**
     * Realiza um ataque contra outro personagem.
     * 
     * @param inimigo Alvo do ataque
     */
    public void atacar(Personagem inimigo) {
        inimigo.defender(ataqueBase);
    }

    /**
     * Recebe dano de um ataque.
     * 
     * @param dano Valor do dano recebido
     */
    public void defender(int dano) {
        hp -= dano;
    }

    /**
     * Habilidade especial única de cada classe.
     */
    public abstract void usarHabilidadeEspecial();

    /**
     * Exibe o status atual do personagem.
     */
    public void status() {
        System.out.println(nome + " | HP: " + hp + " | Ataque: " + ataqueBase);
    }
}
