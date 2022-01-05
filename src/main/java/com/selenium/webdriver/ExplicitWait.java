package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("http://google.com/");
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("poojamehesare@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("pooja@123");
    }
}
