package com.ismailhakkiaydin.basicmvpsample.login;

import androidx.annotation.Nullable;

import com.ismailhakkiaydin.basicmvpsample.data.model.User;
import com.ismailhakkiaydin.basicmvpsample.login.LoginActivityContract;

public class LoginActivityPresenter implements LoginActivityContract.Presenter {

    @Nullable
    private LoginActivityContract.View view;
    private LoginActivityContract.Model model;

    public LoginActivityPresenter(LoginActivityContract.Model model) {
        this.model = model;
    }

    @Override
    public void setView(LoginActivityContract.View view) {
        this.view = view;
    }

    @Override
    public void loginButtonClicked() {
        if (view != null) {
            if (view.getFirstName().trim().equals("") || view.getLastName().trim().equals("")) {
                view.showInputError();
            } else {
                model.createUser(view.getFirstName(), view.getLastName());
                view.showUserSavedMessage();
            }
        }
    }

    @Override
    public void getCurrentUser() {
        User user = model.getUser();
        if (user != null) {
            if (view != null) {
                view.setFirstName(user.getFirstName());
                view.setLastName(user.getLastName());
            }
        }
    }
}
