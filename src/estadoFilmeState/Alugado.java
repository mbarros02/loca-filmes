package estadoFilmeState;

import modelo.Filme;

 //Filme já foi alugado e não pode ser alugado novamente.

public class Alugado implements EstadosFilme{
    @Override
    public void alugar(Filme filme) {
        System.out.println("O filme já está alugado!");
    }

    @Override
    public void devolver(Filme filme) {
        System.out.println("Devolução realizda!");
        filme.setEstadosFilme(new Disponivel());
    }
}
