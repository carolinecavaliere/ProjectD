package edu.up.projectd;

import android.util.Log;

import java.util.ArrayList;

public class GameState {

    private int numPlayers;

    private int p1numCards;
    private int p2numCards;
    private int p3numCards;
    private int p4numCards;

    private ArrayList<Card> p1Hand;
    private ArrayList<Card> p2Hand;
    private ArrayList<Card> p3Hand;
    private ArrayList<Card> p4Hand;

    private int turn;

    private DeckOfCards deck;

    private ArrayList<Card> p1TopCards;
    private ArrayList<Card> p1BottomCards;

    private ArrayList<Card> p2TopCards;
    private ArrayList<Card> p2BottomCards;

    private ArrayList<Card> p3TopCards;
    private ArrayList<Card> p3BottomCards;

    private ArrayList<Card> p4TopCards;
    private ArrayList<Card> p4BottomCards;

    private ArrayList<Card> playPileCards;

    private ArrayList<Card> selectedCards; // array of selected cards
    private Boolean cardSelected; // checks to see if a card is selected or not

    private Card drawPileTopCard;
    private Card playPileTopCard;

    private int drawPileNumCards;

    public ArrayList<Card> getSelectedCards() {
        return selectedCards;
    }

    public void setSelectedCards(ArrayList<Card> selectedCards) {
        this.selectedCards = new ArrayList<Card>(selectedCards);
    }

    public Boolean getCardSelected() {
        return cardSelected;
    }

    public void setCardSelected(Boolean cardSelected) {
        this.cardSelected = cardSelected;
    }

    public int getNumPlayers() {
        return numPlayers;
    }

    public void setNumPlayers(int numPlayers) {
        this.numPlayers = numPlayers;
    }

    public int getP1numCards() {
        return p1numCards;
    }

    public void setP1numCards(int p1numCards) {
        this.p1numCards = p1numCards;
    }

    public int getP2numCards() {
        return p2numCards;
    }

    public void setP2numCards(int p2numCards) {
        this.p2numCards = p2numCards;
    }

    public int getP3numCards() {
        return p3numCards;
    }

    public void setP3numCards(int p3numCards) {
        this.p3numCards = p3numCards;
    }

    public int getP4numCards() {
        return p4numCards;
    }

    public void setP4numCards(int p4numCards) {
        this.p4numCards = p4numCards;
    }

    public ArrayList<Card> getP1Hand() {
        return p1Hand;
    }

    public void setP1Hand(ArrayList<Card> p1Hand) {
        this.p1Hand = new ArrayList<Card>(p1Hand);
    }

    public ArrayList<Card> getP2Hand() {
        return p2Hand;
    }

    public void setP2Hand(ArrayList<Card> p2Hand) {
        this.p2Hand = new ArrayList<Card>(p2Hand);
    }

    public ArrayList<Card> getP3Hand() {
        return p3Hand;
    }

    public void setP3Hand(ArrayList<Card> p3Hand) {
        this.p3Hand = new ArrayList<Card>(p3Hand);
    }

    public ArrayList<Card> getP4Hand() {
        return p4Hand;
    }

    public void setP4Hand(ArrayList<Card> p4Hand) {
        this.p4Hand = new ArrayList<Card>(p4Hand);
    }

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }

    public DeckOfCards getDeck() {
        return deck;
    }

    public ArrayList<Card> getPlayPileCards() {
        return playPileCards;
    }

    public void setPlayPileCards(ArrayList<Card> playPileCards) {
        this.playPileCards = new ArrayList<Card>(playPileCards);
    }

    public void setDeck(DeckOfCards deck) {
        this.deck = deck;
    }

    public ArrayList<Card> getP1TopCards() {
        return p1TopCards;
    }

    public void setP1TopCards(ArrayList<Card> p1TopCards) {
        this.p1TopCards = new ArrayList<Card>(p1TopCards);
    }

    public ArrayList<Card> getP1BottomCards() {
        return p1BottomCards;
    }

    public void setP1BottomCards(ArrayList<Card> p1BottomCards) {
        this.p1BottomCards = new ArrayList<Card>(p1BottomCards);
    }

    public ArrayList<Card> getP2TopCards() {
        return p2TopCards;
    }

    public void setP2TopCards(ArrayList<Card> p2TopCards) {
        this.p2TopCards = new ArrayList<Card>(p2TopCards);
    }

    public ArrayList<Card> getP2BottomCards() {
        return p2BottomCards;
    }

    public void setP2BottomCards(ArrayList<Card> p2BottomCards) {
        this.p2BottomCards = new ArrayList<Card>(p2BottomCards);
    }

    public ArrayList<Card> getP3TopCards() {
        return p3TopCards;
    }

    public void setP3TopCards(ArrayList<Card> p3TopCards) {
        this.p3TopCards = new ArrayList<Card>(p3TopCards);
    }

    public ArrayList<Card> getP3BottomCards() {
        return p3BottomCards;
    }

    public void setP3BottomCards(ArrayList<Card> p3BottomCards) {
        this.p3BottomCards = new ArrayList<Card>(p3BottomCards);
    }

    public ArrayList<Card> getP4TopCards() {
        return p4TopCards;
    }

    public void setP4TopCards(ArrayList<Card> p4TopCards) {
        this.p4TopCards = new ArrayList<Card>(p4TopCards);
    }

    public ArrayList<Card> getP4BottomCards() {
        return p4BottomCards;
    }

    public void setP4BottomCards(ArrayList<Card> p4BottomCards) {
        this.p4BottomCards = new ArrayList<Card>(p4BottomCards);
    }

    public Card getDrawPileTopCard() {
        return drawPileTopCard;
    }

    public void setDrawPileTopCard(Card drawPileTopCard) {
        this.drawPileTopCard = drawPileTopCard;
    }

    public Card getPlayPileTopCard() {
        return playPileTopCard;
    }

    public void setPlayPileTopCard(Card playPileTopCard) {
        this.playPileTopCard = playPileTopCard;
    }

    public int getDrawPileNumCards() {
        return drawPileNumCards;
    }

    public void setDrawPileNumCards(int drawPileNumCards) {
        this.drawPileNumCards = drawPileNumCards;
    }

    public int getPlayPileNumCards() {
        return playPileNumCards;
    }

    public void setPlayPileNumCards(int playPileNumCards) {
        this.playPileNumCards = playPileNumCards;
    }

    public void addToPlayPile(Card add){
        playPileCards.add(add);
    }

    public void addToP1Hand(Card add){
        p1Hand.add(add);
    }

    public void addToP2Hand(Card add){
        p2Hand.add(add);
    }

    public void addToP3Hand(Card add){
        p3Hand.add(add);
    }

    public void addToP4Hand(Card add){
        p4Hand.add(add);
    }

    public void addToP1TopCards(Card add){
        p1TopCards.add(add);
    }

    public void addToP2TopCards(Card add){
        p2TopCards.add(add);
    }

    public void addToP3TopCards(Card add){
        p3TopCards.add(add);
    }

    public void addToP4TopCards(Card add){
        p4TopCards.add(add);
    }

    public void addToP1Bottom(Card add){
        p1BottomCards.add(add);
    }

    public void addToP2Bottom(Card add){
        p2BottomCards.add(add);
    }

    public void addToP3Bottom(Card add){
        p3BottomCards.add(add);
    }

    public void addToP4Bottom(Card add){
        p4BottomCards.add(add);
    }

    public void addToSelectedCards(Card add){
        selectedCards.add(add);
    }

    public void removeFromPlayPile(Card remove){
        playPileCards.remove(remove);
    }

    public void removeFromPlayPile(int remove){
        playPileCards.remove(remove);
    }

    public void removeFromP1Hand(Card remove){
        p1Hand.remove(remove);
    }

    public void removeFromP2Hand(Card remove){
        p2Hand.remove(remove);
    }

    public void removeFromP3Hand(Card remove){
        p3Hand.remove(remove);
    }

    public void removeFromP4Hand(Card remove){
        p4Hand.remove(remove);
    }

    public void removeFromP1TopCards(Card remove){
        p1TopCards.remove(remove);
    }

    public void removeFromP2TopCards(Card remove){
        p2TopCards.remove(remove);
    }

    public void removeFromP3TopCards(Card remove){
        p3TopCards.remove(remove);
    }

    public void removeFromP4TopCards(Card remove){
        p4TopCards.remove(remove);
    }

    public void removeFromP1Bottom(Card remove){
        p1BottomCards.remove(remove);
    }

    public void removeFromP2Bottom(Card remove){
        p2BottomCards.remove(remove);
    }

    public void removeFromP3Bottom(Card remove){
        p3BottomCards.remove(remove);
    }

    public void removeFromP4Bottom(Card remove){
        p4BottomCards.remove(remove);
    }

    public void removeFromSelectedCards(Card remove){
        selectedCards.remove(remove);
    }

    private int playPileNumCards;

    public GameState(int numPlayers)
    {
        this.numPlayers = numPlayers;
        int turn = 1;
        playPileCards = new ArrayList<Card>();

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

        if(this.numPlayers<=2)
        {
            deck = new DeckOfCards(1, this);
        }
        else
        {
            deck= new DeckOfCards(2, this);
        }

        //temp fix for dealDeck()
        p1Hand.add(deck.getNextCard());
        p1Hand.add(deck.getNextCard());
        p1Hand.add(deck.getNextCard());
        p1TopCards.add(deck.getNextCard());
        p1TopCards.add(deck.getNextCard());
        p1TopCards.add(deck.getNextCard());
        p1BottomCards.add(deck.getNextCard());
        p1BottomCards.add(deck.getNextCard());
        p1BottomCards.add(deck.getNextCard());

        p2Hand.add(deck.getNextCard());
        p2Hand.add(deck.getNextCard());
        p2Hand.add(deck.getNextCard());
        p2TopCards.add(deck.getNextCard());
        p2TopCards.add(deck.getNextCard());
        p2TopCards.add(deck.getNextCard());
        p2BottomCards.add(deck.getNextCard());
        p2BottomCards.add(deck.getNextCard());
        p2BottomCards.add(deck.getNextCard());

        playPileTopCard = deck.getNextCard();
        drawPileTopCard = deck.getNextCard();

        playPileCards.add(playPileTopCard);

        p1numCards = p1Hand.size();
        p2numCards = p2Hand.size();
        p3numCards = p3Hand.size();
        p4numCards = p4Hand.size();
        playPileNumCards = playPileCards.size();
    }
    public GameState (GameState orig)//copy constructor
    {
        this.numPlayers = orig.getNumPlayers();
        this.p1numCards = orig.getP1numCards();
        this.p2numCards = orig.getP2numCards();
        this.p3numCards = orig.getP3numCards();
        this.p4numCards = orig.getP4numCards();

        this.p1Hand = new ArrayList<>(orig.getP1Hand().size());
        this.p2Hand = new ArrayList<>(orig.getP2Hand().size());
        this.p3Hand = new ArrayList<>(orig.getP3Hand().size());
        this.p4Hand = new ArrayList<>(orig.getP4Hand().size());

        this.p1TopCards = new ArrayList<>(orig.getP1TopCards().size());
        this.p2TopCards = new ArrayList<>(orig.getP2TopCards().size());
        this.p3TopCards = new ArrayList<>(orig.getP3TopCards().size());
        this.p4TopCards = new ArrayList<>(orig.getP4TopCards().size());

        this.p1BottomCards = new ArrayList<>(orig.getP1BottomCards().size());
        this.p2BottomCards = new ArrayList<>(orig.getP2BottomCards().size());
        this.p3BottomCards = new ArrayList<>(orig.getP3BottomCards().size());
        this.p4BottomCards = new ArrayList<>(orig.getP4BottomCards().size());


        for(int i=0; i<p1Hand.size() ; i++)
        {
            this.p1Hand.add(new Card(orig.getP1Hand().get(i)));
        }
        for(int i=0; i<p2Hand.size() ; i++)
        {
            this.p2Hand.add(new Card(orig.getP2Hand().get(i)));
        }
        for(int i=0; i<p3Hand.size() ; i++)
        {
            this.p3Hand.add(new Card(orig.getP3Hand().get(i)));
        }
        for(int i=0; i<p4Hand.size() ; i++)
        {
            this.p4Hand.add(new Card(orig.getP4Hand().get(i)));
        }

        this.turn = orig.getTurn();

        this.deck = new DeckOfCards(1, orig);

        for(int i=0; i<p1TopCards.size() ; i++)
        {
            this.p1TopCards.add(new Card(orig.getP1TopCards().get(i)));
        }
        for(int i=0; i<p2TopCards.size() ; i++)
        {
            this.p2TopCards.add(new Card(orig.getP2TopCards().get(i)));
        }
        for(int i=0; i<p3TopCards.size() ; i++)
        {
            this.p3TopCards.add(new Card(orig.getP3TopCards().get(i)));
        }
        for(int i=0; i<p4TopCards.size() ; i++)
        {
            this.p4TopCards.add(new Card(orig.getP4TopCards().get(i)));
        }

        for(int i=0; i<p1BottomCards.size() ; i++)
        {
            this.p1BottomCards.add(new Card(orig.getP1BottomCards().get(i)));
        }
        for(int i=0; i<p2BottomCards.size() ; i++)
        {
            this.p2BottomCards.add(new Card(orig.getP2BottomCards().get(i)));
        }
        for(int i=0; i<p3BottomCards.size() ; i++)
        {
            this.p3BottomCards.add(new Card(orig.getP3BottomCards().get(i)));
        }
        for(int i=0; i<p4BottomCards.size() ; i++)
        {
            this.p4BottomCards.add(new Card(orig.getP4BottomCards().get(i)));
        }

        drawPileTopCard = new Card(orig.getDrawPileTopCard());
        playPileTopCard = new Card(orig.getPlayPileTopCard());
        playPileCards = orig.getPlayPileCards();

        this.drawPileNumCards = orig.getDrawPileNumCards();
        this.playPileNumCards = orig.getPlayPileNumCards();

        Log.d("GameState","Gamestate successfully created.");
    }

    public String toString() {
        String ret =  "Number of Players: " + numPlayers + "\n" +
                "Number of Cards in Draw Pile: " + drawPileNumCards + "\n" +
                "Next Card in the Draw Pile: " + drawPileTopCard + "\n" +
                "Number of Cards in Discard Pile: " + playPileNumCards + "\n" +
                "Current Card in Discard Pile: " + playPileTopCard + "\n" +

                "Player 1: \n"  +
                "Number of Cards in Hand: " + p1numCards + "\n" +
                "Cards in Hand: " + p1Hand.toString() + "\n" +
                "Bottom Cards: " + p1BottomCards.toString() + "\n" +
                "Top Cards: " + p1TopCards.toString() + "\n" +

                "Player 2: " + "\n" +
                "Number of Cards in Hand: " + p2numCards + "\n" +
                "Cards in Hand: " + p2Hand.toString() + "\n" +
                "Bottom Cards: " + p2BottomCards.toString() + "\n" +
                "Top Cards: " + p2TopCards.toString() + "\n";

        if (numPlayers == 3) {
            ret = ret + "Player 3: " + "\n" +
                    "Number of Cards in Hand: " + p3numCards + "\n" +
                    "Cards in Hand: " + p3Hand.toString() + "\n" +
                    "Bottom Cards: " + p3BottomCards.toString() + "\n" +
                    "Top Cards: " + p3TopCards.toString() + "\n";

        } else if (numPlayers == 4) {
            ret = ret + "Player 4: " + "\n" +
                    "Number of Cards in Hand: " + p4numCards + "\n" +
                    "Cards in Hand: " + p4Hand.toString() + "\n" +
                    "Bottom Cards: " + p4BottomCards.toString() + "\n" +
                    "Top Cards: " + p4TopCards.toString() + "\n";
        }
        return ret;
    }
}
