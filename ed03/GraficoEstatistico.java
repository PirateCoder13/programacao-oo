package ed03;

/**
 * Classe que representa um gráfico estatístico
 */
public class GraficoEstatistico implements Imprimivel {
    private String titulo;
    private String tipoGrafico;

    /**
     * Construtor da classe GraficoEstatistico
     * @param titulo Título do gráfico
     * @param tipoGrafico Tipo do gráfico (ex: "pizza", "barra")
     */
    public GraficoEstatistico(String titulo, String tipoGrafico) {
        this.titulo = titulo;
        this.tipoGrafico = tipoGrafico;
    }

    /**
     * Imprime informações do gráfico
     */
    @Override
    public void imprimir() {
        System.out.println("Gráfico do tipo: " + tipoGrafico.toUpperCase());
        System.out.println("Título: " + titulo.toUpperCase());
    }
} 