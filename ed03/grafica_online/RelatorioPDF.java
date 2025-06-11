package ed03.grafica_online;

/**
 * Representa um relatório em PDF que pode ser impresso.
 * Implementa a interface Imprimivel.
 */
public class RelatorioPDF implements Imprimivel {
    private String autor;
    private int numeroPaginas;

    /**
     * Construtor para criar um RelatorioPDF.
     * @param autor O autor do relatório.
     * @param numeroPaginas O número total de páginas.
     */
    public RelatorioPDF(String autor, int numeroPaginas) {
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    /**
     * Imprime os dados do relatório, exibindo o autor e o número de páginas.
     */
    @Override
    public void imprimir() {
        System.out.println("Autor: " + this.autor);
        System.out.println("Total de páginas: " + this.numeroPaginas);
    }
}