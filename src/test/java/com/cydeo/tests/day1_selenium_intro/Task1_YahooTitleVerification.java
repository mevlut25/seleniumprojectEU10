package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.yahoo.com");
        String actualTitle=driver.getTitle();
        System.out.println(actualTitle);
        String expectedTitle="Yahoo UK | News, email and search";

        if (expectedTitle.equals(actualTitle)){
            System.out.println("Title is as expected. Verification PASSED!");
        }else{
            System.out.println("Title is not as expected. Verification FAILED!");
        }


    }
}
