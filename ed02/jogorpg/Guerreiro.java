package ed02.jogorpg;

/**
 * Classe que representa um Guerreiro no RPG.
 * Possui habilidade especial de aumentar o ataque.
 */
public class Guerreiro extends Personagem {
    /**
     * Cria um novo Guerreiro.
     * @param nome Nome do guerreiro
     */
    public Guerreiro(String nome) {
        super(nome, 120, 20);
    }

    /**
     * Aumenta o ataque do guerreiro temporariamente.
     */
    @Override
    public void usarHabilidadeEspecial() {
        System.out.printf("%s usa Fúria do Guerreiro! Ataque aumentado.\n", nome);
        ataque += 10;
    }
}
