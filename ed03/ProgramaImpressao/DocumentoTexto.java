package ed03.ProgramaImpressao;

/**
 * Classe que representa um documento de texto imprimível.
 */
public class DocumentoTexto implements Imprimivel {
    private String titulo;
    private String conteudo;

    /**
     * Construtor da classe DocumentoTexto.
     * @param titulo Título do documento
     * @param conteudo Conteúdo do documento
     */
    public DocumentoTexto(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    /**
     * Implementação do método de impressão.
     */
    @Override
    public void imprimir() {
        System.out.println(titulo.toUpperCase());
        System.out.println(conteudo + "\n");
    }
}