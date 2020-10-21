
package edu.up.projectd;

import java.util.ArrayList;

public class PlayCardAction {
    public boolean playCard(int playerId, GameState state) {
        if (state.getTurn() != playerId) {//not a valid move if it is not that player's turn
            return false;
        } else if (state.getSelectedCards().isEmpty()) {//not a valid move if a card isn't selected
            return false;
        } else if (state.getSelectedCards().size() > 1) {//not a valid move if multiple cards are selected but not the same rank
            for (int i = 0; i < state.getSelectedCards().size() - 1; i++) {
                if (state.getSelectedCards().get(i).getRank() != state.getSelectedCards().get(i + 1).getRank()) {
                    return false;
                }
            }
        } else {
            for (int i = 0; i < state.getSelectedCards().size(); i++) {
                if (playerId == 1) {
                    state.addToPlayPile(state.getSelectedCards().get(i));
                    state.setPlayPileTopCard(state.getSelectedCards().get(i));
                    state.removeFromP1Hand(state.getSelectedCards().get(i));
                    state.setPlayPileNumCards(state.getPlayPileNumCards() + 1);
                    state.setP1numCards(state.getP1numCards() - 1);
                    if (state.getP1Hand().size() < 3) {
                        for (int j = state.getP1numCards(); j < 3; j++) {
                            state.getDeck().drawCard(1);
                        }
                        state.setP1numCards(3);
                    }
                    state.clearSelectedCards();
                } else if (playerId == 2) {
                    state.addToPlayPile(state.getSelectedCards().get(i));
                    state.setPlayPileTopCard(state.getSelectedCards().get(i));
                    state.removeFromP2Hand(state.getSelectedCards().get(i));
                    state.setPlayPileNumCards(state.getPlayPileNumCards() + 1);
                    state.setP2numCards(state.getP2numCards() - 1);
                    if (state.getP2Hand().size() < 3) {
                        for (int j = state.getP2numCards(); j < 3; j++) {
                            state.addToP2Hand(state.getDeck().getNextCard());
                        }
                        state.setP2numCards(3);
                    }
                    state.clearSelectedCards();
                } else if (playerId == 3) {
                    state.addToPlayPile(state.getSelectedCards().get(i));
                    state.setPlayPileTopCard(state.getSelectedCards().get(i));
                    state.removeFromP3Hand(state.getSelectedCards().get(i));
                    state.setPlayPileNumCards(state.getPlayPileNumCards() + 1);
                    state.setP3numCards(state.getP3numCards() - 1);
                    if (state.getP3Hand().size() < 3) {
                        for (int j = state.getP3numCards(); j < 3; j++) {
                            state.addToP3Hand(state.getDeck().getNextCard());
                        }
                        state.setP3numCards(3);
                    }
                    state.clearSelectedCards();
                } else if (playerId == 4) {
                    state.addToPlayPile(state.getSelectedCards().get(i));
                    state.setPlayPileTopCard(state.getSelectedCards().get(i));
                    state.removeFromP4Hand(state.getSelectedCards().get(i));
                    state.setPlayPileNumCards(state.getPlayPileNumCards() + 1);
                    state.setP4numCards(state.getP4numCards() - 1);
                    if (state.getP4Hand().size() < 3) {
                        for (int j = state.getP4numCards(); j < 3; j++) {
                            state.addToP4Hand(state.getDeck().getNextCard());
                        }
                        state.setP4numCards(3);
                    }
                    state.clearSelectedCards();
                }
                return true;
            }
        }

        return false;
    }
}
