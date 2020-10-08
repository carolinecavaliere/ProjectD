package edu.up.projectd;

import java.util.ArrayList;

public class SelectCardAction {

    public boolean selectCard(int playerId, GameState state) {

        if (playerId != state.getTurn()) {
            return false;
        } else if (playerId == 1){  // looks at player 1's hand


            return true;
        } else if (playerId == 2){  // looks at player 2's hand
            for (int i = 0; i < state.getP2numCards(); i++) {

            }
            return true;
        } else if (playerId == 3){  // looks at player 3's hand
            for (int i = 0; i < state.getP3numCards(); i++) {

            }
            return true;
        } else if (playerId == 4){  // looks at player 4's hand
            for (int i = 0; i < state.getP4numCards(); i++) {


            }
            return true;
        }
        return false;
    }

}
