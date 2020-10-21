package edu.up.projectd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * @Author: Chloe Gan, Nathaniel Pon, Jimi Hayes, Caroline Cavaliere
 * This class models a deck of cards and handles actions such as shuffling and dealing
 * the deck(s)
 */
public class DeckOfCards {
    static ArrayList<Card> deck = new ArrayList<Card>();//actual array
    static GameState state;
    protected static int cardCount;
    DeckOfCards(int numDecks, GameState gameState){
        state = gameState;
        state.setDrawPileNumCards(0);
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
            state.setDrawPileNumCards(state.getDrawPileNumCards()+52);
        }
        ShuffleDeck(deck);
    }

    public DeckOfCards(DeckOfCards orig){
        deck = new ArrayList<Card>();
        for(int i = 0; i<orig.deck.size(); i++){
            deck.add(new Card(orig.deck.get(i)));
            this.state = orig.state;
        }
    }
    public static void ShuffleDeck(ArrayList<Card> myDeck){
        Collections.shuffle(myDeck);
    }

    public static void DealDeck(){
        for (int i=0; i<3; i++){
            if(state.getNumPlayers()==2){
                state.addToP1Bottom(deck.get(0));
                deck.remove(0);
                state.setDrawPileNumCards(state.getDrawPileNumCards()-1);
                state.addToP2Bottom(deck.get(0));
                deck.remove(0);
                state.setDrawPileNumCards(state.getDrawPileNumCards()-1);
            }
            else if (state.getNumPlayers()==3){
                state.addToP1Bottom(deck.get(0));
                deck.remove(0);
                state.setDrawPileNumCards(state.getDrawPileNumCards()-1);
                state.addToP2Bottom(deck.get(0));
                deck.remove(0);
                state.setDrawPileNumCards(state.getDrawPileNumCards()-1);
                state.addToP3Bottom(deck.get(0));
                deck.remove(0);
                state.setDrawPileNumCards(state.getDrawPileNumCards()-1);
            }
            else{
                state.addToP1Bottom(deck.get(0));
                deck.remove(0);
                state.setDrawPileNumCards(state.getDrawPileNumCards()-1);
                state.addToP2Bottom(deck.get(0));
                deck.remove(0);
                state.setDrawPileNumCards(state.getDrawPileNumCards()-1);
                state.addToP3Bottom(deck.get(0));
                deck.remove(0);
                state.setDrawPileNumCards(state.getDrawPileNumCards()-1);
                state.addToP4Bottom(deck.get(0));
                deck.remove(0);
                state.setDrawPileNumCards(state.getDrawPileNumCards()-1);
            }
        }
        for (int i = 0; i<3; i++){
            if(state.getNumPlayers()==2){
                state.addToP1Hand(deck.get(0));
                deck.remove(0);
                state.setDrawPileNumCards(state.getDrawPileNumCards()-1);
                state.setP1numCards(state.getP1numCards()+1);
                state.addToP2Hand(deck.get(0));
                deck.remove(0);
                state.setDrawPileNumCards(state.getDrawPileNumCards()-1);
                state.setP2numCards(state.getP2numCards()+1);
            }
            else if (state.getNumPlayers()==3){
                state.addToP1Hand(deck.get(0));
                deck.remove(0);
                state.setDrawPileNumCards(state.getDrawPileNumCards()-1);
                state.setP1numCards(state.getP1numCards()+1);
                state.addToP2Hand(deck.get(0));
                deck.remove(0);
                state.setDrawPileNumCards(state.getDrawPileNumCards()-1);
                state.setP2numCards(state.getP2numCards()+1);
                state.addToP3Hand(deck.get(0));
                deck.remove(0);
                state.setDrawPileNumCards(state.getDrawPileNumCards()-1);
                state.setP3numCards(state.getP3numCards()+1);
            }
            else{
                state.addToP1Hand(deck.get(0));
                deck.remove(0);
                state.setDrawPileNumCards(state.getDrawPileNumCards()-1);
                state.setP1numCards(state.getP1numCards()+1);
                state.addToP2Hand(deck.get(0));
                deck.remove(0);
                state.setDrawPileNumCards(state.getDrawPileNumCards()-1);
                state.setP2numCards(state.getP2numCards()+1);
                state.addToP3Hand(deck.get(0));
                deck.remove(0);
                state.setDrawPileNumCards(state.getDrawPileNumCards()-1);
                state.setP3numCards(state.getP3numCards()+1);
                state.addToP4Hand(deck.get(0));
                deck.remove(0);
                state.setDrawPileNumCards(state.getDrawPileNumCards()-1);
                state.setP3numCards(state.getP3numCards()+1);
            }
        }
        for (int i = 0; i<3; i++){
            if(state.getNumPlayers()==2){
                state.addToP1TopCards(deck.get(0));
                deck.remove(0);
                state.setDrawPileNumCards(state.getDrawPileNumCards()-1);
                state.addToP2TopCards(deck.get(0));
                deck.remove(0);
                state.setDrawPileNumCards(state.getDrawPileNumCards()-1);
            }
            else if (state.getNumPlayers()==3){
                state.addToP1TopCards(deck.get(0));
                deck.remove(0);
                state.setDrawPileNumCards(state.getDrawPileNumCards()-1);
                state.addToP2TopCards(deck.get(0));
                deck.remove(0);
                state.setDrawPileNumCards(state.getDrawPileNumCards()-1);
                state.addToP3TopCards(deck.get(0));
                deck.remove(0);
                state.setDrawPileNumCards(state.getDrawPileNumCards()-1);
            }
            else{
                state.addToP1TopCards(deck.get(0));
                deck.remove(0);
                state.setDrawPileNumCards(state.getDrawPileNumCards()-1);
                state.addToP2TopCards(deck.get(0));
                deck.remove(0);
                state.setDrawPileNumCards(state.getDrawPileNumCards()-1);
                state.addToP3TopCards(deck.get(0));
                deck.remove(0);
                state.setDrawPileNumCards(state.getDrawPileNumCards()-1);
                state.addToP4TopCards(deck.get(0));
                deck.remove(0);
                state.setDrawPileNumCards(state.getDrawPileNumCards()-1);
            }
        }
        state.addToPlayPile(deck.get(0));
        deck.remove(0);
        state.setPlayPileNumCards(1);
        state.setPlayPileTopCard(state.getPlayPileCards().get(0));
        state.setDrawPileTopCard(deck.get(0));
    }

    public Card getNextCard() {
        cardCount++;
        state.setDrawPileNumCards(state.getDrawPileNumCards() - 1);
        return deck.get(cardCount);
    }
}
