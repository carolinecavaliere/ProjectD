package edu.up.projectd;

import android.media.Image;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Card {
    private int suit;
    private int rank;
    //private Image image;



    // getter for suit
    public int getSuit() { return suit; }

    // setter for suit
    public void setSuit(int suit) {
        List<Integer> validSuits = getValidSuits();

        if(validSuits.contains(suit)) {
            this.suit = suit;
        } else {
            throw new IllegalArgumentException("Valid Suits are: " + validSuits);
        }
    }
    // getter for card rank
    public int getRank() { return rank; }
    // setter for card rank
    public void setRank(int rank) {
        List<Integer> validRank = getValidRank();

        if(validRank.contains(rank)) {
            this.rank = rank;
        } else {
            throw new IllegalArgumentException("Valid Ranks are: " + validRank);
        }
    }

    /**
     * This method will return a list of valid suits for card object
     * static because it is generic for all card decks
     * @return
     */
    public static List<Integer> getValidSuits() {
        // 1 = diamond
        // 2 = heart
        // 3 = club
        // 4 = spade
        return Arrays.asList(1,2,3,4);
    }

    /**
     * This method will return a list of valid ranks for card object
     * static because it is generic for all card decks
     * @return
     */
    public static List<Integer> getValidRank() {
        // 11 = jack
        // 12 = queen
        // 13 = king
        // 14 = ace
        return Arrays.asList(2,3,4,5,6,7,8,9,10,11,12,13,14);
    }


    /**
     *
     * @param suit
     * @param rank
     */
    public Card(String name, int suit, int rank) { // card constructor
        setSuit(suit);
        setRank(rank);

        //this.name = name;
        //this.suit = suit;
        //this.rank = rank;
    }

    /**
     *
     * @param orig
     */
    public Card (Card orig) { // deep state constructor
        this.suit = orig.suit;
        this.rank = orig.rank;

    }
}
