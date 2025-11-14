package filmeFactory;

import modelo.Filme;
import precosStrategy.FilmeAdulto;
import precosStrategy.FilmeInfantil;

/*
 Factory Method:
 Classe responsavel por criar objetos Filme.
 A lógica de qual Strategy usar fica centralizada aqui.
 Assim o código da aplicação não precisa saber como filmes são criados.
 */

public class CriarFilme {

    public static Filme criarFilme(String tipo, String titulo) {
        return switch (tipo.toLowerCase()) {
            case "lancamento" -> new Filme(titulo, new FilmeAdulto());
            case "comum"      -> new Filme(titulo, new FilmeInfantil());
            default -> throw new IllegalArgumentException("Tipo de filme inválido");
        };
    }
}
