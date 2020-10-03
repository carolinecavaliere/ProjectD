package edu.up.projectd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity{

    Button runTest;
    EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        runTest = findViewById(R.id.RunTest);
        runTest.setOnClickListener(new ButtonListener());

        text = findViewById(R.id.EditText);

    }

    private class ButtonListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Log.d("button", "clicked");
            text.setText("");
            text.getText().clear();
        }
    }
}