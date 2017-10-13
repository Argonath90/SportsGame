package com.example.lternst.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.lternst.courtcounter.R.id.scoreG;

public class SportsGame extends AppCompatActivity {
    int GScore=0, SScore=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sports_game);
    }

    public void addTenG() {
        GScore +=10;
        displayForGryf(GScore);
    }

    public void addFifteenG() {
        GScore +=15;
        displayForGryf(GScore);
    }

    public void addSnitchG() {
        GScore +=150;
        displayForGryf(GScore);
    }

    public void addTenS() {
        SScore +=10;
        displayForSlyth(SScore);
    }

    public void addFifteenS() {
        SScore +=15;
        displayForSlyth(SScore);
    }

    public void addSnitchS() {
        SScore +=150;
        displayForSlyth(SScore);
    }

    //Displays the given score for Gryffindor
    public void displayForGryf(int displayScore) {
        TextView scoreView = (TextView) findViewById(R.id.scoreG);
        scoreView.setText(String.valueOf(displayScore));
    }

    //Displays the given score for Slytherin
    public void displayForSlyth(int displayScore) {
        TextView scoreView = (TextView) findViewById(R.id.scoreS);
        scoreView.setText(String.valueOf(displayScore));
    }

    //resets both score variables to 0
    public void reset() {
        GScore =0; SScore =0;
        displayForGryf(GScore);
        displayForSlyth(SScore);
    }
}
