package com.example.exam_mate.data_survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.exam_mate.HomeActivity;
import com.example.exam_mate.MainActivity;
import com.example.exam_mate.R;

public class SurveyActivity extends AppCompatActivity {

    private Button nextButton, backButton;
    private static int timesPressed =0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey);

        nextButton = findViewById(R.id.next_button);
        backButton = findViewById(R.id.back_button);
        setUI();
        getSupportFragmentManager().beginTransaction()
                .setReorderingAllowed(true)
                .replace(R.id.survey_fragment_container, new emailFragment(), null)
                .commit();


    }

    private void setUI() {
        nextButton.setOnClickListener(view -> {
            if(timesPressed < 2)
                ++timesPressed;
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .replace(R.id.survey_fragment_container, new preferenceFragment(), null)
                    .commit();

            if(timesPressed == 2){
                // move to home activity
                Intent homeIntent = new Intent(SurveyActivity.this, HomeActivity.class);
                startActivity(homeIntent);
                finish();
            }
        });
        backButton.setOnClickListener(view -> {
            if(timesPressed > 0)
                --timesPressed ;
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .replace(R.id.survey_fragment_container, new emailFragment(), null)
                    .commit();

            if (timesPressed == 0){
                //move to initial screen
                Intent backIntent = new Intent(SurveyActivity.this, MainActivity.class);
                startActivity(backIntent);
                finish();
            }
        });
    }
}