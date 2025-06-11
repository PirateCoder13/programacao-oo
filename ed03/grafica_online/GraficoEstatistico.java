package ed03.grafica_online;

/**
 * Representa um gráfico estatístico que pode ser impresso.
 * Implementa a interface Imprimivel.
 */
public class GraficoEstatistico implements Imprimivel {
    private String titulo;
    private String tipoGrafico;

    /**
     * Construtor para criar um GraficoEstatistico.
     * @param titulo O título do gráfico.
     * @param tipoGrafico O tipo do gráfico (ex: "pizza", "barra").
     */
    public GraficoEstatistico(String titulo, String tipoGrafico) {
        this.titulo = titulo;
        this.tipoGrafico = tipoGrafico;
    }

    /**
     * Imprime os dados do gráfico, exibindo o tipo e o título em maiúsculas.
     */
    @Override
    public void imprimir() {
        System.out.println("Gráfico do tipo: " + this.tipoGrafico.toUpperCase());
        System.out.println("Título: " + this.titulo.toUpperCase());
    }
}