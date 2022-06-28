package com.example.exam_mate.data_survey;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SurveyModel extends ViewModel {

    public MutableLiveData<String> userName;
    public MutableLiveData<String> email;
    public MutableLiveData<String> password;
    public MutableLiveData<String> preferredSubject;
    public MutableLiveData<String> standard;
    public MutableLiveData<String> mode;

    public MutableLiveData<String> getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName.setValue(userName);
    }

    public MutableLiveData<String> getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email.setValue(email);
    }

    public MutableLiveData<String> getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password.setValue(password);
    }

    public MutableLiveData<String> getPreferredSubject() {
        return preferredSubject;
    }

    public void setPreferredSubject(String preferredSubject) {
        this.preferredSubject.setValue(preferredSubject);
    }

    public MutableLiveData<String> getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard.setValue(standard);
    }

    public MutableLiveData<String> getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode.setValue(mode);
    }
}
