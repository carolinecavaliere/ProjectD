package edu.up.projectd;

import java.util.ArrayList;

public class SelectCardAction {

    public boolean selectCard(int playerId, GameState state, int cardIndex) {
        Card selectedCard = null;

        if (playerId != state.getTurn()) {
            return false;
        } else if (playerId == 1){  // looks at player 1's hand
            for (int i = 0; i < state.getP1Hand().size(); i++) { // iterate thru their hand
                selectedCard = state.getP1Hand().get(cardIndex); // looks in hand, gets that card index
                state.setSelectedCards(selectedCard); // put into variable
            }
            return true;
        } else if (playerId == 2){  // looks at player 2's hand
            for (int i = 0; i < state.getP2Hand().size(); i++) {
                selectedCard = state.getP2Hand().get(cardIndex); // looks in hand, gets that card index
                state.setSelectedCards(selectedCard); // put into variable
            }
            return true;
        } else if (playerId == 3){  // looks at player 3's hand
            for (int i = 0; i < state.getP3Hand().size(); i++) {
                selectedCard = state.getP3Hand().get(cardIndex); // looks in hand, gets that card index
                state.setSelectedCards(selectedCard); // put into variable
            }
            return true;
        } else if (playerId == 4){  // looks at player 4's hand
            for (int i = 0; i < state.getP4Hand().size(); i++) {
                selectedCard = state.getP4Hand().get(cardIndex); // looks in hand, gets that card index
                state.setSelectedCards(selectedCard); // put into variable
            }
            return true;
        }
        return false;
    }

}
