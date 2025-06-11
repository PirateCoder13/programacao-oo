package ed03.grafica_online;

/**
 * Interface que define um contrato para objetos que podem ser impressos.
 * Qualquer classe que implemente esta interface deve fornecer uma lógica
 * para o método imprimir().
 */
public interface Imprimivel {
    /**
     * Método responsável por exibir os dados do objeto de uma forma específica.
     */
    void imprimir();
}