package Herencia.EjerciciosInti.cartaEnumerados;
public class CardTest {
    public static void main(String[] args) {
        CardDeck deck = new CardDeck();
        deck.print();
        deck.shuffle();
        System.err.println("----------");
        deck.print();
    }
}
