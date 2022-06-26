package com.example.exam_mate.data_survey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.exam_mate.R;

public class surveyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey);

        getSupportFragmentManager().beginTransaction()
                .setReorderingAllowed(true)
                .replace(R.id.survey_fragment_container, new emailFragment(), null)
                .commit();

    }
}