package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import java.net.URL;

public class Calculator {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("devicename", "POCO X3 Pro");
        dc.setCapability("udid", "c09ea964");
        dc.setCapability("platformName", "Android");
        dc.setCapability("platformVersion", "12");
        dc.setCapability("appPackage", "com.google.android.calculator");
        dc.setCapability("appActivity", "com.android.calculator2.Calculator");

        URL url = new URL("https://127.0.0.1:4723/wd/hub");
        AndroidDriver driver = new AndroidDriver(url, dc);
        Thread.sleep(5000);

        WebElement satu = driver.findElement(By.id("com.google.android.calculator:id/digit_1"));
        WebElement dua = driver.findElement(By.id("com.google.android.calculator:id/digit_2"));
        WebElement tiga = driver.findElement(By.id("com.google.android.calculator:id/digit_3"));
        WebElement empat = driver.findElement(By.id("com.google.android.calculator:id/digit_4"));
        WebElement tambah = driver.findElement(By.id("com.google.android.calculator:id/op_add"));
        WebElement kali = driver.findElement(By.id("com.google.android.calculator:id/op_mul"));
        WebElement samaDengan = driver.findElement(By.id("com.google.android.calculator:id/eq"));
        WebElement hasil = driver.findElement(By.id("com.google.android.calculator:id/result_preview"));
        WebElement hapus = driver.findElement(By.id("com.google.android.calculator:id/clr"));

        public String getTxtHasil(){
            return hasil.getText();
        }

        public void add() {
            hapus.click();
            satu.click();
            tambah.click();
            dua.click();
            samaDengan.click();
        }

        public void mul() {
            hapus.click();
            tiga.click();
            kali.click();
            empat.click();
            samaDengan.click();
        }
    }
}
