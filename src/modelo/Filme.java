package modelo;

import estadoFilmeState.Disponivel;
import estadoFilmeState.EstadosFilme;
import precosStrategy.Preco;

/*
Classe Filme.
Usa Strategy para cálculo de preço.
Usa State para mudar comportamento conforme estado (Disponível/Alugado).
 */

public class Filme {
    private String titulo;
    private Preco preco;
    private EstadosFilme estadosFilme;

    public Filme(String titulo, Preco preco) {
        this.titulo = titulo;
        this.preco = preco;
        this.estadosFilme = new Disponivel();
    }

    public String getTitulo() {
        return titulo;
    }

    //Usa o comportamento atual do estado para tentar alugar o filme.
    public void alugar() {
        estadosFilme.alugar(this);
    }

    //Usa o comportamento atual do estado para devolver o filme.
    public void devolver() {
        estadosFilme.devolver(this);
    }

    //Usa a Strategy configurada para calcular o preço.
    public double calcularPreco(int dias) {
        return preco.calcularPreco(dias);
    }

    //Metodo usado pelo State para alterar o estado atual.
    public void setEstadosFilme(EstadosFilme estado) {
        this.estadosFilme = estado;
    }

    @Override
    public String toString() {
        return "Filme: " + titulo + " (" + estadosFilme.getClass().getSimpleName() + ")";
    }
}
