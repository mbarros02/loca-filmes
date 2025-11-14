import filmeFactory.CriarFilme;
import modelo.Filme;

import java.util.*;

/**
  Classe principal do sistema:

 Factory → cria os filmes
 Strategy → calcula o preço
 State → controla disponibilidade
 */

public class LocaFilmes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Filme> filmes = new ArrayList<>();

        filmes.add(CriarFilme.criarFilme("lancamento", "Vingadores"));
        filmes.add(CriarFilme.criarFilme("comum", "Toy Story"));
        filmes.add(CriarFilme.criarFilme("comum", "Matrix"));

        int opc;

        do {
            System.out.println("\n=== LOCADORA ===");
            System.out.println("1 – Listar filmes");
            System.out.println("2 – Alugar filme");
            System.out.println("3 – Devolver filme");
            System.out.println("0 – Sair");
            System.out.print("Escolha: ");
            opc = sc.nextInt();

            switch (opc) {
                case 1 -> {
                    System.out.println("\n--- FILMES ---");
                    int i = 0;
                    for (Filme f : filmes) {
                        System.out.println(i + " - " + f);
                        i++;
                    }
                }
                case 2 -> {
                    System.out.print("ID do filme: ");
                    int id = sc.nextInt();
                    System.out.print("Dias de locação: ");
                    int dias = sc.nextInt();

                    Filme f = filmes.get(id);

                    System.out.println("Valor a pagar: R$ " + f.calcularPreco(dias));
                    f.alugar();
                }
                case 3 -> {
                    System.out.print("ID do filme: ");
                    int id = sc.nextInt();
                    filmes.get(id).devolver();
                }
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida!");
            }

        } while (opc != 0);
    }
}