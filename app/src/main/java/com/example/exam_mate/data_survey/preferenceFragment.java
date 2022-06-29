package com.example.exam_mate.data_survey;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.Spinner;

import com.example.exam_mate.R;


public class preferenceFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String LOG_TAG = "PreferenceFragment";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private Spinner standardSpinner, subjectSpinner;

    public preferenceFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_preference, container, false);

        standardSpinner = v.findViewById(R.id.spinner_class);
        subjectSpinner = v.findViewById(R.id.spinner_subject);

        ArrayAdapter<CharSequence> standardAdapter = ArrayAdapter.createFromResource(getContext(), R.array.classes, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> subjectAdapter = ArrayAdapter.createFromResource(getContext(), R.array.subjects, android.R.layout.simple_spinner_item);
        standardAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        subjectAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        standardSpinner.setAdapter(standardAdapter);
        subjectSpinner.setAdapter(subjectAdapter);
        return v;
    }

    public void onRadioButtonClicked(View v){
        boolean checked = ((RadioButton)v).isChecked();

        switch (v.getId()){
            case R.id.radioButton_easy:
                //add mode to easy
                Log.d(LOG_TAG, "onRadioButtonClicked: easy");
                break;
            case R.id.radioButton_medium:
                //add mode to medium
                Log.d(LOG_TAG, "onRadioButtonClicked: medium");
                break;
            case R.id.radioButton_hard:
                //add mode to hard
                Log.d(LOG_TAG, "onRadioButtonClicked: hard");
                break;
            default:
                break;
        }
    }
}