import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        int total_jogadores = MenuInicial.imprimeOpcaoJogadores();

        int total_baralho = total_jogadores * 13 * 4; // 2 * total de tipos de carta * naipes

        Queue<Carta> total_cartas = Baralho.gerarBaralhoCompleto();
        Queue<Carta> cartas_inalteradas = new LinkedList<>(total_cartas);
//        Queue<Carta> cartas_inalteradas = new Queue<>(total_cartas);
//        Queue<Carta> baralho = null;

        List<String> jogadores = Arrays.asList("J1", "J2", "J3", "J4");

        // Mapa para armazenar o baralho de cada jogador
        HashMap<Object, List<Carta>> baralhosPorJogador = new HashMap<>();

        int conta = (total_baralho/2) - total_cartas.size();
        System.out.println("Conta restante " + conta);

        int valor = 9;

        List<Carta> listaAux = new ArrayList<>();
        // Inicializa a lista de cartas de cada jogador
        while (valor > 0) {
            System.out.println("a" + valor);
            for (String jogador : jogadores) {
                listaAux.add(total_cartas.poll());
                baralhosPorJogador.put(jogador, listaAux);
                valor = valor - 1;
                System.out.println("c" + valor);
            }
        }


        System.out.println("Baralhos por jogador" + baralhosPorJogador);


//        for (Carta carta : total_cartas) {
//            System.out.println("Carta " + carta);
//            for (String jogador : jogadores) {
//                List<String> jogador = new ArrayList<>();
//            }
//
//        }

//        Collections.shuffle(total_cartas);


        // MenuInicial.imprimeMenu();
//        List<Carta> cartas = Arrays.asList(
//                new Carta("A", "copas"),
//                new Carta("10", "espadas"),
//                new Carta("K", "ouros"),
//                new Carta("7", "paus")
//        );
        ImpressoraCartas.imprimirCartas(total_cartas);
        ImpressoraCartas.imprimirCartas(cartas_inalteradas);

    }
}
