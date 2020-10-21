package edu.up.projectd;

import java.util.ArrayList;

/**
 * @Author: Chloe Gan, Nathaniel Pon, Jimi Hayes, Caroline Cavaliere
 * This class models the player's option to switch any of their three top cards
 * with any of their three hand cards at the beginning of the game.
 */
public class SwitchBaseCardsAction {

    public boolean switchBaseCards(int playerID, GameState gameState, Card hand, Card bot) {
        int index;
        ArrayList<Card> handCards;
        ArrayList<Card> topCards;

        if (playerID == gameState.getTurn()) {
            if (playerID == 1) {
                handCards = new ArrayList<Card>(gameState.getP1Hand());
                topCards = new ArrayList<Card>(gameState.getP1TopCards());
                index = topCards.indexOf(bot);
                topCards.set(index, hand);
                index = handCards.indexOf(hand);
                handCards.set(index, bot);
                gameState.setP1Hand(handCards);
                gameState.setP1TopCards(topCards);
                return true;
            }
            else if (playerID == 2) {
                handCards = gameState.getP2Hand();
                topCards = gameState.getP2TopCards();
                index = topCards.indexOf(bot);
                topCards.set(index, hand);
                index = handCards.indexOf(hand);
                handCards.set(index, bot);
                gameState.setP1Hand(handCards);
                gameState.setP1TopCards(topCards);
                return true;
            }
            else if (playerID == 3) {
                handCards = gameState.getP3Hand();
                topCards = gameState.getP3TopCards();
                index = topCards.indexOf(bot);
                topCards.set(index, hand);
                index = handCards.indexOf(hand);
                handCards.set(index, bot);
                gameState.setP1Hand(handCards);
                gameState.setP1TopCards(topCards);
                return true;
            }
            else if (playerID == 4) {
                handCards = gameState.getP4Hand();
                topCards = gameState.getP4TopCards();
                index = topCards.indexOf(bot);
                topCards.set(index, hand);
                index = handCards.indexOf(hand);
                handCards.set(index, bot);
                gameState.setP1Hand(handCards);
                gameState.setP1TopCards(topCards);
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
