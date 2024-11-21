package com.globant.tests;

import com.globant.screens.SwipeScreen;
import com.globant.utils.tests.BaseTest;
import org.testng.annotations.Test;

public class SwipeTest extends BaseTest {
    SwipeScreen swipeScreen;
    @Test()
    public void TestSwipe(){
        swipeScreen = getSwipeScreen();
        swipeScreen.BtnSwipeConfirmation();
        swipeScreen.swipeRight();
        swipeScreen.swipeLeft();
    }
}
