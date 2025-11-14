package estadoFilmeState;

import modelo.Filme;

public class Disponivel implements EstadosFilme{

/* Filme está disponível para locação.
Aqui definimos como ele deve se comportar neste estado. */

    @Override
    public void alugar(Filme filme) {
        System.out.println("Filme alugado com sucesso!");
        filme.setEstadosFilme(new Alugado());
    }

    @Override
    public void devolver(Filme filme) {
        System.out.println("O filme já está disponível!");
    }
}
