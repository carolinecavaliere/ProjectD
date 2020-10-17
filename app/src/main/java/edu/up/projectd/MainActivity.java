package edu.up.projectd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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

        firstInstance = new GameState(2);
        secondInstance = new GameState(firstInstance);
        // click the "RUN TEST" button
        Button runTest = findViewById(R.id.RunTest);
        runTest.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        text.getText().clear();
        //SwitchBaseCardsAction
        SwitchBaseCardsAction switchBaseCardsAction = new SwitchBaseCardsAction();
        switchBaseCardsAction.switchBaseCards(1, firstInstance,
                firstInstance.getP1Hand().get(1), firstInstance.getP1TopCards().get(0));
        text.setText(text.getText() + "Player 1 switch the second card in their hand with the" +
                " the first card on the field.");
        //PlayCardAction

        //SelectCardAction

        //TakePileAction
        //TakePileActon takePileActon = new TakePileActon();
        //takePileActon.takePile(1, firstInstance);
        //text.setText(text.getText() + "Player 1 has taken the play pile into their hand");
    }
}