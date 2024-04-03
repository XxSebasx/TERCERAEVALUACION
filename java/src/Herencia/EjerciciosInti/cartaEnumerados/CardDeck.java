package Herencia.EjerciciosInti.cartaEnumerados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardDeck {
    List<Card> deck;
    public CardDeck (){
        deck = new ArrayList<>();
        for(Suit suit : Suit.values()){
            for (Rank rank : Rank.values()) {
                deck.add(new Card(suit, rank));
        }   }
    }
    
    public void print(){
        for (Card card : deck) {
            System.out.println((card));
        }
    }

    public void shuffle(){
        Collections.shuffle(deck);
    }

}
