package com.ismailhakkiaydin.basicmvpsample.root;

import com.ismailhakkiaydin.basicmvpsample.login.LoginActivity;
import com.ismailhakkiaydin.basicmvpsample.login.LoginModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, LoginModule.class})
public interface AppComponent {
    void inject(LoginActivity loginActivity);
}
