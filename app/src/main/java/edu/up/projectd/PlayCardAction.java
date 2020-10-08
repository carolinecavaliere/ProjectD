package edu.up.projectd;

import java.util.ArrayList;

public class PlayCardAction
{
    public boolean playCard(int playerId, ArrayList<Card> cardsToPlay, GameState state)
    {
        if(state.getTurn()!= playerId)
        {
            return false;
        }

        else if(state.getCardSelected()==false)
        {
            return false;
        }

        else if(cardsToPlay.size()>1) {
            for (int i = 0; i < cardsToPlay.size() - 1; i++) {
                if (cardsToPlay.get(i).getRank() != cardsToPlay.get(i + 1).getRank()) {
                    return false;
                }
            }
            for(int i = 0; i < cardsToPlay.size(); i++)
            {
                //need to add cards to play pile
            }

        }
        for (int i = 0; i < cardsToPlay.size(); i++) {
            if (cardsToPlay.get(i).getRank() < state.getPlayPileTopCard().getRank()) {
                if (cardsToPlay.get(i).getRank() != 2 && cardsToPlay.get(i).getRank() != 10) {
                    return false;
                }
            }
        }




    }
}
