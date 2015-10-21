package com.example.kb.funfact;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView aboutMeView = (TextView) findViewById(R.id.aboutMeText);
        final Button aboutMeButton = (Button) findViewById(R.id.aboutMeButton);
        final RelativeLayout background = (RelativeLayout) findViewById(R.id.background);
        View.OnClickListener listener = new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                String[] aboutMeLabel = {
                        "Hi, my name is Thomas Kim.",
                        "His Korean Name is 김 기 범 (Ki Bum Kim).",
                        "He was born on July 17 1989, in Seoul, South Korea.",
                        "He grew up in Seoul until he reached his age of 15.",
                        "He went to Central Valley high school in Spokane, Washington as an exchange student hosted by U.S Department of State.",
                        "After one year in Spokane, He moved Canada to finish his high school education.",
                        "He went to University of British Columbia after he graduated from Byrne Creek Secondary in Burnaby school district.",
                        "He finished his bachelor degree in 2015 with major in Computer Science, and minor in Economics",
                        "He is starting his career in an Information Technology Industry."
                };
                  Random randomNumb = new Random();
                  int i  = randomNumb.nextInt(9);
                background.setBackgroundColor(Color.parseColor("#7FFFD4"));
                aboutMeButton.setBackgroundColor(Color.parseColor("#7FFFD4"));

                aboutMeView.setText(aboutMeLabel[i]);
            }

        };
        aboutMeButton.setOnClickListener(listener);


    }
}
