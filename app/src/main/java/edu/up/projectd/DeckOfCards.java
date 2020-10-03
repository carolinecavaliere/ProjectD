package edu.up.projectd;

import java.util.ArrayList;
import java.util.Collections;

public class DeckOfCards {
    ArrayList<Card> deck = new ArrayList<Card>();
    DeckOfCards(int numDecks){
        for(int i = 0; i<numDecks; i++){
            deck.add(new Card(1, 14));
            deck.add(new Card(2, 14));
            deck.add(new Card(3, 14));
            deck.add(new Card(4, 14));

            deck.add(new Card(1, 13));
            deck.add(new Card(2, 13));
            deck.add(new Card(3, 13));
            deck.add(new Card(4, 13));

            deck.add(new Card(1, 12));
            deck.add(new Card(2, 12));
            deck.add(new Card(3, 12));
            deck.add(new Card(4, 12));

            deck.add(new Card(1, 11));
            deck.add(new Card(2, 11));
            deck.add(new Card(3, 11));
            deck.add(new Card(4, 11));

            deck.add(new Card(1, 10));
            deck.add(new Card(2, 10));
            deck.add(new Card(3, 10));
            deck.add(new Card(4, 10));

            deck.add(new Card(1, 9));
            deck.add(new Card(2, 9));
            deck.add(new Card(3, 9));
            deck.add(new Card(4, 9));

            deck.add(new Card(1, 8));
            deck.add(new Card(2, 8));
            deck.add(new Card(3, 8));
            deck.add(new Card(4, 8));

            deck.add(new Card(1, 7));
            deck.add(new Card(2, 7));
            deck.add(new Card(3, 7));
            deck.add(new Card(4, 7));

            deck.add(new Card(1, 6));
            deck.add(new Card(2, 6));
            deck.add(new Card(3, 6));
            deck.add(new Card(4, 6));

            deck.add(new Card(1, 5));
            deck.add(new Card(2, 5));
            deck.add(new Card(3, 5));
            deck.add(new Card(4, 5));

            deck.add(new Card(1, 4));
            deck.add(new Card(2, 4));
            deck.add(new Card(3, 4));
            deck.add(new Card(4, 4));

            deck.add(new Card(1, 3));
            deck.add(new Card(2, 3));
            deck.add(new Card(3, 3));
            deck.add(new Card(4, 3));

            deck.add(new Card(1, 2));
            deck.add(new Card(2, 2));
            deck.add(new Card(3, 2));
            deck.add(new Card(4, 2));
        }
        ShuffleDeck(deck);
    }

    public static void ShuffleDeck(ArrayList<Card> myDeck){
        Collections.shuffle(myDeck);
    }

    public static void DealDeck(ArrayList<Card> myDeck, GameState state){
        
    }
}
