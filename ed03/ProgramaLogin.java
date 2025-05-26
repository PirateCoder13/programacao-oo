package ed03;

/**
 * Classe principal que demonstra o uso do sistema de login
 */
public class ProgramaLogin {
    public static void main(String[] args) {
        // Criando instâncias dos diferentes tipos de usuários
        Administrador admin = new Administrador("admin", "admin123");
        Visitante visitante = new Visitante("guest", "qualquer");
        Cliente cliente = new Cliente("joao", "segredo123");

        // Testando o administrador
        admin.exibirLogin();
        System.out.println("Autenticação com 'admin123': " + admin.autenticar("admin123"));
        System.out.println("Autenticação com 'errada': " + admin.autenticar("errada"));
        admin.alterarSenha("novaSenha");
        admin.bloquearUsuario();
        admin.registrarLog("Exclusão de conta");
        System.out.println();

        // Testando o visitante
        visitante.exibirLogin();
        System.out.println();

        // Testando o cliente
        cliente.exibirLogin();
        System.out.println("Autenticação com 'segredo123': " + cliente.autenticar("segredo123"));
        System.out.println("Autenticação com '12345': " + cliente.autenticar("12345"));
    }
} 