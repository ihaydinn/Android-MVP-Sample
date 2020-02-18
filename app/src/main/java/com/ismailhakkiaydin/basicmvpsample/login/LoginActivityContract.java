package com.ismailhakkiaydin.basicmvpsample.login;

import com.ismailhakkiaydin.basicmvpsample.data.model.User;

public interface LoginActivityContract {

    interface View{

        String getFirstName();
        String getLastName();
        void showInputError();
        void showUserSavedMessage();
        void setFirstName(String firstName);
        void setLastName(String lastName);

    }

    interface Presenter{

        void setView(View view);

        void loginButtonClicked();

        void getCurrentUser();

    }

    interface Model{
        void createUser(String name, String lastName);
        User getUser();
    }

}
