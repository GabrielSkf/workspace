import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Baralho {
    private Queue<Carta> baralho;

    Baralho(Queue<Carta> baralho) {
        this.baralho = baralho;
    }

    public static Queue<Carta> gerarBaralhoCompleto() {
        String[] valores = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] naipes = {"copas", "espadas", "ouros", "paus"};

        Queue<Carta> baralho = new LinkedList<>();

        for (String naipe : naipes) {
            for (String valor : valores) {
                baralho.offer(new Carta(valor, naipe));
            }
        }

        return baralho;
    }

    public Queue<Carta> getBaralho() {
        return this.baralho;
    }

    public void setBaralho(Queue<Carta> baralho) {
        this.baralho = baralho;
    }

}
