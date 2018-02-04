package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method increments the score by 1 when the Free Throw button is clicked.
     */
    public void freeThrow(View view) {
        score = score + 1;
        displayForTeamA(score);
    }

    /**
     * This method decrements the score by 2 when the + 2 Points is clicked.
     */
    public void twoPoints(View view) {
        score = score + 2;
        displayForTeamA(score);
    }

    /**
     * This method decrements the score by 3 when the + 3 Points is clicked.
     */
    public void threePoints(View view) {
        score = score + 3;
        displayForTeamA(score);
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.team_a_score);
        priceTextView.setText(message);
    }
}
