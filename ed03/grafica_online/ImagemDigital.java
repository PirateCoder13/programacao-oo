package ed03.grafica_online;

/**
 * Representa uma imagem digital que pode ser impressa.
 * Implementa a interface Imprimivel.
 */
public class ImagemDigital implements Imprimivel {
    private String nomeArquivo;
    private String resolucao;

    /**
     * Construtor para criar uma ImagemDigital.
     * @param nomeArquivo O nome do arquivo da imagem.
     * @param resolucao A resolução da imagem (ex: "1920x1080").
     */
    public ImagemDigital(String nomeArquivo, String resolucao) {
        this.nomeArquivo = nomeArquivo;
        this.resolucao = resolucao;
    }

    /**
     * Imprime os dados da imagem, exibindo o nome do arquivo e sua resolução.
     */
    @Override
    public void imprimir() {
        System.out.println("Arquivo: " + this.nomeArquivo);
        System.out.println("Resolução: " + this.resolucao);
    }
}