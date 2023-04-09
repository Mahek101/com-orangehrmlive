package com_orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {

    public static void main(String[] args) {
        // setup chrome browser
        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://opensource-demo.orangehrmlive.com/";

        // Open Url
        driver.get(baseUrl);

        // Maximise the window
        driver.manage().window().maximize();

        // We give Implicit wait to driver by implicit method
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        // Print the title of the page
        System.out.println("Title of the page is : " + driver.getTitle());

        //Print the current Url
        System.out.println("The current URL is : " + driver.getCurrentUrl());

        // Print the page source
        System.out.println("The page source is : " + driver.getPageSource());

        //Enter the username to username field
        driver.findElement(By.name("username")).sendKeys("MeghaMehta");

        //Enter the password to password field
        driver.findElement(By.name("password")).sendKeys("Megha123");

        // Close the browser
        driver.close();

    }
}


