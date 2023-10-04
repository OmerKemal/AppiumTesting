package Appium;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class Appium01 {
    @Test
    public void test(){

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "Android");

    }
}
