package com.example.brandon.anagramprotype;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Score_Menu extends AppCompatActivity {

    int score;
    int puzzles;
    String  final_Score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score__menu);

        Button title_return = (Button) findViewById(R.id.button2);
        Button game_btn = (Button) findViewById(R.id.button3);
        score=getIntent().getExtras().getInt("CorrectAnswers");
        puzzles=getIntent().getExtras().getInt("TotalPuzzles:");
        Textview t= (Textview) findViewById(R.id.final_score);
        final_Score=" "+score+""+puzzles+"";
        t.setText(final_Score);



        title_return.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                startActivity(new Intent(Score_Menu.this, MainActivity.class));

            }

        });
        game_btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                startActivity(new Intent(Score_Menu.this, Game.class));

            }

        });

    }

}
