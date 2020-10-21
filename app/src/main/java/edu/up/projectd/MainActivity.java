package edu.up.projectd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

/**
 * @Author: Chloe Gan, Nathaniel Pon, Jimi Hayes, Caroline Cavaliere
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public EditText text;
    private SelectCardAction selectCardAction;
    private PlayCardAction playCardAction;
    private GameState firstInstance;
    private GameState secondInstance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.EditText);

        // click the "RUN TEST" button
        Button runTest = findViewById(R.id.RunTest);
        runTest.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        GameState firstInstance = new GameState(2);
        GameState secondInstance = new GameState(firstInstance);

        text.getText().clear();

        //first toString
        text.setText("Original game state: \n" + firstInstance.toString());

        //SwitchBaseCardsAction
        text.setText(text.getText() + "Player 1 switched the first card in their hand with the" +
                " the first card on the field. \n");
        SwitchBaseCardsAction switchBaseCardsAction = new SwitchBaseCardsAction();
        switchBaseCardsAction.switchBaseCards(1, firstInstance,
               firstInstance.getP1Hand().get(0), firstInstance.getP1TopCards().get(0));

        //SelectedCardAction
        //choose a random number between 0 and number of cards in P1 hand
        //Note: May have to run a few times for the requirement of this method to be met
        Card selectedCard = firstInstance.getP1Hand().get(0); // get card from p1Hand
        selectCardAction = new SelectCardAction(); // initialize the global variable
        selectCardAction.selectCard(1, firstInstance, selectedCard);
        text.setText(text.getText() + "Player 1 has selected a " + firstInstance.getSelectedCards() + "\n");

        //PlayCardAction
        playCardAction = new PlayCardAction();
        playCardAction.playCard(1, firstInstance);
        text.setText(text.getText() + "Player 1 has played a " + firstInstance.getPlayPileTopCard() + "\n");

        //TakePileAction
        TakePileAction takePileAction = new TakePileAction();
        takePileAction.takePile(1, firstInstance);
        text.setText(text.getText() + "Player 1 has taken the play pile into their hand. \n");

        //thirdInstance and FourthInstance
        GameState thirdInstance = new GameState(2);
        GameState fourthInstance = new GameState(thirdInstance);

        //toString
        text.setText(text.getText()+"\nFirstInstance: \n" + firstInstance.toString());
        text.setText(text.getText() + "\nSecondInstance: \n" + secondInstance.toString());
        text.setText(text.getText() + "\nFourthInstance: \n" + fourthInstance.toString());
    }
}