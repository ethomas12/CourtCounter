package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
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

        ImageButton teama3 = findViewById(R.id.teama3); // Team A 3 points
        teama3.setOnClickListener(this);

        ImageButton teama2 = findViewById(R.id.teama2); //Team A 2 points
        teama2.setOnClickListener(this);

        ImageButton teama1 = findViewById(R.id.teama1); //Team A 1 point
        teama1.setOnClickListener(this);

        ImageButton teamb3 = findViewById(R.id.teamb3); //Team B 3 points
        teamb3.setOnClickListener(this);

        ImageButton teamb2 = findViewById(R.id.teamb2); //Team B 2 points
        teamb2.setOnClickListener(this);

        ImageButton teamb1 = findViewById(R.id.teamb1); //Team B 1 point
        teamb1.setOnClickListener(this); }


        // Perform action on click
//        switch (v.getId()) {
//
//            case R.id.teama3:
//                scoreTeamA = scoreTeamA + 3;
//                displayForTeamA(scoreTeamA);
//                break;
//            case R.id.teama2:
//                scoreTeamA = scoreTeamA + 2;
//                displayForTeamA(scoreTeamA);
//                break;
//            case R.id.teama1:
//                scoreTeamA = scoreTeamA + 1;
//                displayForTeamA(scoreTeamA);
//                break;
//
//
//            case R.id.teamb3:
//                scoreTeamB = scoreTeamB + 3;
//                displayForTeamB(scoreTeamB);
//                break;
//            case R.id.teamb2:
//                scoreTeamB = scoreTeamB + 2;
//                displayForTeamB(scoreTeamB);
//            case R.id.teamb1:
//                scoreTeamB = scoreTeamB + 1;
//                displayForTeamB(scoreTeamB);
//
//        }
//    }




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
