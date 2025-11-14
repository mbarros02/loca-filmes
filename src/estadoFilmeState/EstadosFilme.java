package estadoFilmeState;

/*Utilizando a interface para aplicar o padrão State com os estados do filme*/

import modelo.Filme;

public interface EstadosFilme {
    void alugar(Filme filme);
    void devolver(Filme filme);
}
