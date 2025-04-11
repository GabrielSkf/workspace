import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class ImpressoraCartas {

    // ANSI Cores
    private static final String RESET = "\u001B[0m";
    private static final String VERMELHO = "\u001B[31m";
    private static final String AZUL = "\u001B[34m";
    private static final String AMARELO = "\u001B[33m";
    private static final String VERDE = "\u001B[32m";

    // Retorna símbolo puro
    private static String getSimbolo(String naipe) {
        return switch (naipe.toLowerCase()) {
            case "copas" -> "♥";
            case "espadas" -> "♠";
            case "ouros" -> "♦";
            case "paus" -> "♣";
            default -> "?";
        };
    }

    // Retorna cor do naipe
    private static String getCor(String naipe) {
        return switch (naipe.toLowerCase()) {
            case "copas" -> VERMELHO;
            case "espadas" -> AZUL;
            case "ouros" -> AMARELO;
            case "paus" -> VERDE;
            default -> RESET;
        };
    }

    // Imprime as cartas lado a lado com cores distintas
    public static void imprimirCartas(Queue<Carta> cartas) {
        StringBuilder[] linhas = new StringBuilder[7];
        for (int i = 0; i < linhas.length; i++) {
            linhas[i] = new StringBuilder();
        }

        for (Carta carta : cartas) {
            String valor = carta.getValor();
            String naipe = carta.getNaipe();
            String simbolo = getSimbolo(naipe);
            String cor = getCor(naipe);

            String valorEsq = valor.length() == 1 ? valor + " " : valor;
            String valorDir = valor.length() == 1 ? " " + valor : valor;

            linhas[0].append("┌─────────┐ ");
            linhas[1].append("│").append(valorEsq).append("       │ ");
            linhas[2].append("│         │ ");
            linhas[3].append("│    ").append(cor).append(simbolo).append(RESET).append("    │ ");
            linhas[4].append("│         │ ");
            linhas[5].append("│       ").append(valorDir).append("│ ");
            linhas[6].append("└─────────┘ ");
        }

        for (StringBuilder linha : linhas) {
            System.out.println(linha);
        }
    }

    // Imprime as cartas lado a lado com cores distintas
    public static void imprimirCartasList(List<Carta> cartas) {
        StringBuilder[] linhas = new StringBuilder[7];
        for (int i = 0; i < linhas.length; i++) {
            linhas[i] = new StringBuilder();
        }

        for (Carta carta : cartas) {
            String valor = carta.getValor();
            String naipe = carta.getNaipe();
            String simbolo = getSimbolo(naipe);
            String cor = getCor(naipe);

            String valorEsq = valor.length() == 1 ? valor + " " : valor;
            String valorDir = valor.length() == 1 ? " " + valor : valor;

            linhas[0].append("┌─────────┐ ");
            linhas[1].append("│").append(valorEsq).append("       │ ");
            linhas[2].append("│         │ ");
            linhas[3].append("│    ").append(cor).append(simbolo).append(RESET).append("    │ ");
            linhas[4].append("│         │ ");
            linhas[5].append("│       ").append(valorDir).append("│ ");
            linhas[6].append("└─────────┘ ");
        }

        for (StringBuilder linha : linhas) {
            System.out.println(linha);
        }
    }

    public static void imprimirCartasStack(Stack<Carta> cartas) {
        StringBuilder[] linhas = new StringBuilder[7];
        for (int i = 0; i < linhas.length; i++) {
            linhas[i] = new StringBuilder();
        }

        for (Carta carta : cartas) {
            String valor = carta.getValor();
            String naipe = carta.getNaipe();
            String simbolo = getSimbolo(naipe);
            String cor = getCor(naipe);

            String valorEsq = valor.length() == 1 ? valor + " " : valor;
            String valorDir = valor.length() == 1 ? " " + valor : valor;

            linhas[0].append("┌─────────┐ ");
            linhas[1].append("│").append(valorEsq).append("       │ ");
            linhas[2].append("│         │ ");
            linhas[3].append("│    ").append(cor).append(simbolo).append(RESET).append("    │ ");
            linhas[4].append("│         │ ");
            linhas[5].append("│       ").append(valorDir).append("│ ");
            linhas[6].append("└─────────┘ ");
        }

        for (StringBuilder linha : linhas) {
            System.out.println(linha);
        }
    }
}
