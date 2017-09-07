package com.qauber.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "/Users/roshan/Downloads/chromedriver");
         WebDriver driver=new ChromeDriver();
         driver.get("https://www.facebook.com");
         driver.findElement(By.id("u_0_9")).sendKeys("aneena");
         driver.findElement(By.id("u_0_b")).sendKeys("george");

    }
}
