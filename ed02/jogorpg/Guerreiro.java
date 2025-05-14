package ed02.jogorpg;

/**
 * Classe Guerreiro: alta defesa e golpe duplo.
 */
public class Guerreiro extends Personagem {
    public Guerreiro(String nome) {
        super(nome, 150, 20);
    }

    @Override
    public void defender(int dano) {
        hp -= dano / 2; // Reduz dano pela metade
    }

    @Override
    public void usarHabilidadeEspecial() {
        ataqueBase *= 2; // Golpe duplo
    }

    @Override
    public void status() {
        System.out.print("[Guerreiro] ");
        super.status();
    }
}
