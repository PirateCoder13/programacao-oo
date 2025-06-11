package ed03.grafica_online;

/**
 * Representa um documento de texto que pode ser impresso.
 * Implementa a interface Imprimivel.
 */
public class DocumentoTexto implements Imprimivel {
    private String titulo;
    private String conteudo;

    /**
     * Construtor para criar um DocumentoTexto.
     * @param titulo O título do documento.
     * @param conteudo O conteúdo textual do documento.
     */
    public DocumentoTexto(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    /**
     * Imprime o documento, exibindo o título em letras maiúsculas
     * seguido pelo conteúdo.
     */
    @Override
    public void imprimir() {
        System.out.println(titulo.toUpperCase());
        System.out.println(conteudo);
    }
}