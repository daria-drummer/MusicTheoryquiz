package com.example.android.musictheoryquiz;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int scores = 0;

    /**
     * initializing the Radio Buttons (answers to the quiz).
     */

    public RadioButton question1Choice1;
    public RadioButton question1Choice2;
    public RadioButton question1Choice3;
    public RadioButton question1Choice4;
    public RadioButton question2Choice1;
    public RadioButton question2Choice2;
    public RadioButton question2Choice3;
    public RadioButton question2Choice4;
    public RadioButton question3Choice1;
    public RadioButton question3Choice2;
    public RadioButton question3Choice3;
    public RadioButton question3Choice4;
    public RadioButton question4Choice1;
    public RadioButton question4Choice2;
    public RadioButton question4Choice3;
    public RadioButton question4Choice4;
    public RadioButton question5Choice1;
    public RadioButton question5Choice2;
    public RadioButton question5Choice3;
    public RadioButton question5Choice4;

    /**
     * initializing the Image Buttons which produce sounds.
     */
    public ImageButton playTheScale_1Button;
    public ImageButton playTheScale_2Button;
    public ImageButton playTheScale_3Button;
    public ImageButton playTheScale_4Button;
    public ImageButton playTheScale_5Button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.the_first_question);
        question1Choice1 = findViewById(R.id.q1_1);
        question1Choice2 = findViewById(R.id.q1_2);
        question1Choice3 = findViewById(R.id.q1_3);
        question1Choice4 = findViewById(R.id.q1_4);
        question2Choice1 = findViewById(R.id.q2_1);
        question2Choice2 = findViewById(R.id.q2_2);
        question2Choice3 = findViewById(R.id.q2_3);
        question2Choice4 = findViewById(R.id.q2_4);
        question3Choice1 = findViewById(R.id.q3_1);
        question3Choice2 = findViewById(R.id.q3_2);
        question3Choice3 = findViewById(R.id.q3_3);
        question3Choice4 = findViewById(R.id.q3_4);
        question4Choice1 = findViewById(R.id.q4_1);
        question4Choice2 = findViewById(R.id.q4_2);
        question4Choice3 = findViewById(R.id.q4_3);
        question4Choice4 = findViewById(R.id.q4_4);
        question5Choice1 = findViewById(R.id.q5_1);
        question5Choice2 = findViewById(R.id.q5_2);
        question5Choice3 = findViewById(R.id.q5_3);
        question5Choice4 = findViewById(R.id.q5_4);
        playTheScale_1Button = findViewById(R.id.sound_q1);
        playTheScale_2Button = findViewById(R.id.sound_q2);
        playTheScale_3Button = findViewById(R.id.sound_q3);
        playTheScale_4Button = findViewById(R.id.sound_q4);
        playTheScale_5Button = findViewById(R.id.sound_q5);
    }


    /**
     * the methods called when you press the Radio Buttons.
     */

    public void checkAndGoToTheQuestion2 (View view) {
        if (question1Choice4.isChecked ()) {
            scores +=1; }
        Log.v("MainActivity", "score" + scores);
        setContentView(R.layout.the_second_question);
        }

    public void checkAndGoToTheQuestion3 (View view) {
        if (question2Choice1.isChecked ()) {
            scores +=1; }
        Log.v("MainActivity", "score" + scores);
        setContentView(R.layout.the_third_question);
        }

    public void checkAndGoToTheQuestion4 (View view) {
        if (question3Choice3.isChecked ()) {
            scores +=1; }
        Log.v("MainActivity", "score" + scores);
        setContentView(R.layout.the_fourth_question);
        }

    public void checkAndGoToTheQuestion5 (View view) {
        if (question4Choice4.isChecked ()) {
            scores +=1; }
        Log.v("MainActivity", "score" + scores);
        setContentView(R.layout.the_fifth_question);
        }

    public void checkAndGoToTheResults (View view) {
        if (question5Choice3.isChecked ()) {
            scores +=1; }
        Log.v("MainActivity", "score" + scores);
        setContentView(R.layout.results);
        }


    /**
     * the methods called when you press the sounds buttons.
     */


    public void playTheScale1 (View view){
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.f_sharp_minor_melodic_piano_scale);
        MotionEvent event;
        playTheScale_1Button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                mp.start();
            }
        });
    }
    public void playTheScale2 (View view){
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.f_sharp_minor_melodic_piano_scale);
        MotionEvent event;
        playTheScale_2Button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                mp.start();
            }
        });
    }
        public void playTheScale3 (View view){
            final MediaPlayer mp = MediaPlayer.create(this, R.raw.f_sharp_minor_melodic_piano_scale);
            MotionEvent event;
            playTheScale_3Button.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v) {
                    mp.start();
                }
            });
        }
        public void playTheScale4 (View view){
            final MediaPlayer mp = MediaPlayer.create(this, R.raw.f_sharp_minor_melodic_piano_scale);
            MotionEvent event;
            playTheScale_4Button.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v) {
                    mp.start();
                }
            });
        }
        public void playTheScale5 (View view){
            final MediaPlayer mp = MediaPlayer.create(this, R.raw.f_sharp_minor_melodic_piano_scale);
            MotionEvent event;
            playTheScale_5Button.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v) {
                    mp.start();
                }
            });
        }
    }






