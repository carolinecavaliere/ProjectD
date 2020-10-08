package edu.up.projectd;

public class PlayCardAction
{
    public boolean playCard(int playerId, Card cardToPlay, GameState state)
    {
        if(state.getTurn()!= playerId)
        {
            return false;
        }
    }
}
