package com.example.android.musictheoryquiz;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int scores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        }
        Log.v("MainActivity", "score1 " + scores);
        setContentView(R.layout.the_second_question);
    }

    public void checkAndGoToTheQuestion3 (View view) {
        RadioButton question2Choice4 = (RadioButton) findViewById(R.id.q2_4);
        boolean q2_choice4 = ((RadioButton) question2Choice4).isChecked();
        if (q2_choice4) {
            scores += 1;
        }
        Log.v("MainActivity", "score2 " + scores);
        setContentView(R.layout.the_third_question);
    }

    public void checkAndGoToTheQuestion4 (View view) {
        RadioButton question3Choice3 = (RadioButton) findViewById(R.id.q3_3);
        boolean q3_choice3 = ((RadioButton) question3Choice3).isChecked();
        if (q3_choice3) {
            scores += 1;
        }
        Log.v("MainActivity", "score3 " + scores);
        setContentView(R.layout.the_fourth_question);
    }

    public void checkAndGoToTheQuestion5 (View view) {
        RadioButton question4Choice4 = (RadioButton) findViewById(R.id.q4_4);
        boolean q4_choice4 = ((RadioButton) question4Choice4).isChecked();
        if (q4_choice4) {
            scores += 1;
        }
        Log.v("MainActivity", "score4 " + scores);
        setContentView(R.layout.the_fifth_question);
    }

    public void checkAndGoToTheQuestion6 (View view) {
        RadioButton question5Choice3 = (RadioButton) findViewById(R.id.q5_3);
        boolean q5_choice3 = ((RadioButton) question5Choice3).isChecked();
        if (q5_choice3) {
            scores += 1;
        }
        Log.v("MainActivity", "score5 " + scores);
        setContentView(R.layout.the_sixth_question);
    }

    public void checkAndGoToTheQuestion7 (View view) {
        CheckBox fCheckBox = (CheckBox) findViewById(R.id.checkboxF);
        CheckBox amCheckBox = (CheckBox) findViewById(R.id.checkboxAm);
        CheckBox cmCheckBox = (CheckBox) findViewById(R.id.checkboxCm);
        CheckBox gCheckBox = (CheckBox) findViewById(R.id.checkboxG);
        CheckBox d7CheckBox = (CheckBox) findViewById(R.id.checkboxD7);
        if (!fCheckBox.isChecked() && amCheckBox.isChecked() && !cmCheckBox.isChecked() && gCheckBox.isChecked() && d7CheckBox.isChecked()) {
            scores += 1;
            Log.v("MainActivity", "score6.1 " + scores);
        }
        Log.v("MainActivity", "score6.2 " + scores);
        setContentView(R.layout.the_seventh_question);
    }

    public void checkAndGoToTheResults (View view) {
        EditText answerQuestion7Field = (EditText) findViewById(R.id.answerQuest7);
        String answerQuestion7 = answerQuestion7Field.getText().toString().trim();
        if (answerQuestion7.contentEquals("G")) {
            scores += 1;
            Log.v("MainActivity", "score7.1 " + scores);
        }
        Log.v("MainActivity", "score7.2 " + scores);
        setContentView(R.layout.results);
        displayResult(scores);
        displayMessage(scores);

        //Text for the Toast.
        TextView toastResultTextView = (TextView) findViewById(R.id.text_toast);
        ImageView toastResultImageView = (ImageView) findViewById(R.id.ic_result);
        if (scores >= 6) {
            toastResultTextView.setText(R.string.Toast_result_Awesome);
            toastResultImageView.setImageResource(R.drawable.yeah);
        } else if (scores >= 4) {
            toastResultTextView.setText(R.string.Toast_result_Not_Bad);
            toastResultImageView.setImageResource(R.drawable.ok);
        } else if (scores >= 0) {
            toastResultTextView.setText(R.string.Toast_result_Looser);
            toastResultImageView.setImageResource(R.drawable.looser);
        }

        //Toast showing the quiz results.
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast,
                (ViewGroup) findViewById(R.id.custom_toast_container));

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.BOTTOM, 0, 0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }

    /**
     * The methods for displaying the results of the quiz.
     */

    public void displayResult (int scores) {
        TextView scoresTextView = (TextView) findViewById(R.id.scores);
        scoresTextView.setText("" + scores + "/7");
    }

    public void displayMessage (int scores){
        TextView resultMessageTextView = (TextView) findViewById(R.id.text_results);
        if (scores<=2) {
            resultMessageTextView.setText(R.string.Message_result1);
        } else if  (scores==3) {
            resultMessageTextView.setText(R.string.Message_result2);
        }
        else if  (scores<=5) {
            resultMessageTextView.setText(R.string.Message_result3);
        }
        else if  (scores==6) {
            resultMessageTextView.setText(R.string.Message_result4);
        }
        else if (scores==7) {
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
//        MotionEvent event;
        ImageButton playTheScale_1Button = (ImageButton) findViewById(R.id.sound_q1);
        playTheScale_1Button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                scale1.start();
            }
        });
    }

    public void playTheScale2 (View view){
        final MediaPlayer scale2 = MediaPlayer.create(this, R.raw.f_sharp_minor_melodic_piano_scale2);
//        MotionEvent event;
        ImageButton playTheScale_2Button = (ImageButton) findViewById(R.id.sound_q2);
        playTheScale_2Button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                scale2.start();
            }
        });
    }

    public void playTheScale3 (View view){
        final MediaPlayer scale3 = MediaPlayer.create(this, R.raw.e_minor_harmonic_piano_scale3);
//        MotionEvent event;
        ImageButton playTheScale_3Button = (ImageButton) findViewById(R.id.sound_q3);
        playTheScale_3Button.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v) {
                    scale3.start();
                }
            });
    }

    public void playTheScale4 (View view){
        final MediaPlayer scale4 = MediaPlayer.create(this, R.raw.g_minor_melodic_piano_scale4);
//        MotionEvent event;
        ImageButton playTheScale_4Button = (ImageButton) findViewById(R.id.sound_q4);
        playTheScale_4Button.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v) {
                    scale4.start();
                }
            });
    }

    public void playTheScale5 (View view){
        final MediaPlayer scale5 = MediaPlayer.create(this, R.raw.d_minor_harmonic_piano_scale5);
//        MotionEvent event;
        ImageButton playTheScale_5Button = (ImageButton) findViewById(R.id.sound_q5);
        playTheScale_5Button.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v) {
                    scale5.start();
                }
            });
    }
}






