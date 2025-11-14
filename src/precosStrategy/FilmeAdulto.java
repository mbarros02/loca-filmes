package strategy;

public class FilmeAdulto implements Preco{
    @Override
    public double calcularPreco(int dias) {
        return dias * 10.0;
    }
}
