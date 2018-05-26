package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreForTeamA = 0;
    int scoreForTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayForTeamA(scoreForTeamA);
        displayForTeamB(scoreForTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int scoreForTeamA) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreForTeamA));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int scoreForTeamB) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreForTeamB));
    }

    public void addThreeForTeamA(View v) {
        displayForTeamA(scoreForTeamA = scoreForTeamA + 3);
    }

    public void addTwoForTeamA(View v) {
        displayForTeamA(scoreForTeamA = scoreForTeamA + 2);
    }

    public void addOneForTeamA(View v) {
        displayForTeamA(scoreForTeamA = scoreForTeamA + 1);
    }

    public void addThreeForTeamB(View v) {
        displayForTeamB(scoreForTeamB = scoreForTeamB + 3);
    }

    public void addTwoForTeamB(View v) {
        displayForTeamB(scoreForTeamB =scoreForTeamB + 2);
    }

    public void addOneForTeamB(View v) {
        displayForTeamB(scoreForTeamB =scoreForTeamB + 1);
    }

    public  void resetScores(View v)
    {
        displayForTeamA(scoreForTeamA = 0);
        displayForTeamB(scoreForTeamB = 0);
    }




}
