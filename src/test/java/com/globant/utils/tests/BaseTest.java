package com.globant.utils.tests;

import java.net.MalformedURLException;
import java.net.URL;

import com.globant.screens.NavigationMenuScreen;
import com.globant.screens.LoginScreen;
import com.globant.screens.SwipeScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    private AndroidDriver driver;
    @BeforeClass
    public void setUp() {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setCapability("deviceName", "emulator-5554");
        options.setCapability("automationName", "UiAutomator2");
        options.setCapability("platformName", "Android");
        options.setCapability("platformVersion", "15");
        options.setCapability("appPackage", "com.wdiodemoapp");
        options.setCapability("appActivity", "com.wdiodemoapp.MainActivity");
        options.setCapability("appVersion", "0");
        options.setCapability("app", "C:\\Users\\javier.murillo\\Desktop\\AndroidSrc\\Android-NativeDemoApp-1.0.8.apk");
        try {
            driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), options);
        }catch (MalformedURLException e){
            System.out.println(e.getMessage());
        }
    }

    public NavigationMenuScreen getGeneralScreen(){return new NavigationMenuScreen(driver);}
    public LoginScreen getLoginScreen(){return new LoginScreen(driver);}
    public SwipeScreen getSwipeScreen(){return new SwipeScreen(driver);}

    @AfterClass
    public void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }
}