package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity implements OnClickListener {


    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //implement the onClick method here
    public void onClick(View v) {

        ImageView teama3 = findViewById(R.id.teama3); // Team A 3 points
        teama3.setOnClickListener(this);

        ImageView teama2 = findViewById(R.id.teama2); //Team A 2 points
        teama2.setOnClickListener(this);

        ImageView teama1 = findViewById(R.id.teama1); //Team A 1 point
        teama1.setOnClickListener(this);


        ImageView teamb3 = findViewById(R.id.teamb3); //Team B 3 points
        teamb3.setOnClickListener(this);

        ImageView teamb2 = findViewById(R.id.teamb2); //Team B 2 points
        teamb2.setOnClickListener(this);

        ImageView teamb1 = findViewById(R.id.teamb1); //Team B 1 point
        teamb1.setOnClickListener(this); }

//............Team A Methods
        /**
         * Displays the given score for Team A.
         */

    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method increments the score by 1 when the Free Throw button is clicked.
     */
    public void freeThrowTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * This method decrements the score by 2 when the + 2 Points is clicked.
     */
    public void twoPointsTeamA(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * This method decrements the score by 3 when the + 3 Points is clicked.
     */
    public void threePointsTeamA(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

//................Team B Methods

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method increments the score by 1 when the Free Throw button is clicked.
     */
    public void freeThrowTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * This method decrements the score by 2 when the + 2 Points is clicked.
     */
    public void twoPointsTeamB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * This method decrements the score by 3 when the + 3 Points is clicked.
     */
    public void threePointsTeamB(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * This method resets both team scores to 0.
     */
    public void reset(View view) {
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);
        scoreTeamB = 0;
        displayForTeamB(scoreTeamB);
    }
}
