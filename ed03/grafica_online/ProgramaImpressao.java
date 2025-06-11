package ed03.grafica_online;

/**
 * Classe principal para demonstrar a impressão de diferentes tipos de documentos.
 */
public class ProgramaImpressao {
    /**
     * Método principal que cria e imprime instâncias de vários objetos imprimíveis.
     * @param args Argumentos da linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        DocumentoTexto doc = new DocumentoTexto("Documento de Apresentação", "Este é o conteúdo do documento.");
        ImagemDigital img = new ImagemDigital("paisagem.jpg", "1920x1080");
        GraficoEstatistico grafico = new GraficoEstatistico("Distribuição de Vendas", "Barra");
        RelatorioPDF relatorio = new RelatorioPDF("João Silva", 12);

        doc.imprimir();
        System.out.println();
        
        img.imprimir();
        System.out.println();
        
        grafico.imprimir();
        System.out.println();
        
        relatorio.imprimir();
    }
}