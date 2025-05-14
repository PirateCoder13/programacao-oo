package ed02.jogorpg;

/**
 * Classe Mago: ataque em área e defesa fraca.
 */
public class Mago extends Personagem {
    public Mago(String nome) {
        super(nome, 80, 30);
    }

    @Override
    public void defender(int dano) {
        hp -= dano + 5; // Defesa fraca
    }

    @Override
    public void usarHabilidadeEspecial() {
        ataqueBase += 15; // Bola de fogo
    }

    @Override
    public void status() {
        System.out.print("[Mago] ");
        super.status();
    }
}
