package com.globant.screens;

import com.globant.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class MainDashboardScreen extends BaseScreen {
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"WEBDRIVER\")")
    private WebElement mainPageIdentifier;

    public MainDashboardScreen(AndroidDriver driver) {
        super(driver);
    }

    @Override
    public Boolean verifyScreen() {
        return performScreenValidation(mainPageIdentifier);
    }

    private Boolean performScreenValidation(WebElement validationElement) {
        return isElementDisplayed(validationElement);
    }
}