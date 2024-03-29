package com.example.homeworkout;

import androidx.appcompat.app.AppCompatActivity;
import android.os.*;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class jumping_jack_beginner extends AppCompatActivity {

    Button start_timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jumping_jack_beginner);

        start_timer = findViewById(R.id.start_timer);
        start_timer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new CountDownTimer(20000, 1000) {

                    public void onTick(long millisUntilFinished) {
                        // Update the UI with the remaining time
                        long seconds = millisUntilFinished / 1000;
                        start_timer.setText("Remaining Time: " + seconds);
                    }

                    public void onFinish() {
                        // Update the UI when the timer finishes
                        start_timer.setText("Timer finished!");
                    }

                }.start();

            }
        });
    }
}