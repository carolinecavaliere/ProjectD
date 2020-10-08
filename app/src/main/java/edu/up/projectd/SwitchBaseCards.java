package edu.up.projectd;

import java.util.ArrayList;

public class SwitchBaseCards {

    public boolean switchBaseCards(int playerID, GameState gameState, Card hand, Card bot) {

        int index;
        ArrayList<Card> handCards;
        ArrayList<Card> botCards;

        if (playerID == gameState.getTurn()) {
            if (playerID == 1) {
                handCards = gameState.getP1Hand();
                botCards = gameState.getP1BottomCards();
                index = botCards.indexOf(bot);
                botCards.set(index, hand);
                index = handCards.indexOf(hand);
                handCards.set(index, bot);
                gameState.setP1Hand(handCards);
                gameState.setP1BottomCards(botCards);
                return true;
            }
            else if (playerID == 2) {
                handCards = gameState.getP2Hand();
                botCards = gameState.getP2BottomCards();
                index = botCards.indexOf(bot);
                botCards.set(index, hand);
                index = handCards.indexOf(hand);
                handCards.set(index, bot);
                gameState.setP1Hand(handCards);
                gameState.setP1BottomCards(botCards);
                return true;
            }
            else if (playerID == 3) {
                handCards = gameState.getP3Hand();
                botCards = gameState.getP3BottomCards();
                index = botCards.indexOf(bot);
                botCards.set(index, hand);
                index = handCards.indexOf(hand);
                handCards.set(index, bot);
                gameState.setP1Hand(handCards);
                gameState.setP1BottomCards(botCards);
                return true;
            }
            else if (playerID == 4) {
                handCards = gameState.getP4Hand();
                botCards = gameState.getP4BottomCards();
                index = botCards.indexOf(bot);
                botCards.set(index, hand);
                index = handCards.indexOf(hand);
                handCards.set(index, bot);
                gameState.setP1Hand(handCards);
                gameState.setP1BottomCards(botCards);
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
