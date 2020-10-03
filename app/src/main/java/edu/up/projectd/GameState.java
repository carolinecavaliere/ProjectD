package edu.up.projectd;

import java.util.ArrayList;

public class GameState {

    int numPlayers;

    int p1numCards;
    int p2numCards;
    int p3numCards;
    int p4numCards;

    ArrayList<Card> p1TopCards = new ArrayList<Card>();
    ArrayList<Card> p1BottomCards = new ArrayList<Card>();

    ArrayList<Card> p2TopCards = new ArrayList<Card>();
    ArrayList<Card> p2BottomCards = new ArrayList<Card>();

    ArrayList<Card> p3TopCards = new ArrayList<Card>();
    ArrayList<Card> p3BottomCards = new ArrayList<Card>();

    ArrayList<Card> p4TopCards = new ArrayList<Card>();
    ArrayList<Card> p4BottomCards = new ArrayList<Card>();

    Card drawPileTopCard;
    Card playPileTopCard;

    int drawPileNumCards;
    int playPileNumCards;
}
