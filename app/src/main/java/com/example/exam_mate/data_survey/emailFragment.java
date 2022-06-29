package com.example.exam_mate.data_survey;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.exam_mate.R;


public class emailFragment extends Fragment {


    private static final String LOG_TAG = emailFragment.class.getName();
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    private Button nextButton;
    private EditText email, password, name;
    private SurveyModel model;

    public emailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_email, container, false);
        model = new ViewModelProvider(requireActivity()).get(SurveyModel.class);
        name = v.findViewById(R.id.UserName);
        email = v.findViewById(R.id.LoginEmail);
        password = v.findViewById(R.id.LoginPassword);

        /*nextButton.setOnClickListener(view -> {
            model.setEmail(email.getText().toString());
            model.setPassword(password.getText().toString());
            model.setUserName(name.getText().toString());

        });*/
        return v;
    }
}