package org.example.Modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumModel {
    public static void sendRequest() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://sinoptik.ua/");

        WebElement element = driver.findElement(By.id("today-temp"));
        element.click();

        driver.quit();
    }
}