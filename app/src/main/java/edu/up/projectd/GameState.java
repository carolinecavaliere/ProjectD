package edu.up.projectd;

import java.util.ArrayList;
import java.util.Iterator;

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
            deck = new DeckOfCards(1, this);
        }
        else
        {
            deck= new DeckOfCards(2, this);
        }
        deck.DealDeck();

        playPileTopCard = null;
    }
    public GameState (GameState orig)//copy constructor
    {
        this.numPlayers = orig.numPlayers;
        this.p1numCards = orig.p1numCards;
        this.p2numCards = orig.p2numCards;
        this.p3numCards = orig.p3numCards;
        this.p4numCards = orig.p4numCards;

        for(int i=0; i<p1Hand.size() ; i++)
        {
            this.p1Hand.add(new Card(orig.p1Hand.get(i)));
        }
        for(int i=0; i<p2Hand.size() ; i++)
        {
            this.p2Hand.add(new Card(orig.p2Hand.get(i)));
        }
        for(int i=0; i<p3Hand.size() ; i++)
        {
            this.p3Hand.add(new Card(orig.p3Hand.get(i)));
        }
        for(int i=0; i<p4Hand.size() ; i++)
        {
            this.p4Hand.add(new Card(orig.p4Hand.get(i)));
        }

        this.turn = orig.turn;

        this.deck = new DeckOfCards(1, orig);

        for(int i=0; i<p1TopCards.size() ; i++)
        {
            this.p1TopCards.add(new Card(orig.p1TopCards.get(i)));
        }
        for(int i=0; i<p2TopCards.size() ; i++)
        {
            this.p2TopCards.add(new Card(orig.p2TopCards.get(i)));
        }
        for(int i=0; i<p3TopCards.size() ; i++)
        {
            this.p3TopCards.add(new Card(orig.p3TopCards.get(i)));
        }
        for(int i=0; i<p4TopCards.size() ; i++)
        {
            this.p4TopCards.add(new Card(orig.p4TopCards.get(i)));
        }

        for(int i=0; i<p1BottomCards.size() ; i++)
        {
            this.p1BottomCards.add(new Card(orig.p1BottomCards.get(i)));
        }
        for(int i=0; i<p2BottomCards.size() ; i++)
        {
            this.p2BottomCards.add(new Card(orig.p2BottomCards.get(i)));
        }
        for(int i=0; i<p3BottomCards.size() ; i++)
        {
            this.p3BottomCards.add(new Card(orig.p3BottomCards.get(i)));
        }
        for(int i=0; i<p4BottomCards.size() ; i++)
        {
            this.p4BottomCards.add(new Card(orig.p4BottomCards.get(i)));
        }

        drawPileTopCard = new Card(orig.drawPileTopCard);
        playPileTopCard = new Card(orig.playPileTopCard);

        this.drawPileNumCards = orig.drawPileNumCards;
        this.playPileNumCards = orig.playPileNumCards;
    }

    public String toString() {
        String ret =  "Number of Players: " + numPlayers + "\n" +
                "Number of Cards in Draw Pile: " + drawPileNumCards + "\n" +
                "Next Card in the Draw Pile: " + drawPileTopCard + "\n" +
                "Number of Cards in Discard Pile: " + playPileNumCards + "\n" +
                "Current Card in Discard Pile: " + playPileTopCard + "\n" +

                "Player 1: \n"  +
                "Number of Cards: " + p1numCards + "\n" +
                "Cards in Hand: " + p1Hand.toString() + "\n" +
                "Bottom Cards: " + p1BottomCards.toString() + "\n" +
                "Top Cards: " + p1TopCards.toString() + "\n" +

                "Player 2: " + "\n" +
                "Number of Cards: " + p2numCards + "\n" +
                "Cards in Hand: " + p2Hand.toString() + "\n" +
                "Bottom Cards: " + p2BottomCards.toString() + "\n" +
                "Top Cards: " + p2TopCards.toString() + "\n";

        if (numPlayers == 3) {
            ret = ret + "Player 3: " + "\n" +
                    "Number of Cards: " + p3numCards + "\n" +
                    "Cards in Hand: " + p3Hand.toString() + "\n" +
                    "Bottom Cards: " + p3BottomCards.toString() + "\n" +
                    "Top Cards: " + p3TopCards.toString() + "\n";

        } else if (numPlayers == 4) {
            ret = ret + "Player 4: " + "\n" +
                    "Number of Cards: " + p4numCards + "\n" +
                    "Cards in Hand: " + p4Hand.toString() + "\n" +
                    "Bottom Cards: " + p4BottomCards.toString() + "\n" +
                    "Top Cards: " + p4TopCards.toString() + "\n";
        }
        return ret;
    }
}
