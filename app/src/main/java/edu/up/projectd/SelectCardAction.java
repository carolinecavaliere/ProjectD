package edu.up.projectd;

import java.util.ArrayList;

/**
 * @Author: Chloe Gan
 */
public class SelectCardAction {

    public boolean selectCard(int playerId, GameState state, Card card) {
        ArrayList<Card> selectedCard = null; // initialize arraylist to append

        if (playerId != state.getTurn()) {
            return false;
        } else if (playerId == 1 && state.getP1Hand().contains(card)){  // looks at player 1's hand
            selectedCard.add(card); // add the card object to the arraylist
            state.addToSelectedCards((Card) selectedCard); // put arraylist into GameState variable
            return true;
        } else if (playerId == 2 && state.getP2Hand().contains(card)){  // looks at player 2's hand
            selectedCard.add(card);
            state.addToSelectedCards((Card) selectedCard); // put into GameState variable
            return true;
        } else if (playerId == 3 && state.getP3Hand().contains(card)){  // looks at player 3's hand
            selectedCard.add(card);
            state.addToSelectedCards((Card) selectedCard); // put into GameState variable
            return true;
        } else if (playerId == 4 && state.getP4Hand().contains(card)){  // looks at player 4's hand
            selectedCard.add(card);
            state.addToSelectedCards((Card) selectedCard); // put into GameState variable
            return true;
        }
        return false;
    }

}
