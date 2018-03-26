package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.scorekeeper.R;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;
    int assistA = 0;
    int assistB = 0;
    int pimA = 0;
    int pimB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayScoreTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_goals);
        scoreView.setText(String.valueOf(score));
    }

    public void displayAssistsTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_assists);
        scoreView.setText(String.valueOf(score));
    }

    public void displayPimTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_pims);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds 3 points to Team A's score
     */
    public void addGoalA(View view) {
        scoreA = scoreA + 1;
        displayScoreTeamA(scoreA);
    }

    /**
     * Adds 2 points to Team A's score
     */
    public void addAssistA(View view) {
        assistA = assistA + 1;
        displayAssistsTeamA(assistA);
    }

    /**
     * Adds 1 point to Team A's score
     */
    public void pimTwoA(View view) {
        pimA = pimA + 2;
        displayPimTeamA(pimA);
    }

    public void pimFiveA(View view) {
        pimA = pimA + 5;
        displayPimTeamA(pimA);
    }

    public void pimTenA(View view) {
        pimA = pimA + 10;
        displayPimTeamA(pimA);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayScoreTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_goals);
        scoreView.setText(String.valueOf(score));
    }

    public void displayAssistsTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_assists);
        scoreView.setText(String.valueOf(score));
    }

    public void displayPimTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_pims);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds 3 points to Team B's score
     */
    public void addGoalB(View view) {
        scoreB = scoreB + 1;
        displayScoreTeamB(scoreB);
    }

    /**
     * Adds 2 points to Team B's score
     */
    public void addAssistB(View view) {
        assistB = assistB + 1;
        displayAssistsTeamB(assistB);
    }

    /**
     * Adds 1 point to Team B's score
     */
    public void pimTwoB(View view) {
        pimB = pimB + 2;
        displayPimTeamB(pimB);
    }

    public void pimFiveB(View view) {
        pimB = pimB + 5;
        displayPimTeamB(pimB);
    }

    public void pimTenB(View view) {
        pimB = pimB + 10;
        displayPimTeamB(pimB);
    }

    /**
     * Resets Team A and Team B's scores to 0
     */
    public void resetScore(View view) {
        scoreA = 0;
        scoreB = 0;
        assistA = 0;
        assistB = 0;
        pimA = 0;
        pimB = 0;
        displayScoreTeamA(scoreA);
        displayScoreTeamB(scoreB);
        displayAssistsTeamA(assistA);
        displayAssistsTeamB(assistB);
        displayPimTeamA(pimA);
        displayPimTeamB(pimB);
    }
}
