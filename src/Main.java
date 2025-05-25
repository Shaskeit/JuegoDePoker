public class Main {
    public static void main(String[] args) {
        Deck miDeck = new Deck();

        miDeck.shuffle();
        System.out.println("\nPrimera carta:");
        miDeck.head();

        System.out.println("\nCarta al azar:");
        miDeck.pick();

        System.out.println("\nMano de 5 cartas:");
        miDeck.hand();
    }
}
