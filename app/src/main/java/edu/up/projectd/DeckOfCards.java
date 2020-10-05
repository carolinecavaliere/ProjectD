package edu.up.projectd;

import java.util.ArrayList;
import java.util.Collections;

public class DeckOfCards {
    static ArrayList<Card> deck = new ArrayList<Card>();//actual array
    static GameState state;
    DeckOfCards(int numDecks, GameState state){
        state = this.state;
        state.drawPileNumCards=0;
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
            state.drawPileNumCards+=52;
        }
        ShuffleDeck(deck);
    }

    public static void ShuffleDeck(ArrayList<Card> myDeck){
        Collections.shuffle(myDeck);
    }

    public static void DealDeck(){
        for (int i=0; i<3; i++){
            if(state.numPlayers==2){
                state.p1BottomCards.add(deck.get(0));
                deck.remove(0);
                state.drawPileNumCards--;
                state.p2BottomCards.add(deck.get(0));
                deck.remove(0);
                state.drawPileNumCards--;
            }
            else if (state.numPlayers==3){
                state.p1BottomCards.add(deck.get(0));
                deck.remove(0);
                state.drawPileNumCards--;
                state.p2BottomCards.add(deck.get(0));
                deck.remove(0);
                state.drawPileNumCards--;
                state.p3BottomCards.add(deck.get(0));
                deck.remove(0);
                state.drawPileNumCards--;
            }
            else{
                state.p1BottomCards.add(deck.get(0));
                deck.remove(0);
                state.drawPileNumCards--;
                state.p2BottomCards.add(deck.get(0));
                deck.remove(0);
                state.drawPileNumCards--;
                state.p3BottomCards.add(deck.get(0));
                deck.remove(0);
                state.drawPileNumCards--;
                state.p4BottomCards.add(deck.get(0));
                deck.remove(0);
                state.drawPileNumCards--;
            }
        }
        for (int i = 0; i<6; i++){
            if(state.numPlayers==2){
                state.p1Hand.add(deck.get(0));
                deck.remove(0);
                state.drawPileNumCards--;
                state.p1numCards++;
                state.p2Hand.add(deck.get(0));
                deck.remove(0);
                state.drawPileNumCards--;
                state.p2numCards++;
            }
            else if (state.numPlayers==3){
                state.p1Hand.add(deck.get(0));
                deck.remove(0);
                state.drawPileNumCards--;
                state.p1numCards++;
                state.p2Hand.add(deck.get(0));
                deck.remove(0);
                state.drawPileNumCards--;
                state.p2numCards++;
                state.p3Hand.add(deck.get(0));
                deck.remove(0);
                state.drawPileNumCards--;
                state.p3numCards++;
            }
            else{
                state.p1Hand.add(deck.get(0));
                deck.remove(0);
                state.drawPileNumCards--;
                state.p1numCards++;
                state.p2Hand.add(deck.get(0));
                deck.remove(0);
                state.drawPileNumCards--;
                state.p2numCards++;
                state.p3Hand.add(deck.get(0));
                deck.remove(0);
                state.drawPileNumCards--;
                state.p3numCards++;
                state.p4Hand.add(deck.get(0));
                deck.remove(0);
                state.drawPileNumCards--;
                state.p4numCards++;
            }
        }
        state.drawPileTopCard=deck.get(0);
    }
}
