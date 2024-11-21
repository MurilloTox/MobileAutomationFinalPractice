package com.globant.tests;

import com.globant.screens.NavigationMenuScreen;
import com.globant.utils.tests.BaseTest;
import org.testng.annotations.Test;

public class NavigationTest extends BaseTest {
    NavigationMenuScreen navigationMenuScreen;
    @Test
    public void navigationTest(){
        navigationMenuScreen = getGeneralScreen();
        navigationMenuScreen.executeMenuNavigation();
    }
}
