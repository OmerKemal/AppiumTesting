package Appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
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
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),capabilities);

        WebElement num1=driver.findElement(By.id("com.google.android.calculator:id/digit_1"));
        WebElement num2=driver.findElement(By.id("com.google.android.calculator:id/digit_2"));
        WebElement num3=driver.findElement(By.id("com.google.android.calculator:id/digit_3"));
        WebElement num4=driver.findElement(By.id("com.google.android.calculator:id/digit_4"));
        WebElement num5=driver.findElement(By.id("com.google.android.calculator:id/digit_5"));
        WebElement num6=driver.findElement(By.id("com.google.android.calculator:id/digit_6"));
        WebElement num7=driver.findElement(By.id("com.google.android.calculator:id/digit_7"));
        WebElement num8=driver.findElement(By.id("com.google.android.calculator:id/digit_8"));
        WebElement num9=driver.findElement(By.id("com.google.android.calculator:id/digit_9"));
        WebElement num0=driver.findElement(By.id("com.google.android.calculator:id/digit_0"));

        WebElement plusSign=driver.findElement(By.id("com.google.android.calculator:id/op_add"));
        WebElement minusSign=driver.findElement(By.id("com.google.android.calculator:id/op_sub"));
        WebElement multiplySign=driver.findElement(By.id("com.google.android.calculator:id/op_mul"));
        WebElement divideSign=driver.findElement(By.id("com.google.android.calculator:id/op_div"));

        WebElement equalSign=driver.findElement(By.id("com.google.android.calculator:id/eq"));
        WebElement deleteSign=driver.findElement(By.id("com.google.android.calculator:id/del"));


        //64+71=135
        num6.click();
        num4.click();
        plusSign.click();
        num7.click();
        num1.click();
        Thread.sleep(2000);


        WebElement preResult=driver.findElement(By.id("com.google.android.calculator:id/result_preview"));
        String stringPreResult=preResult.getText();
        equalSign.click();

        Thread.sleep(1000);

        WebElement finalResult=driver.findElement(By.id("com.google.android.calculator:id/result_final"));


        assertEquals(stringPreResult, finalResult.getText());










    }
}
