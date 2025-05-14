package ed02.jogorpg;

/**
 * Classe Arqueiro: ataques críticos e chuva de flechas.
 */
public class Arqueiro extends Personagem {
    public Arqueiro(String nome) {
        super(nome, 100, 25);
    }

    @Override
    public void atacar(Personagem inimigo) {
        // 30% de chance de crítico
        if (Math.random() < 0.3) {
            inimigo.defender(ataqueBase * 2);
        } else {
            super.atacar(inimigo);
        }
    }

    @Override
    public void usarHabilidadeEspecial() {
        ataqueBase *= 3; // Chuva de flechas (3 ataques)
    }

    @Override
    public void status() {
        System.out.print("[Arqueiro] ");
        super.status();
    }
}
