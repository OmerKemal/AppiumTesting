package Appium;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Appium06NativeChrome {
    @Test
    public void test() throws MalformedURLException, InterruptedException {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        // capabilities.setCapability("platformName", "Android");
        // capabilities.setCapability(CapabilityType.APPLICATION_NAME, "Android");

        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.0");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "R58M250L4FN");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

        capabilities.setCapability("appPackage", "com.android.chrome");
        capabilities.setCapability("appActivity", "com.google.android.apps.chrome.Main");

        capabilities.setCapability("noReset", true);

       // capabilities.setCapability("noReset", true);

       // ESKI===>>> AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wb/hub"),capabilities);
        AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723"),capabilities);

        driver.get("amazon.co.uk");
        MobileElement homeScreenLogo= driver.findElementByAccessibilityId("Amazon.co.uk");
        assertTrue(homeScreenLogo.isDisplayed());

        System.out.println(driver.getCurrentUrl());

        MobileElement signInButton= driver.findElementByXPath("//android.view.View[@content-desc=\"Sign in ›\"]/android.widget.TextView");
        signInButton.click();









    }
}
