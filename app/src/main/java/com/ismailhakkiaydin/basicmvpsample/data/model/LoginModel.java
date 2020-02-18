package com.ismailhakkiaydin.basicmvpsample.data.model;

import com.ismailhakkiaydin.basicmvpsample.login.LoginActivityContract;
import com.ismailhakkiaydin.basicmvpsample.data.repo.LoginRepository;

public class LoginModel implements LoginActivityContract.Model {

    private LoginRepository repository;

    public LoginModel(LoginRepository repository) {
        this.repository = repository;
    }

    @Override
    public void createUser(String name, String lastName) {
        repository.saveUser(new User(name, lastName));
    }

    @Override
    public User getUser() {
        return repository.getUser();
    }

}
