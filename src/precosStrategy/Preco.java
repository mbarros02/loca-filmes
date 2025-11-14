package precosStrategy;

/*
 * Strategy:
 * Interface que define o comportamento de cálculo de preço.
 * Cada tipo de filme tem sua própria regra de cálculo.
 */

public interface Preco {
    double calcularPreco(int dias);
}
