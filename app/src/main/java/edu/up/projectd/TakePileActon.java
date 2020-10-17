package edu.up.projectd;

import java.util.ArrayList;

public class TakePileActon {

    public boolean takePile(int playerID, GameState gameState) {
        ArrayList<Card> card = new ArrayList<>(gameState.getPlayPileCards());
        if (gameState.getPlayPileNumCards() > 0 && playerID == gameState.getTurn()) {
            if (playerID == 1) {
                for (int i = 0; i < gameState.getPlayPileNumCards(); i++) {
                    card.add(gameState.getPlayPileCards().get(i));
                }
                gameState.setP1Hand(card);
                return true;
            }
            else if (playerID == 2) {
                for (int i = 0; i < gameState.getPlayPileNumCards(); i++) {
                    card.add(gameState.getPlayPileCards().get(i));
                }
                gameState.setP2Hand(card);
                return true;
            }
            else if (playerID == 3) {
                for (int i = 0; i < gameState.getPlayPileNumCards(); i++) {
                    card.add(gameState.getPlayPileCards().get(i));
                }
                gameState.setP3Hand(card);
                return true;
            }
            else if (playerID == 4) {
                for (int i = 0; i < gameState.getPlayPileNumCards(); i++) {
                    card.add(gameState.getPlayPileCards().get(i));
                }
                gameState.setP4Hand(card);
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
