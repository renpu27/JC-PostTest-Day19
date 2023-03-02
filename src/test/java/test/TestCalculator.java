package test;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Calculator;

import java.net.URL;

public class TestCalculator {

    public Calculator calculator;

    @BeforeClass
    public void setUp(){
    DesiredCapabilities dc = new DesiredCapabilities();
    dc.setCapability("devicename", "POCO X3 Pro");
    dc.setCapability("udid", "c09ea964");
    dc.setCapability("platformName", "Android");
    dc.setCapability("platformVersion", "12");
    dc.setCapability("appPackage", "com.google.android.calculator");
    dc.setCapability("appActivity", "com.android.calculator2.Calculator");

    URL url = new URL("https://127.0.0.1:4723/wd/hub");
    AndroidDriver driver = new AndroidDriver(url, dc);

    @Test (priority = 1)
    public void testAdd() {
        calculator.add();
        Assert.assertEquals(calculator.getTxtHasil(), 3);
    }

    @Test (priority = 2)
    public void testMul() {
        calculator.mul();
        Assert.assertEquals(calculator.getTxtHasil(), 12);
        }
}
