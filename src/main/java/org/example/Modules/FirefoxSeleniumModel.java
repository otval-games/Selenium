package org.example.Modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class FirefoxSeleniumModel {
    public static void sendRequest() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.get("https://sinoptik.ua/");

        String todayTemp = driver.findElement(By.className("today-temp")).getText();

        pause(500);

        WebElement tomorrowWeather = driver.findElement(By.id("bd2"));
        tomorrowWeather.click();
        String tommorowDate = driver.findElement(By.className("infoDate")).getText();

        System.out.println("Today temperature: " + todayTemp);
        System.out.println("Tomorrow date: " + tommorowDate);

        pause(1000);

        driver.quit();
    }

    public static void pause(int millis) throws InterruptedException {
        Thread.sleep(millis);
    }
}
