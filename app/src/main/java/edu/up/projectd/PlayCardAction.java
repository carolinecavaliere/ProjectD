package edu.up.projectd;

import java.util.ArrayList;

public class PlayCardAction {
    public boolean playCard(int playerId, ArrayList<Card> cardsToPlay, GameState state) {
        if (state.getTurn() != playerId) {
            return false;
        } else if (state.getCardSelected() == false) {
            return false;
        } else if (cardsToPlay.size() > 1) {
            for (int i = 0; i < cardsToPlay.size() - 1; i++) {
                if (cardsToPlay.get(i).getRank() != cardsToPlay.get(i + 1).getRank()) {
                    return false;
                }
            }
            for (int i = 0; i < cardsToPlay.size(); i++) {
                ArrayList<Card> temp = new ArrayList<Card>();
                ArrayList<Card> tempHand = new ArrayList<Card>();
                if (playerId == 1) {
                    tempHand = state.getP1Hand();
                    temp = state.getPlayPileCards();
                    temp.add(cardsToPlay.get(i));
                    tempHand.remove(cardsToPlay.get(i));
                    state.setP1Hand(tempHand);
                    state.setPlayPileCards(temp);
                } else if (playerId == 2) {
                    tempHand = state.getP2Hand();
                    temp = state.getPlayPileCards();
                    temp.add(cardsToPlay.get(i));
                    tempHand.remove(cardsToPlay.get(i));
                    state.setP2Hand(tempHand);
                    state.setPlayPileCards(temp);
                } else if (playerId == 3) {
                    tempHand = state.getP3Hand();
                    temp = state.getPlayPileCards();
                    temp.add(cardsToPlay.get(i));
                    tempHand.remove(cardsToPlay.get(i));
                    state.setP3Hand(tempHand);
                    state.setPlayPileCards(temp);
                } else if (playerId == 4) {
                    tempHand = state.getP4Hand();
                    temp = state.getPlayPileCards();
                    temp.add(cardsToPlay.get(i));
                    tempHand.remove(cardsToPlay.get(i));
                    state.setP4Hand(tempHand);
                    state.setPlayPileCards(temp);
                }
                return true;
            }
            for (int i = 0; i < cardsToPlay.size(); i++) {
                if (cardsToPlay.get(i).getRank() < state.getPlayPileTopCard().getRank()) {
                    if (cardsToPlay.get(i).getRank() != 2 && cardsToPlay.get(i).getRank() != 10) {
                        return false;
                    } else {
                        ArrayList<Card> temp = new ArrayList<Card>();
                        ArrayList<Card> tempHand = new ArrayList<Card>();
                        if (playerId == 1) {
                            tempHand = state.getP1Hand();
                            temp = state.getPlayPileCards();
                            temp.add(cardsToPlay.get(i));
                            tempHand.remove(cardsToPlay.get(i));
                            state.setP1Hand(tempHand);
                            state.setPlayPileCards(temp);
                        } else if (playerId == 2) {
                            tempHand = state.getP2Hand();
                            temp = state.getPlayPileCards();
                            temp.add(cardsToPlay.get(i));
                            tempHand.remove(cardsToPlay.get(i));
                            state.setP2Hand(tempHand);
                            state.setPlayPileCards(temp);
                        } else if (playerId == 3) {
                            tempHand = state.getP3Hand();
                            temp = state.getPlayPileCards();
                            temp.add(cardsToPlay.get(i));
                            tempHand.remove(cardsToPlay.get(i));
                            state.setP3Hand(tempHand);
                            state.setPlayPileCards(temp);
                        } else if (playerId == 4) {
                            tempHand = state.getP4Hand();
                            temp = state.getPlayPileCards();
                            temp.add(cardsToPlay.get(i));
                            tempHand.remove(cardsToPlay.get(i));
                            state.setP4Hand(tempHand);
                            state.setPlayPileCards(temp);
                        }
                        return true;
                    }
                } else {
                    ArrayList<Card> temp = new ArrayList<Card>();
                    ArrayList<Card> tempHand = new ArrayList<Card>();
                    if (playerId == 1) {
                        tempHand = state.getP1Hand();
                        temp = state.getPlayPileCards();
                        temp.add(cardsToPlay.get(i));
                        tempHand.remove(cardsToPlay.get(i));
                        state.setP1Hand(tempHand);
                        state.setPlayPileCards(temp);
                    } else if (playerId == 2) {
                        tempHand = state.getP2Hand();
                        temp = state.getPlayPileCards();
                        temp.add(cardsToPlay.get(i));
                        tempHand.remove(cardsToPlay.get(i));
                        state.setP2Hand(tempHand);
                        state.setPlayPileCards(temp);
                    } else if (playerId == 3) {
                        tempHand = state.getP3Hand();
                        temp = state.getPlayPileCards();
                        temp.add(cardsToPlay.get(i));
                        tempHand.remove(cardsToPlay.get(i));
                        state.setP3Hand(tempHand);
                        state.setPlayPileCards(temp);
                    } else if (playerId == 4) {
                        tempHand = state.getP4Hand();
                        temp = state.getPlayPileCards();
                        temp.add(cardsToPlay.get(i));
                        tempHand.remove(cardsToPlay.get(i));
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
