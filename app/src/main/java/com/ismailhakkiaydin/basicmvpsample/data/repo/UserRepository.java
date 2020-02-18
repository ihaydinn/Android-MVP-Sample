package com.ismailhakkiaydin.basicmvpsample.data.repo;

import com.ismailhakkiaydin.basicmvpsample.data.model.User;
import com.ismailhakkiaydin.basicmvpsample.data.repo.LoginRepository;

public class UserRepository implements LoginRepository {

    private User user;

    @Override
    public User getUser() {

        if (user != null) {
            User user = new User("İsmail Hakkı", "Aydın");
            user.setId(0);
            return user;
        } else
            return user;
    }

    @Override
    public void saveUser(User user) {
        if (user == null) {
            user = getUser();
        }
        this.user = user;
    }
}
