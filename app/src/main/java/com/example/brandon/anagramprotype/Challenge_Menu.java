package com.example.brandon.anagramprotype;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Challenge_Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge__menu);
        Button easy_btn= (Button) findViewById(R.id.Easybtn);
        Button medium_btn= (Button) findViewById(R.id.Mediumbtn);
        Button hard_btn= (Button) findViewById(R.id.Hardbtn);
        final Intent intent= new Intent(Challenge_Menu.this,Game.class);


        easy_btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v){
                intent.putExtra("GameModeID",0);
                startActivity(intent);

            }

        });
        medium_btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v){
                intent.putExtra("GameModeID",1);
                startActivity(intent);

            }

        });
        hard_btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v){
                intent.putExtra("GameModeID",2);
                startActivity(intent);

            }

        });

    }

}
