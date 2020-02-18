package com.ismailhakkiaydin.basicmvpsample.login;

import com.ismailhakkiaydin.basicmvpsample.data.repo.UserRepository;
import com.ismailhakkiaydin.basicmvpsample.data.model.LoginModel;
import com.ismailhakkiaydin.basicmvpsample.data.repo.LoginRepository;

import dagger.Module;
import dagger.Provides;

@Module
public class LoginModule {

    @Provides
    public LoginActivityContract.Presenter providePresenter(LoginActivityContract.Model model){
        return new LoginActivityPresenter(model);
    }

    @Provides
    public LoginActivityContract.Model provideModel(LoginRepository loginRepository){
        return new LoginModel(loginRepository);
    }

    @Provides
    public LoginRepository provideLoginRepository(){
        return new UserRepository();
    }

}
