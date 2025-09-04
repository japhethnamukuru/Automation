package com.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GoogleTest {
    public static void  main (String[] args) {
        WebDriverManager.chromedriver().setup();

//        Open chrome
        WebDriver driver = new ChromeDriver();

//        Navigate to chrome
        driver.get("https://www.google.com");

//        Print page title
        System.out.println("The page title is " + driver.getTitle());

        driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(10)));

//        Close the browser
        driver.quit();

    }
}
