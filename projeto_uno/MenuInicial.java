import java.util.Scanner;

public class MenuInicial {

    public static Scanner ler = new Scanner(System.in);

    public static void imprimeMenu() {
        System.out.println("============ BEM VINDO AO JOGO DO UNO =========== ");
        System.out.println("1 - Incluir Quantidade e nome de usuarios");

        System.out.print("Selecione a opção desejada: ");
        switch (ler.nextInt()) {
            case 1 -> imprimeOpcaoJogadores();
            case 2 -> imprimeOpcao2();

        }
    }

    public static int imprimeOpcaoJogadores() {
        System.out.println("++++ OPÇÃO 1 +++++");
        System.out.print("Digite a quantidade de jogadores: ");
        int total_jogadores = ler.nextInt();
        System.out.println("A quantidade total de jogadores é: " + total_jogadores);
        return total_jogadores;
    }

    public static void imprimeOpcao2() {
        System.out.println("++++ OPÇÃO 2 +++++");
        System.out.printf("Digite a quantidade de sla: %s/n", ler.next());
    }

    }


