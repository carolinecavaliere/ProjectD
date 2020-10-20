package edu.up.projectd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

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
        firstInstance = new GameState(2);
        secondInstance = new GameState(firstInstance);

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
        Card randomCard = firstInstance.getP1Hand().get(0);
            // choose a random number between 0 and numHand
        int randNum = (int)(Math.random()*(firstInstance.getP1numCards()) + 0);
        selectCardAction = new SelectCardAction(); // initialize the class
        selectCardAction.selectCard(1, firstInstance, firstInstance.getP1Hand().get(randNum));
        text.setText(text.getText() + "Player 1 has selected a " + randomCard);

        //PlayCardAction
        playCardAction = new PlayCardAction();
        playCardAction.playCard(1, firstInstance);
        text.setText(text.getText() + "Player 1 has played a " + firstInstance.getPlayPileTopCard());
        
        //TakePileAction
        TakePileAction takePileAction = new TakePileAction();
        takePileAction.takePile(1, firstInstance);
        text.setText(text.getText() + "Player 1 has taken the play pile into their hand. \n");

        //thirdInstance and FourthInstance
        GameState thirdInstance = new GameState(2);
        GameState fourthInstance = new GameState(thirdInstance);

        //toString
        text.setText(text.getText() + "\nSecondInstance: \n" + secondInstance.toString());
        text.setText(text.getText() + "\nFourthInstance: \n" + fourthInstance.toString());
    }
}