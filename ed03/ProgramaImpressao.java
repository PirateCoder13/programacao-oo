package ed03;

/**
 * Classe principal que demonstra o uso do sistema de impressão
 */
public class ProgramaImpressao {
    public static void main(String[] args) {
        // Criando instâncias das classes que implementam Imprimivel
        DocumentoTexto documento = new DocumentoTexto("Documento de Apresentação", "Este é o conteúdo do documento.");
        ImagemDigital imagem = new ImagemDigital("paisagem.jpg", "1920x1080");
        GraficoEstatistico grafico = new GraficoEstatistico("Distribuição de Vendas", "barra");
        RelatorioPDF relatorio = new RelatorioPDF("João Silva", 12);

        // Imprimindo cada objeto
        documento.imprimir();
        System.out.println();
        
        imagem.imprimir();
        System.out.println();
        
        grafico.imprimir();
        System.out.println();
        
        relatorio.imprimir();
    }
} 