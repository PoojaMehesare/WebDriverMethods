package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com/");
        driver.get("https://www.facebook.com/");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        System.out.println(driver.getPageSource());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getWindowHandle());
        System.out.println(driver.getWindowHandles());
        driver.manage();
        driver.navigate().to("https://www.instagram.com/");
        System.out.println(driver.getTitle());
        driver.navigate().back();
        System.out.println(driver.getTitle());
        driver.navigate().forward();
        System.out.println(driver.getTitle());
        driver.navigate().back();
        System.out.println(driver.getTitle());
        driver.navigate().refresh();
        driver.close();
        driver.quit();
        driver.findElement(By.id("email")).sendKeys("poojamehesare@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("pooja@123");
        driver.findElement(By.linkText("Log In")).click();
        driver.findElement(By.linkText("Forgotten password?")).click();
        driver.findElement(By.linkText("Create New Account")).click();
        driver.findElement(By.linkText("Create a Page")).click();
        driver.findElement(By.linkText("Facebook helps you connect and share with the people in your life")).click();
    }
}
