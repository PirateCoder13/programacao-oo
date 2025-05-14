package ed02.jogorpg;

/**
 * Classe que representa um Mago no RPG.
 * Possui habilidade especial de recuperar vida.
 */
public class Mago extends Personagem {
    /**
     * Cria um novo Mago.
     * @param nome Nome do mago
     */
    public Mago(String nome) {
        super(nome, 80, 25);
    }

    /**
     * Recupera vida ao usar magia.
     */
    @Override
    public void usarHabilidadeEspecial() {
        System.out.printf("%s usa Cura Mágica! Vida recuperada.\n", nome);
        vida += 20;
    }
}
