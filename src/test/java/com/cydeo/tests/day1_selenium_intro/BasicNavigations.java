package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

       //driver.manage().window().fullscreen();




        driver.get("https://www.tesla.com");

        String currentTitle=driver.getTitle();
        System.out.println("Current Title ="+currentTitle);
        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate back
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        //use navigate().to()
        driver.navigate().to("https://www.google.com");
        currentTitle=driver.getTitle();
        //get the title of the page
        //System.out.println("driver.getTitle() ="+driver.getTitle());
        System.out.println("Current Title ="+currentTitle);
        String currentURL=driver.getCurrentUrl();
        System.out.println("Current URL ="+currentURL);


    }
}
