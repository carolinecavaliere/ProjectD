package edu.up.projectd;

import java.util.ArrayList;

public class GameState {

    int numPlayers;

    int p1numCards;
    int p2numCards;
    int p3numCards;
    int p4numCards;

    ArrayList<Card> p1Hand;
    ArrayList<Card> p2Hand;
    ArrayList<Card> p3Hand;
    ArrayList<Card> p4Hand;

    int turn;

    DeckOfCards deck;

    ArrayList<Card> p1TopCards;
    ArrayList<Card> p1BottomCards;

    ArrayList<Card> p2TopCards;
    ArrayList<Card> p2BottomCards;

    ArrayList<Card> p3TopCards;
    ArrayList<Card> p3BottomCards;

    ArrayList<Card> p4TopCards;
    ArrayList<Card> p4BottomCards;

    Card drawPileTopCard;
    Card playPileTopCard;

    int drawPileNumCards;
    int playPileNumCards;

    public GameState(int numPlayers)
    {
        this.numPlayers = numPlayers;
        int turn = 1;
        playPileNumCards = 0;
        p1numCards = 0;
        p2numCards = 0;
        p3numCards = 0;
        p4numCards = 0;
        p1TopCards = new ArrayList<Card>();
        p1BottomCards = new ArrayList<Card>();

        p2TopCards = new ArrayList<Card>();
        p2BottomCards = new ArrayList<Card>();

        p3TopCards = new ArrayList<Card>();
        p3BottomCards = new ArrayList<Card>();

        p4TopCards = new ArrayList<Card>();
        p4BottomCards = new ArrayList<Card>();

        p1Hand = new ArrayList<Card>();
        p2Hand = new ArrayList<Card>();
        p3Hand = new ArrayList<Card>();
        p4Hand = new ArrayList<Card>();

        if(this.numPlayers==2)
        {
            deck = new DeckOfCards(1);
        }
        else
        {
            deck= new DeckOfCards(2);
        }
        drawPileNumCards = deck.deck.size();

    }
}
