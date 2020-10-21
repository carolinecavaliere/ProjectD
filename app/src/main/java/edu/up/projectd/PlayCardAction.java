
package edu.up.projectd;

import java.util.ArrayList;

public class PlayCardAction {
    public boolean playCard(int playerId, GameState state) {
        if (state.getTurn() != playerId) {//not a valid move if it is not that player's turn
            return false;
        }
        else if (state.getSelectedCards().isEmpty()) {//not a valid move if a card isn't selected
            return false;
        }
        else if (state.getSelectedCards().size() > 1) {//not a valid move if multiple cards are selected but not the same rank
            for (int i = 0; i < state.getSelectedCards().size() - 1; i++) {
                if (state.getSelectedCards().get(i).getRank() != state.getSelectedCards().get(i + 1).getRank()) {
                    return false;
                }
            }
        }
        else {
            for (int i = 0; i < state.getSelectedCards().size(); i++) {
                if (state.getSelectedCards().get(i).getRank() < state.getPlayPileTopCard().getRank()) {
                    if (state.getSelectedCards().get(i).getRank() != 2 && state.getSelectedCards().get(i).getRank() != 10) {
                        return false;//not a valid move if the card is less than the one on the play pile and not of rank 2 or 10
                    }
                }
                else {
                    if (playerId == 1) {
                        state.addToPlayPile(state.getSelectedCards().get(i));
                        state.removeFromP1Hand(state.getSelectedCards().get(i));
                        state.setPlayPileNumCards(state.getPlayPileNumCards()+1);
                        state.setP1numCards(state.getP1numCards()-1);
                    }
                    else if (playerId == 2) {
                        state.addToPlayPile(state.getSelectedCards().get(i));
                        state.removeFromP2Hand(state.getSelectedCards().get(i));
                        state.setPlayPileNumCards(state.getPlayPileNumCards()+1);
                        state.setP2numCards(state.getP2numCards()-1);
                    }
                    else if (playerId == 3) {
                        state.addToPlayPile(state.getSelectedCards().get(i));
                        state.removeFromP3Hand(state.getSelectedCards().get(i));
                        state.setPlayPileNumCards(state.getPlayPileNumCards()+1);
                        state.setP3numCards(state.getP3numCards()-1);
                    }
                    else if (playerId == 4) {
                        state.addToPlayPile(state.getSelectedCards().get(i));
                        state.removeFromP4Hand(state.getSelectedCards().get(i));
                        state.setPlayPileNumCards(state.getPlayPileNumCards()+1);
                        state.setP4numCards(state.getP4numCards()-1);
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
