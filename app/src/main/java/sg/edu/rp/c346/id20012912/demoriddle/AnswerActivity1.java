package sg.edu.rp.c346.id20012912.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class AnswerActivity1 extends AppCompatActivity
{
    TextView tvAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer1);
        Log.d("AnswerActivity1", "onCreate() called.");

        tvAnswer = findViewById(R.id.textView);
        Intent intentReceived= getIntent();
        String questionSelected = intentReceived.getStringExtra("Question");

        if(questionSelected.equalsIgnoreCase("q1"))
        {
            tvAnswer.setText(questionSelected + "answer is: Queue");
        }
        else
            {
                tvAnswer.setText(questionSelected + "answer is: Gone");
            }

    }

    protected void onStart() {
        Log.d("AnswerActivity1", "onStart() called.");
        super.onStart();
    }

    protected void onResume() {
        Log.d("AnswerActivity1", "onResume() called.");
        super.onResume();
    }

    protected void onPause() {
        Log.d("AnswerActivity1", "onPause() called.");
        super.onPause();
    }

    protected void onStop() {
        Log.d("AnswerActivity1", "onStop() called.");
        super.onStop();
    }

    protected void onDestroy() {
        Log.d("AnswerActivity1", "onDestroy() called.");
        super.onDestroy();
    }

    protected void onRestart() {
        Log.d("AnswerActivity1", "onRestart() called.");
        super.onRestart();
    }

}