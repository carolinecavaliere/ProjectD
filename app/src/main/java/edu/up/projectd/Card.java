package edu.up.projectd;

import android.media.Image;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Card {
    private String name;
    private int suit;
    private int rank;
    //private Image image;

    // getter for name
    public String getName() {
        return name;
    }
    // setter for name

    /**
     *
     * @param name 2,3,4,5,6,7,8,9,10, jack, queen, king, ace
     */
    public void setName(String name) {
        List<String> validFaceNames = getValidFaceNames();
        name = name.toLowerCase();

        if(validFaceNames.contains(name)) {
            this.name = name;
        }
    }

    // getter for suit
    public int getSuit() {
        return suit;
    }
    // setter for suit
    public void setSuit(int suit) {
        this.suit = suit;
    }
    // getter for card rank
    public int getRank() {
        return rank;
    }
    // setter for card rank
    public void setRank(int rank) {
        this.rank = rank;
    }

    /**
     * This method will return a list of face names that are valid for Card objects
     * static because it is generic for all card decks
     */
    public static List<String> getValidFaceNames() {
        return Arrays.asList("2","3","4","5","6","7","8","9","10","jack","queen","king","ace");
    }
    /*public static ArrayList<Integer> getValidSuits() {
        r
    }*/


    /**
     *
     * @param suit
     * @param rank
     */
    public Card(String name, int suit, int rank) { // card constructor
        setName(name);
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
