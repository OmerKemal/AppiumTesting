package Appium;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import static org.junit.Assert.assertTrue;

public class Appium07WebChrome {
    @Test
    public void test() throws MalformedURLException, InterruptedException {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        // capabilities.setCapability("platformName", "Android");
        // capabilities.setCapability(CapabilityType.APPLICATION_NAME, "Android");

        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.0");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "R58M250L4FN");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");

        //capabilities.setCapability("appPackage", "com.android.chrome");
        //capabilities.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        //capabilities.setCapability("autoWebview", true);

        //capabilities.setCapability("chromedriverExecutable", "\"C:\\Users\\User\\Downloads\\chromeDriver\\chromedriver.exe\"");


        capabilities.setCapability("autoDismissAlerts", true);

        capabilities.setCapability("noReset", true);

       // capabilities.setCapability("noReset", true);

       // ESKI===>>> AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wb/hub"),capabilities);
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),capabilities);

        System.out.println(driver.getContext()+"<======== native or web");

        Set<String> allTypes = driver.getContextHandles();

        System.out.println(allTypes);

        Thread.sleep(5000);

       for(String w : allTypes){
            System.out.println(w);
            if (w.contains("WEBVIEW")){
                driver.context(w);
            }
        }

       // driver.context("WEBVIEW_chrome");

       // Thread.sleep(5000);


        driver.get("https://www.amazon.co.uk");
        //MobileElement homeScreenLogo= driver.findElementByAccessibilityId("Amazon.co.uk");
        //assertTrue(homeScreenLogo.isDisplayed());

        Thread.sleep(3000);

        System.out.println(driver.getContext()+"<======== son durum native or web");

       // System.out.println(driver.getCurrentUrl());
        // neden getCurrentURL yapmiyor anlamadim
        

        //WebElement continueRejectCookie= driver.findElementById("sp-cc-rejectall-container");

    //    MobileElement signInButton= driver.findElementById("nav-logobar-greeting");
      WebElement signInButton= driver.findElement(AppiumBy.xpath("//a[contains(text(),' Sign in ›')]"));
      signInButton.click();

      //Chrome driver executable 3. derste

        WebElement welcomeTitle=driver.findElement(AppiumBy.xpath("//h2[contains(text(),' Welcome')]"));
        assertTrue(welcomeTitle.isDisplayed());










    }
}
