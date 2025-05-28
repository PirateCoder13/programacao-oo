package ed03.ProgramaImpressao;

/**
 * Classe principal para demonstração do sistema de impressão.
 */
public class ProgramaImpressao {
    /**
     * Método principal que testa diferentes tipos de objetos imprimíveis.
     * @param args Argumentos da linha de comando (não utilizado)
     */
    public static void main(String[] args) {
        DocumentoTexto doc = new DocumentoTexto(
            "Relatório Anual", 
            "Dados financeiros do último exercício"
        );
        
        ImagemDigital img = new ImagemDigital(
            "grafico.png", 
            "1280x720"
        );

        doc.imprimir();
        img.imprimir();
    }
}
