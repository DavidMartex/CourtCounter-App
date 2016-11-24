package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    /**
     * Displays the given score for Team A.
     */
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int threeptsA,twoptsA,penoA,threeptsB,twoptsB,penoB;

    public void reset(View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        threeptsA=0;threeptsB=0;twoptsA=0;twoptsB=0;penoA=0;penoB=0;
        displayForTeamA(0);
        displayForTeamB(0);
        TextView detailViewA = (TextView)findViewById(R.id.textView5);
        detailViewA.setText("Details");
        TextView detailViewB = (TextView)findViewById(R.id.textView4);
        detailViewB.setText("Details");
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreTeamA = score + scoreTeamA;
        scoreView.setText("" + scoreTeamA);
        TextView detailViewA = (TextView)findViewById(R.id.textView5);
        detailViewA.setText("Three points:"+threeptsA+"\nTwo points:"+twoptsA+"\nPenalties:"+penoA);
    }

    public void threeA(View v){
        threeptsA=++threeptsA;
        displayForTeamA(3);
    }
    public void twoA(View v){
        twoptsA=++twoptsA;
        displayForTeamA(2);
    }
    public void freeA(View v){
        penoA=++penoA;
        displayForTeamA(1);
    }
    public void displayForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreTeamB = score + scoreTeamB;
        scoreView.setText("" + scoreTeamB);
        TextView detailViewB = (TextView)findViewById(R.id.textView4);
        detailViewB.setText("Three points:"+threeptsB+"\nTwo points:"+twoptsB+"\nPenalties:"+penoB);
    }
    public void threeB(View v){
        threeptsB=++threeptsB;
        displayForTeamB(3);
    }
    public void twoB(View v){
        twoptsB=++twoptsB;
        displayForTeamB(2);
    }
    public void freeB(View v){
        penoB=++penoB;
        displayForTeamB(1);
    }
}
