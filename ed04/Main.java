package ed04;

/**
 * Classe principal para iniciar a aplicação da Agenda de Contatos.
 */
public class Main {
    public static void main(String[] args) {
        ControleContato controller = new ControleContato();
        VerContato view = new VerContato(controller);
        view.iniciar();
    }
}