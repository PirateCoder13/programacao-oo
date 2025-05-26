package ed03;

/**
 * Classe que representa uma imagem digital
 */
public class ImagemDigital implements Imprimivel {
    private String nomeArquivo;
    private String resolucao;

    /**
     * Construtor da classe ImagemDigital
     * @param nomeArquivo Nome do arquivo da imagem
     * @param resolucao Resolução da imagem
     */
    public ImagemDigital(String nomeArquivo, String resolucao) {
        this.nomeArquivo = nomeArquivo;
        this.resolucao = resolucao;
    }

    /**
     * Imprime informações da imagem
     */
    @Override
    public void imprimir() {
        System.out.println("Arquivo: " + nomeArquivo);
        System.out.println("Resolução: " + resolucao);
    }
} 