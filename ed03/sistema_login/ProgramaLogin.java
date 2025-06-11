package ed03.sistema_login;

/**
 * Classe principal para demonstrar o funcionamento do sistema de login.
 */
public class ProgramaLogin {

    /**
     * Método principal que cria usuários e testa suas funcionalidades.
     * @param args Argumentos da linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        // Administrador
        Administrador admin = new Administrador("admin", "admin123");
        admin.exibirLogin();
        System.out.println("Autenticação com 'admin123': " + admin.autenticar("admin123"));
        System.out.println("Autenticação com 'errada': " + admin.autenticar("errada"));
        admin.alterarSenha("novaSenhaSegura");
        admin.bloquearUsuario();
        admin.registrarLog("Exclusão de conta");
        
        System.out.println();
        
        // Visitante
        Visitante visitante = new Visitante("guest", "qualquer");
        visitante.exibirLogin();

        System.out.println();

        // Cliente
        Cliente cliente = new Cliente("joao", "segredo123");
        cliente.exibirLogin();
        System.out.println("Autenticação com 'segredo123': " + cliente.autenticar("segredo123"));
        System.out.println("Autenticação com '12345': " + cliente.autenticar("12345"));
    }
}
