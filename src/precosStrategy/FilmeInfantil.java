package strategy;

public class FilmeInfantil implements Preco{
    @Override
    public double calcularPreco(int dias) {
        return dias * 5.0;
    }
}
