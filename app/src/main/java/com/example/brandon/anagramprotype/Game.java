package com.example.brandon.anagramprotype;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.logging.Handler;

public class Game extends AppCompatActivity {

    String[] EasyArray={"bugs"};
    String[] MediumArray={"Trash"};
    String[] HardArray={"Fanastic"};
    int mode;
    int score=0;
    int puzzles=0;
    String Answer;

    TextView time;
    private long startTime = 0L;

    private Handler customHandler = new Handler();

    long timeInMilliseconds = 0L;
    long timeSwapBuff = 0L;
    long updatedTime = 0L;
    boolean stopTimer = false;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        startTime= SystemClock.uptimeMillis();
        customHandler.postDelayed(updateTimerThread,0);


        Button title_return = (Button) findViewById(R.id.MainActReturn);
        Button score_btn = (Button) findViewById(R.id.Score_Btn);

        final Intent intentScore= new Intent(Game.this,Score_Menu.class);
        final EditText answer= (EditText) findViewByID(R.id.answer);
        title_return.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                 Answer=answer.getText().toString();

                if(EasyArray.length>=puzzles) {

                    if (Answer.equals(EasyArray[puzzles]) {

                        score++;

                    }

                    puzzles++;
                }
                if(MediumArray.length>=puzzles){

                    if(Answer.equals(MediumArray[puzzles]){

                        score++;

                }
                    puzzles++;
                if(HardArray.length>=puzzles) {

                    if(Answer.equals(HardArray[puzzles]){


                        score++;
                }
                    intentScore.putExtra("CorrectAnswers", score);
                    intentScore.putExtra("Totalpuzzles",puzzles);
                    startActivity(intentScore);
        });
                    score_btn.setOnClickListener(new View.OnClickListener() {

                        public void onClick(View v) {

                            intentScore.putExtra("CorrectAnswers",score);
                            intentScore.putExtra("Totalpuzzles",puzzles);
                            startActivity(intentScore);

            }

        });


                    private Runnable updateTimerThread = new Runnable() {

                        public void run() {
                            timeInMilliseconds = SystemClock.uptimeMillis() - startTime;

                            updatedTime = timeSwapBuff + timeInMilliseconds;

                            int secs = (int) (updatedTime / 1000);
                            int mins = secs / 60;
                            secs = secs % 60;
                            int milliseconds = (int) (updatedTime % 1000);
                            String localtime = "" + mins + ":" + String.format("%02d", secs)
                                    + ":" + String.format("%03d", milliseconds);
                            time.setText(localtime);
                            if (mins == 1) {
                                stopTimer = true;
                                Toast.makeText(Game.this, "You guys are awesome",
                                        Toast.LENGTH_SHORT).show();
                            }
                            if (!stopTimer)
                                customHandler.postDelayed(this, 0);
                        }
                    };



    }

}
