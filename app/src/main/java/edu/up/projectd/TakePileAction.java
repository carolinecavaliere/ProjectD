package edu.up.projectd;

import java.util.ArrayList;

/**
 * @Author: Chloe Gan, Nathaniel Pon, Jimi Hayes, Caroline Cavaliere
 * This class models the instance in which the player chooses to or must take the play pile.
 */
public class TakePileAction {

    public boolean takePile(int playerID, GameState gameState) {
        if (gameState.getPlayPileNumCards() > 0 && playerID == gameState.getTurn()) {
            if (playerID == 1) {
                for (int i = 0; i < gameState.getPlayPileNumCards(); i++) {
                    gameState.addToP1Hand(gameState.getPlayPileCards().get(i));
                    gameState.setP1numCards(gameState.getP1numCards() + 1);
                }
                for (int i = 0; i < gameState.getPlayPileNumCards(); i++) {
                    gameState.removeFromPlayPile(0);
                    gameState.setPlayPileNumCards(gameState.getPlayPileNumCards() - 1);
                }
                gameState.clearPlayPileCards();
                return true;
            }
            else if (playerID == 2) {
                for (int i = 0; i < gameState.getPlayPileNumCards(); i++) {
                    gameState.addToP2Hand(gameState.getPlayPileCards().get(i));
                }
                while (gameState.getPlayPileCards().get(0)!=null){
                    gameState.removeFromPlayPile(0);
                }
                return true;
            }
            else if (playerID == 3) {
                for (int i = 0; i < gameState.getPlayPileNumCards(); i++) {
                    gameState.addToP3Hand(gameState.getPlayPileCards().get(i));
                }
                while (gameState.getPlayPileCards().get(0)!=null){
                    gameState.removeFromPlayPile(0);
                }
                return true;
            }
            else if (playerID == 4) {
                for (int i = 0; i < gameState.getPlayPileNumCards(); i++) {
                    gameState.addToP4Hand(gameState.getPlayPileCards().get(i));
                }
                while (gameState.getPlayPileCards().get(0)!=null){
                    gameState.removeFromPlayPile(0);
                }
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
