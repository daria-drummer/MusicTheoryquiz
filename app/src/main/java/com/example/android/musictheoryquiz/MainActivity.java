package com.example.android.musictheoryquiz;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int scores = 0;

//    /**
//     * initializing the Radio Buttons (answers to the quiz).
//     */

//    public RadioButton question1Choice1;
//    public RadioButton question1Choice2;
//    public RadioButton question1Choice3;
//    public RadioButton question1Choice4;
//    public RadioButton question2Choice1;
//    public RadioButton question2Choice2;
//    public RadioButton question2Choice3;
//    public RadioButton question2Choice4;
//    public RadioButton question3Choice1;
//    public RadioButton question3Choice2;
//    public RadioButton question3Choice3;
//    public RadioButton question3Choice4;
//    public RadioButton question4Choice1;
//    public RadioButton question4Choice2;
//    public RadioButton question4Choice3;
//    public RadioButton question4Choice4;
//    public RadioButton question5Choice1;
//    public RadioButton question5Choice2;
//    public RadioButton question5Choice3;
//    public RadioButton question5Choice4;

//    /**
//     * initializing the Image Buttons which produce sounds.
//     */
//    public ImageButton playTheScale_1Button;
//    public ImageButton playTheScale_2Button;
//    public ImageButton playTheScale_3Button;
//    public ImageButton playTheScale_4Button;
//    public ImageButton playTheScale_5Button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        question1Choice1 = findViewById(R.id.q1_1);
//        question1Choice2 = findViewById(R.id.q1_2);
//        question1Choice3 = findViewById(R.id.q1_3);
//        question1Choice4 = findViewById(R.id.q1_4);
//        question2Choice1 = findViewById(R.id.q2_1);
//        question2Choice2 = findViewById(R.id.q2_2);
//        question2Choice3 = findViewById(R.id.q2_3);
//        question2Choice4 = findViewById(R.id.q2_4);
//        question3Choice1 = findViewById(R.id.q3_1);
//        question3Choice2 = findViewById(R.id.q3_2);
//        question3Choice3 = findViewById(R.id.q3_3);
//        question3Choice4 = findViewById(R.id.q3_4);
//        question4Choice1 = findViewById(R.id.q4_1);
//        question4Choice2 = findViewById(R.id.q4_2);
//        question4Choice3 = findViewById(R.id.q4_3);
//        question4Choice4 = findViewById(R.id.q4_4);
//        question5Choice1 = findViewById(R.id.q5_1);
//        question5Choice2 = findViewById(R.id.q5_2);
//        question5Choice3 = findViewById(R.id.q5_3);
//        question5Choice4 = findViewById(R.id.q5_4);
//        playTheScale_1Button = findViewById(R.id.sound_q1);
//        playTheScale_2Button = findViewById(R.id.sound_q2);
//        playTheScale_3Button = findViewById(R.id.sound_q3);
//        playTheScale_4Button = findViewById(R.id.sound_q4);
//        playTheScale_5Button = findViewById(R.id.sound_q5);
    }


    /**
     * the methods called when the Button "Begin" pressed
     */

    public void beginTheQuiz (View view) {
        setContentView(R.layout.the_first_question);
    }


    /**
     * the methods called when you press the Radio Buttons.
     */

    public void checkAndGoToTheQuestion2 (View view) {
        RadioButton question1Choice1 = (RadioButton) findViewById(R.id.q1_1);
        boolean q1_choice1 = ((RadioButton) question1Choice1).isChecked();
        if (q1_choice1) {
            scores += 1;
            Log.v("MainActivity", "score1 " + scores);
        }
        setContentView(R.layout.the_second_question);
    }

    public void checkAndGoToTheQuestion3 (View view) {
        RadioButton question2Choice4 = (RadioButton) findViewById(R.id.q2_4);
        boolean q2_choice4 = ((RadioButton) question2Choice4).isChecked();
        if (q2_choice4) {
            scores += 1;
            Log.v("MainActivity", "score2 " + scores);
        }
        setContentView(R.layout.the_third_question);
    }

    public void checkAndGoToTheQuestion4 (View view) {
        RadioButton question3Choice3 = (RadioButton) findViewById(R.id.q3_3);
        boolean q3_choice3 = ((RadioButton) question3Choice3).isChecked();
        if (q3_choice3) {
            scores += 1;
            Log.v("MainActivity", "score3 " + scores);
        }
        setContentView(R.layout.the_fourth_question);
    }

    public void checkAndGoToTheQuestion5 (View view) {
        RadioButton question4Choice4 = (RadioButton) findViewById(R.id.q4_4);
        boolean q4_choice4 = ((RadioButton) question4Choice4).isChecked();
        if (q4_choice4) {
            scores += 1;
            Log.v("MainActivity", "score4 " + scores);
        }
        setContentView(R.layout.the_fifth_question);
    }

    public void checkAndGoToTheResults (View view) {
        RadioButton question5Choice3 = (RadioButton) findViewById(R.id.q5_3);
        boolean q5_choice3 = ((RadioButton) question5Choice3).isChecked();
        if (q5_choice3) {
            scores += 1;
            Log.v("MainActivity", "score4 " + scores);
        }
        setContentView(R.layout.results);
        displayResult(scores);
        displayMessage(scores);
    }


    /**
     * The methods for displaying the results of the quiz.
     */

    public void displayResult (int scores) {
        TextView scoresTextView = (TextView) findViewById(R.id.scores);
        scoresTextView.setText("" + scores + "/5");
    }

    public void displayMessage (int scores){
        TextView resultMessageTextView = (TextView) findViewById(R.id.text_results);
        if (scores<=1) {
            resultMessageTextView.setText(R.string.Message_result1);
        } else if  (scores==2) {
            resultMessageTextView.setText(R.string.Message_result2);
        }
        else if  (scores==3) {
            resultMessageTextView.setText(R.string.Message_result3);
        }
        else if  (scores==4) {
            resultMessageTextView.setText(R.string.Message_result4);
        }
        else if (scores==5) {
            resultMessageTextView.setText(R.string.Message_result5);
        }
    }

    /**
     * The methods when the Button "Try Again" pressed
     */

    public void tryAgain (View view) {
        scores = 0;
        setContentView(R.layout.activity_main);
    }





    /**
     * the methods called when you press the sounds buttons.
     */



    public void playTheScale1 (View view){
        final MediaPlayer scale1 = MediaPlayer.create(this, R.raw.b_flat_major_piano_scale1);
        MotionEvent event;
        ImageButton playTheScale_1Button = (ImageButton) findViewById(R.id.sound_q1);
        playTheScale_1Button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                scale1.start();
            }
        });
    }
    public void playTheScale2 (View view){
        final MediaPlayer scale2 = MediaPlayer.create(this, R.raw.f_sharp_minor_melodic_piano_scale2);
        MotionEvent event;
        ImageButton playTheScale_2Button = (ImageButton) findViewById(R.id.sound_q2);
        playTheScale_2Button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                scale2.start();
            }
        });
    }

    public void playTheScale3 (View view){
        final MediaPlayer scale3 = MediaPlayer.create(this, R.raw.e_minor_harmonic_piano_scale3);
        MotionEvent event;
        ImageButton playTheScale_3Button = (ImageButton) findViewById(R.id.sound_q3);
        playTheScale_3Button.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v) {
                    scale3.start();
                }
            });
    }

    public void playTheScale4 (View view){
        final MediaPlayer scale4 = MediaPlayer.create(this, R.raw.g_minor_melodic_piano_scale4);
        MotionEvent event;
        ImageButton playTheScale_4Button = (ImageButton) findViewById(R.id.sound_q4);
        playTheScale_4Button.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v) {
                    scale4.start();
                }
            });
    }

    public void playTheScale5 (View view){
        final MediaPlayer scale5 = MediaPlayer.create(this, R.raw.d_minor_harmonic_piano_scale5);
        MotionEvent event;
        ImageButton playTheScale_5Button = (ImageButton) findViewById(R.id.sound_q5);
        playTheScale_5Button.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v) {
                    scale5.start();
                }
            });
    }

}






