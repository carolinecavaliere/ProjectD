package edu.up.projectd;

import java.util.ArrayList;

/**
 * @Author: Chloe Gan, Nathaniel Pon, Jimi Hayes, Caroline Cavaliere
 * This class models how a player selects a card/cards. (Will be modified once combined with
 * the GUI so that the selected cards are determined by the player's touch actions).
 */
public class SelectCardAction {

    public boolean selectCard(int playerId, GameState state, Card card) {
        if (card.getRank() >= state.getPlayPileTopCard().getRank()) {
            if (playerId != state.getTurn()) {
                return false;
            } else if (playerId == 1 && state.getP1Hand().contains(card)) {  // looks at player 1's hand
                state.addToSelectedCards(card); // put arraylist into GameState variable
                return true;
            } else if (playerId == 2 && state.getP2Hand().contains(card)) {  // looks at player 2's hand
                state.addToSelectedCards(card); // put into GameState variable
                return true;
            } else if (playerId == 3 && state.getP3Hand().contains(card)) {  // looks at player 3's hand
                state.addToSelectedCards(card); // put into GameState variable
                return true;
            } else if (playerId == 4 && state.getP4Hand().contains(card)) {  // looks at player 4's hand
                state.addToSelectedCards(card); // put into GameState variable
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }

}
