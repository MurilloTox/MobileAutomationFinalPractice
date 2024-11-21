package com.globant.tests;

import com.globant.screens.LoginScreen;
import com.globant.utils.tests.BaseTest;
import org.testng.annotations.Test;

public class SignUpTest extends BaseTest{
    private LoginScreen loginScreen;
    @Test
    public void SignUp(){
        loginScreen = getLoginScreen();
        loginScreen.signUpScreenConfirm();
        loginScreen.register();
    }
}
