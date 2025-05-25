import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    private ArrayList<Card> cartas;

    public Deck() {
        cartas = new ArrayList<>();
        String[] palos = {"Tréboles", "Corazones", "Picas", "Diamantes"};
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};

        for (String palo : palos) {
            String color = (palo.equals("Corazones") || palo.equals("Diamantes")) ? "Rojo" : "Negro";
            for (String valor : valores) {
                cartas.add(new Card(palo, color, valor));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cartas);
        System.out.println("Se mezcló el Deck.");
    }

    public void head() {
        if (!cartas.isEmpty()) {
            Card carta = cartas.remove(0);
            System.out.println(carta);
            System.out.println("Quedan " + cartas.size() + " cartas en deck");
        }
    }

    public void pick() {
        if (!cartas.isEmpty()) {
            Random rand = new Random();
            int index = rand.nextInt(cartas.size());
            Card carta = cartas.remove(index);
            System.out.println(carta);
            System.out.println("Quedan " + cartas.size() + " cartas en deck");
        }
    }

    public void hand() {
        if (cartas.size() >= 5) {
            for (int i = 0; i < 5; i++) {
                Card carta = cartas.remove(0);
                System.out.println(carta);
            }
            System.out.println("Quedan " + cartas.size() + " cartas en deck");
        } else {
            System.out.println("No hay suficientes cartas en el deck.");
        }
    }
}
