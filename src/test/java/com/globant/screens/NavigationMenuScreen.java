package com.globant.screens;

import com.globant.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import java.util.Arrays;
import java.util.List;

public class NavigationMenuScreen extends BaseScreen {
    class NavigationItem {
        WebElement navigationButton;
        BaseScreen correspondingScreen;
        NavigationItem(WebElement btn, BaseScreen screen) {
            this.navigationButton = btn;
            this.correspondingScreen = screen;
        }
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Home\")")
    WebElement homeNavButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Webview\")")
    WebElement webviewNavButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Login\")")
    WebElement loginNavButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Forms\")")
    WebElement formsNavButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Swipe\")")
    WebElement swipeNavButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Drag\")")
    WebElement dragNavButton;

    public NavigationMenuScreen(AndroidDriver driver) {
        super(driver);
    }

    MainDashboardScreen mainDashboardScreen = new MainDashboardScreen(driver);
    WebViewScreen webViewScreen = new WebViewScreen(driver);
    LoginScreen userLoginScreen = new LoginScreen(driver);
    FormsScreen formsScreen = new FormsScreen(driver);
    SwipeScreen swipeScreen = new SwipeScreen(driver);
    DragScreen dragScreen = new DragScreen(driver);

    List<NavigationItem> navigationItems = Arrays.asList(
            new NavigationItem(homeNavButton, mainDashboardScreen),
            new NavigationItem(webviewNavButton, webViewScreen),
            new NavigationItem(loginNavButton, userLoginScreen),
            new NavigationItem(formsNavButton, formsScreen),
            new NavigationItem(swipeNavButton, swipeScreen),
            new NavigationItem(dragNavButton, dragScreen)
    );

    public void executeMenuNavigation() {
        for (NavigationItem navigationEntry : navigationItems) {
            navigationEntry.navigationButton.click();
            softAssert.assertTrue(navigationEntry.correspondingScreen.verifyScreen());
        }
        softAssert.assertAll();
    }

}
