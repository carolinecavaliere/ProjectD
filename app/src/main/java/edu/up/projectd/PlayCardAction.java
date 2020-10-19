
package edu.up.projectd;

import java.util.ArrayList;

public class PlayCardAction {
    public boolean playCard(int playerId, ArrayList<Card> cardsToPlay, GameState state) {
        if (state.getTurn() != playerId)//not a valid move if it is not that player's turn
        {
            return false;
        }
        else if (state.getCardSelected() == false)//not a valid move if a card isn't selected
        {
            return false;
        }
        else if (cardsToPlay.size() > 1) //not a valid move if multiple cards are selected but not the same rank
        {
            for (int i = 0; i < cardsToPlay.size() - 1; i++)
            {
                if (cardsToPlay.get(i).getRank() != cardsToPlay.get(i + 1).getRank())
                {
                    return false;
                }
            }
        }
        else {
            for (int i = 0; i < cardsToPlay.size(); i++) {
                if (cardsToPlay.get(i).getRank() < state.getPlayPileTopCard().getRank()) {
                    if (cardsToPlay.get(i).getRank() != 2 && cardsToPlay.get(i).getRank() != 10) {
                        return false;//not a valid move if the card is less than the one on the play pile and not of rank 2 or 10
                    }
                } else {
                    ArrayList<Card> temp;
                    ArrayList<Card> tempHand;
                    if (playerId == 1) {
                        tempHand = new ArrayList<Card>(state.getP1Hand());
                        temp = new ArrayList<Card>(state.getPlayPileCards());
                        temp.add(cardsToPlay.get(i));
                        tempHand.remove(cardsToPlay.get(i));
                        state.setP1Hand(temp);
                        state.setP1Hand(tempHand);
                        state.setPlayPileCards(temp);
                    } else if (playerId == 2) {
                        tempHand = new ArrayList<Card>(state.getP2Hand());
                        temp = new ArrayList<Card>(state.getPlayPileCards());
                        temp.add(cardsToPlay.get(i));
                        tempHand.remove(cardsToPlay.get(i));
                        state.setP2Hand(temp);
                        state.setP2Hand(tempHand);
                        state.setPlayPileCards(temp);
                    } else if (playerId == 3) {
                        tempHand = new ArrayList<Card>(state.getP3Hand());
                        temp = new ArrayList<Card>(state.getPlayPileCards());
                        temp.add(cardsToPlay.get(i));
                        tempHand.remove(cardsToPlay.get(i));
                        state.setP3Hand(temp);
                        state.setP3Hand(tempHand);
                        state.setPlayPileCards(temp);
                    } else if (playerId == 4) {
                        tempHand = new ArrayList<Card>(state.getP4Hand());
                        temp = new ArrayList<Card>(state.getPlayPileCards());
                        temp.add(cardsToPlay.get(i));
                        tempHand.remove(cardsToPlay.get(i));
                        state.setP4Hand(temp);
                        state.setP4Hand(tempHand);
                        state.setPlayPileCards(temp);
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
