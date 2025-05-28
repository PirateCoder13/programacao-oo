package ed03.ProgramaLogin;

/**
 * Classe principal para execução do sistema de login.
 */
public class ProgramaLogin {
    /**
     * Método principal que testa as funcionalidades de login.
     * @param args Argumentos da linha de comando
     */
    public static void main(String[] args) {
        Administrador admin = new Administrador("admin", "admin123");
        admin.exibirLogin();
        System.out.println("Autenticação com 'admin123': " + admin.autenticar("admin123"));
        System.out.println("Autenticação com 'errada': " + admin.autenticar("errada"));
    }
}