package com.example.exam_mate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.exam_mate.data_survey.SurveyActivity;


public class MainActivity extends AppCompatActivity {

    private Button getStartedButton;
    private Button skipButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getStartedButton = findViewById(R.id.button_get_started);
        skipButton = findViewById(R.id.button_skip_survey);

        getStartedButton.setOnClickListener(view -> {
            Intent surveyIntent = new Intent(MainActivity.this, SurveyActivity.class);
            startActivity(surveyIntent);
            finish();
        });

        skipButton.setOnClickListener(view -> {
            Intent homeIntent = new Intent(MainActivity.this, HomeActivity.class);
            startActivity(homeIntent);
            finish();
        });
    }
}