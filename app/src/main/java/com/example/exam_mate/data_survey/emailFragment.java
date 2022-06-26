package com.example.exam_mate.data_survey;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.exam_mate.R;


public class emailFragment extends Fragment {


    private static final String LOG_TAG = emailFragment.class.getName();
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    private Button nextButton;

    public emailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_email, container, false);

        nextButton = v.findViewById(R.id.to_prefernce_button);

        nextButton.setOnClickListener(view -> {
            getParentFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .replace(R.id.survey_fragment_container, new preferenceFragment(), null)
                    .commit();
        });

        return v;
    }
}