package Appium;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.testng.Assert.assertTrue;

public class Appium03 {
    @Test
    public void test() throws MalformedURLException, InterruptedException {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        // capabilities.setCapability("platformName", "Android");
        // capabilities.setCapability(CapabilityType.APPLICATION_NAME, "Android");

        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.0");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "R58M250L4FN");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

        capabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\User\\IdeaProjects\\AppiumProject\\src\\Apps\\Gesture Tool_1.3_Apkpure.apk");
        capabilities.setCapability("appPackage", "com.davemac327.gesture.tool");
        capabilities.setCapability("appActivity", "com.davemac327.gesture.tool.GestureBuilderActivity");

        capabilities.setCapability("noReset", true);



       // ESKI===>>> AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wb/hub"),capabilities);
        AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723"),capabilities);


       //MobileElement homescreenTitle = driver.findElementById("");
        MobileElement addGestureButton = driver.findElementById("com.davemac327.gesture.tool:id/addButton");
        Thread.sleep(3000);
        assertTrue(addGestureButton.isDisplayed());
        Thread.sleep(3000);

        WebElement testButton=driver.findElementById("com.davemac327.gesture.tool:id/testButton");

        testButton.click();
        System.out.println("test button is clicked");

        driver.closeApp();
        driver.quit();

        //

    }
}
