package ed02.jogorpg;

/**
 * Classe principal para demonstração do sistema RPG.
 * Cria personagens, realiza ataques e usa habilidades especiais.
 */
public class MainRpg {
    /**
     * Método principal que executa o exemplo do sistema RPG.
     * @param args Argumentos da linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        Guerreiro g = new Guerreiro("Thorgal");
        Mago m = new Mago("Merlino");
        Arqueiro a = new Arqueiro("Legolis");

        g.status();
        m.status();
        a.status();

        g.atacar(m);
        m.usarHabilidadeEspecial();
        a.usarHabilidadeEspecial();

        g.status();
        m.status();
        a.status();
    }
}
