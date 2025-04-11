import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        int total_jogadores = MenuInicial.imprimeOpcaoJogadores();
        //int total_baralho = total_jogadores * 36; // 2 * total de tipos de carta * naipes

        Queue<Carta> total_cartas = Baralho.gerarBaralhoCompleto(total_jogadores);
        Queue<Carta> cartas_embaralhas = Baralho.embaralhar(total_cartas);
        HashMap<String, List<Carta>> cartasPorJogador = Baralho.distribuir(cartas_embaralhas, total_jogadores);

        Stack<Carta> pilha_do_baralho = new Stack<>();
        int comecarJogo = MenuInicial.comecarJogo();
        if (comecarJogo == 1) {
            int rodada = 0;
            limparConsole();
            System.out.println("O JOGO COMECOUUUU ");
            int finalizado = 1;
            while (finalizado != 0) {
                ImpressoraCartas.imprimirCartasList(cartasPorJogador.get("J0"));
                System.out.println("Pegue uma carta do baralho!");
                pilha_do_baralho.add(cartas_embaralhas.peek());
                break;
            }

        }


        //System.out.println("J0" + cartasPorJogador.get("J0"));


//        Queue<Carta> cartas_inalteradas = new LinkedList<>(total_cartas);
////        Queue<Carta> cartas_inalteradas = new Queue<>(total_cartas);
////        Queue<Carta> baralho = null;
//
//        List<String> jogadores = Arrays.asList("J1", "J2", "J3", "J4");
//
//        // Mapa para armazenar o baralho de cada jogador
//        HashMap<Object, List<Carta>> baralhosPorJogador = new HashMap<>();
//
//        int conta = total_baralho - total_cartas.size();
//        System.out.println("Conta restante " + conta);
//
//        int valor = 9;
//        List<Carta> lista_aux = new ArrayList<>();
//
//        List<Carta> lista_cartas = new ArrayList<>(total_cartas.stream().toList());
//        Collections.shuffle(lista_cartas);
//        Queue<Carta> lista_embara = new LinkedList<>(lista_cartas);
//
//        //lista_aux.add(total_cartas.poll());
//
//        HashMap<String, List<Carta>> map = new HashMap<>();
//        for (int jogador=0; jogador<total_jogadores; jogador++) {
//            map.put("J" + jogador, new ArrayList<>());
//            for (int i=0;i<valor; i++) {
//                map.get("J" + jogador).add(lista_embara.poll());
//            }
//        }
//
//        System.out.println("map" + map);




//        List<Carta> listaAux = new ArrayList<>();
//        // Inicializa a lista de cartas de cada jogador
//        while (valor > 0) {
//            System.out.println("a" + valor);
//            for (String jogador : jogadores) {
//                listaAux.add(total_cartas.poll());
//                baralhosPorJogador.put(jogador, listaAux);
//                valor = valor - 1;
//                System.out.println("c" + valor);
//            }
//        }
//
//
//        System.out.println("Baralhos por jogador" + baralhosPorJogador);


//        for (Carta carta : total_cartas) {
//            System.out.println("Carta " + carta);
//            for (String jogador : jogadores) {
//                List<String> jogador = new ArrayList<>();
//            }
//
//        }




        // MenuInicial.imprimeMenu();
//        List<Carta> cartas = Arrays.asList(
//                new Carta("A", "copas"),
//                new Carta("10", "espadas"),
//                new Carta("K", "ouros"),
//                new Carta("7", "paus")
//        );
        ImpressoraCartas.imprimirCartas(total_cartas);
        ImpressoraCartas.imprimirCartasStack(pilha_do_baralho);
        ImpressoraCartas.imprimirCartas(cartas_embaralhas);
//        ImpressoraCartas.imprimirCartasList(lista_cartas);
//        ImpressoraCartas.imprimirCartas(cartas_inalteradas);

    }

    public static void limparConsole() {
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }

}
