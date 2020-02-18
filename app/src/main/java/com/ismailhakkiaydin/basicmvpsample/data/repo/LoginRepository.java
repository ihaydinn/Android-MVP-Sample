package com.ismailhakkiaydin.basicmvpsample.data.repo;

import com.ismailhakkiaydin.basicmvpsample.data.model.User;

public interface LoginRepository {

    User getUser();
    void saveUser(User user);

}
