package com.example.brandon.anagramprotype;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Button title_return = (Button) findViewById(R.id.button4);

        title_return.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                startActivity(new Intent(About.this, MainActivity.class));

            }

        });

    }

}
