package ed03.ProgramaImpressao;

/**
 * Classe que representa uma imagem digital imprimível.
 */
public class ImagemDigital implements Imprimivel {
    private String nomeArquivo;
    private String resolucao;

    /**
     * Construtor da classe ImagemDigital.
     * @param nomeArquivo Nome do arquivo de imagem
     * @param resolucao Resolução da imagem
     */
    public ImagemDigital(String nomeArquivo, String resolucao) {
        this.nomeArquivo = nomeArquivo;
        this.resolucao = resolucao;
    }

    /**
     * Implementação do método de impressão.
     */
    @Override
    public void imprimir() {
        System.out.println("Arquivo: " + nomeArquivo);
        System.out.println("Resolução: " + resolucao + "\n");
    }
}