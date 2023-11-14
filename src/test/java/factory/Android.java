package factory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import utils.GetProperties;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Android implements IDevice{
    @Override
    public AppiumDriver create() {
        AppiumDriver mobile = null;
        DesiredCapabilities config = new DesiredCapabilities();
        config.setCapability("deviceName", GetProperties.getProperties().getDeviceName());
        config.setCapability("platformVersion", GetProperties.getProperties().getPlatformVersion());
        config.setCapability("appPackage", GetProperties.getProperties().getAppPackage());
        config.setCapability("appActivity", GetProperties.getProperties().getAppActivity());
        config.setCapability("platformName", "Android");
        config.setCapability("automationName", "uiautomator2");
        try {
            mobile = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), config);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        mobile.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        return mobile;
    }
}
