package ed02.jogorpg;

/**
 * Classe que representa um Arqueiro no RPG.
 * Possui habilidade especial de ataque duplo.
 */
public class Arqueiro extends Personagem {
    /**
     * Cria um novo Arqueiro.
     * @param nome Nome do arqueiro
     */
    public Arqueiro(String nome) {
        super(nome, 100, 18);
    }

    /**
     * Realiza um ataque duplo.
     */
    @Override
    public void usarHabilidadeEspecial() {
        System.out.printf("%s usa Flecha Dupla! Ataque realizado duas vezes.\n", nome);
        ataque += 5;
    }
}
