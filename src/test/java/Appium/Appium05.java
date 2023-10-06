package Appium;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Appium05 {
    @Test
    public void test() throws MalformedURLException, InterruptedException {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        // capabilities.setCapability("platformName", "Android");
        // capabilities.setCapability(CapabilityType.APPLICATION_NAME, "Android");

        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.0");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "R58M250L4FN");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

        capabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\User\\IdeaProjects\\AppiumProject\\src\\Apps\\Calculator_8.4.1 (520193683)_Apkpure.apk");
       // capabilities.setCapability("appPackage", "com.davemac327.gesture.tool");
       // capabilities.setCapability("appActivity", "com.davemac327.gesture.tool.GestureBuilderActivity");

       // capabilities.setCapability("noReset", true);

       // ESKI===>>> AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wb/hub"),capabilities);
        AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723"),capabilities);

        MobileElement num1=driver.findElementById("com.google.android.calculator:id/digit_1");
        MobileElement num2=driver.findElementById("com.google.android.calculator:id/digit_2");
        MobileElement num3=driver.findElementById("com.google.android.calculator:id/digit_3");
        MobileElement num4=driver.findElementById("com.google.android.calculator:id/digit_4");
        MobileElement num5=driver.findElementById("com.google.android.calculator:id/digit_5");
        MobileElement num6=driver.findElementById("com.google.android.calculator:id/digit_6");
        MobileElement num7=driver.findElementById("com.google.android.calculator:id/digit_7");
        MobileElement num8=driver.findElementById("com.google.android.calculator:id/digit_8");
        MobileElement num9=driver.findElementById("com.google.android.calculator:id/digit_9");
        MobileElement num0=driver.findElementById("com.google.android.calculator:id/digit_0");

        MobileElement plusSign=driver.findElementById("com.google.android.calculator:id/op_add");
        MobileElement minusSign=driver.findElementById("com.google.android.calculator:id/op_sub");
        MobileElement multiplySign=driver.findElementById("com.google.android.calculator:id/op_mul");
        MobileElement divideSign=driver.findElementById("com.google.android.calculator:id/op_div");

        MobileElement equalSign=driver.findElementById("com.google.android.calculator:id/eq");
        MobileElement deleteSign=driver.findElementById("com.google.android.calculator:id/del");


        //64+71=135
        num6.click();
        num4.click();
        plusSign.click();
        num7.click();
        num1.click();
        Thread.sleep(2000);


        MobileElement preResult=driver.findElementById("com.google.android.calculator:id/result_preview");
        String stringPreResult=preResult.getText();
        equalSign.click();

        Thread.sleep(1000);

        MobileElement finalResult=driver.findElementById("com.google.android.calculator:id/result_final");


        assertEquals(stringPreResult, finalResult.getText());










    }
}
