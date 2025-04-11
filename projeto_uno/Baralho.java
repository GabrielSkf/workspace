import java.util.*;

public class Baralho {
    private Queue<Carta> baralho;

    Baralho(Queue<Carta> baralho) {
        this.baralho = baralho;
    }

    public static Queue<Carta> gerarBaralhoCompleto(int total_jogadores) {
        String[] valores = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] naipes = {"copas", "espadas", "ouros", "paus"};

        Queue<Carta> baralho = new LinkedList<>();

        for (String naipe : naipes) {
            for (String valor : valores) {
                baralho.offer(new Carta(valor, naipe));
            }
        }

        Queue<Carta> baralho_extendido = new LinkedList<>();
        for (int i=0; i<total_jogadores; i++) {
            baralho_extendido.addAll(baralho);
        }
//        System.out.println("baralho2" + baralho2);
//        System.out.println("baralho2 tamanho" + baralho2.size());

        return baralho_extendido;
    }

    public static Queue<Carta> embaralhar(Queue<Carta> baralho) {
        List<Carta> lista_auxiliar = new ArrayList<>(baralho.stream().toList());
        Collections.shuffle(lista_auxiliar);
        Queue<Carta> baralho_modificado = new LinkedList<>(lista_auxiliar);
        return baralho_modificado;
    }

    public static HashMap<String, List<Carta>> distribuir (Queue<Carta> baralho, int total_jogadores) {
        HashMap<String, List<Carta>> map = new HashMap<>();
        Queue<Carta> lista_embaralhada = new LinkedList<>(baralho);
        int qtd_cartas_jogador = 9;
        for (int jogador=0; jogador<total_jogadores; jogador++) {
            map.put("J" + jogador, new ArrayList<>());
            for (int i=0;i<qtd_cartas_jogador; i++) {
                map.get("J" + jogador).add(lista_embaralhada.poll());
            }
        }
        System.out.println("map" + map);
        return map;
    }

    public Queue<Carta> getBaralho() {
        return this.baralho;
    }

    public void setBaralho(Queue<Carta> baralho) {
        this.baralho = baralho;
    }

}
