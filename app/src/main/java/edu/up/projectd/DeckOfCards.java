package edu.up.projectd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

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
        ArrayList<Card> temp = new ArrayList<Card>();
        for (int i=0; i<3; i++){
            if(state.getNumPlayers()==2){
                temp = state.getP1BottomCards();
                temp.add(deck.get(0));
                state.setP1BottomCards(temp);
                deck.remove(0);
                state.setDrawPileNumCards(state.getDrawPileNumCards()-1);
                temp = state.getP2BottomCards();
                temp.add(deck.get(0));
                state.setP2BottomCards(temp);
                deck.remove(0);
                state.setDrawPileNumCards(state.getDrawPileNumCards()-1);
            }
            else if (state.getNumPlayers()==3){
                temp = state.getP1BottomCards();
                temp.add(deck.get(0));
                state.setP1BottomCards(temp);
                deck.remove(0);
                state.setDrawPileNumCards(state.getDrawPileNumCards()-1);
                temp = state.getP2BottomCards();
                temp.add(deck.get(0));
                state.setP2BottomCards(temp);
                deck.remove(0);
                state.setDrawPileNumCards(state.getDrawPileNumCards()-1);
                temp = state.getP3BottomCards();
                temp.add(deck.get(0));
                state.setP3BottomCards(temp);
                deck.remove(0);
                state.setDrawPileNumCards(state.getDrawPileNumCards()-1);
            }
            else{
                temp = state.getP1BottomCards();
                temp.add(deck.get(0));
                state.setP1BottomCards(temp);
                deck.remove(0);
                state.setDrawPileNumCards(state.getDrawPileNumCards()-1);
                temp = state.getP2BottomCards();
                temp.add(deck.get(0));
                state.setP2BottomCards(temp);
                deck.remove(0);
                state.setDrawPileNumCards(state.getDrawPileNumCards()-1);
                temp = state.getP3BottomCards();
                temp.add(deck.get(0));
                state.setP3BottomCards(temp);
                deck.remove(0);
                state.setDrawPileNumCards(state.getDrawPileNumCards()-1);
                temp = state.getP4BottomCards();
                temp.add(deck.get(0));
                state.setP4BottomCards(temp);
                deck.remove(0);
                state.setDrawPileNumCards(state.getDrawPileNumCards()-1);
            }
        }
        for (int i = 0; i<6; i++){
            if(state.getNumPlayers()==2){
                temp = state.getP1Hand();
                temp.add(deck.get(0));
                state.setP1Hand(temp);
                deck.remove(0);
                state.setDrawPileNumCards(state.getDrawPileNumCards()-1);
                state.setP1numCards(state.getP1numCards()+1);
                temp = state.getP2Hand();
                temp.add(deck.get(0));
                state.setP2Hand(temp);
                deck.remove(0);
                state.setDrawPileNumCards(state.getDrawPileNumCards()-1);
                state.setP2numCards(state.getP2numCards()+1);
            }
            else if (state.getNumPlayers()==3){
                temp = state.getP1Hand();
                temp.add(deck.get(0));
                state.setP1Hand(temp);
                deck.remove(0);
                state.setDrawPileNumCards(state.getDrawPileNumCards()-1);
                state.setP1numCards(state.getP1numCards()+1);
                temp = state.getP2Hand();
                temp.add(deck.get(0));
                state.setP2Hand(temp);
                deck.remove(0);
                state.setDrawPileNumCards(state.getDrawPileNumCards()-1);
                state.setP2numCards(state.getP2numCards()+1);
                temp = state.getP3Hand();
                temp.add(deck.get(0));
                state.setP3Hand(temp);
                deck.remove(0);
                state.setDrawPileNumCards(state.getDrawPileNumCards()-1);
                state.setP3numCards(state.getP3numCards()+1);
            }
            else{
                temp = state.getP1Hand();
                temp.add(deck.get(0));
                state.setP1Hand(temp);
                deck.remove(0);
                state.setDrawPileNumCards(state.getDrawPileNumCards()-1);
                state.setP1numCards(state.getP1numCards()+1);
                temp = state.getP2Hand();
                temp.add(deck.get(0));
                state.setP2Hand(temp);
                deck.remove(0);
                state.setDrawPileNumCards(state.getDrawPileNumCards()-1);
                state.setP2numCards(state.getP2numCards()+1);
                temp = state.getP3Hand();
                temp.add(deck.get(0));
                state.setP3Hand(temp);
                deck.remove(0);
                state.setDrawPileNumCards(state.getDrawPileNumCards()-1);
                state.setP3numCards(state.getP3numCards()+1);
                temp = state.getP4Hand();
                temp.add(deck.get(0));
                state.setP4Hand(temp);
                deck.remove(0);
                state.setDrawPileNumCards(state.getDrawPileNumCards()-1);
                state.setP3numCards(state.getP3numCards()+1);
            }
        }
        state.setDrawPileTopCard(deck.get(0));
    }

    public Card getNextCard() { 
        cardCount++;
        return deck.get(cardCount);
    }
    public int getSize() {
        return deck.size();
    }
}
