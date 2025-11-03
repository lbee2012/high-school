package org.example;

import static org.junit.jupiter.api.Assertions.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    private static WebDriver driver;
    @BeforeAll
    public static void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    void login() throws InterruptedException {
        driver.get("https://practicetestautomation.com/practice-test-login/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div/section/section/div[1]/div[1]/input")).sendKeys("student");
        driver.findElement(By.xpath("/html/body/div/div/section/section/div[1]/div[2]/input")).sendKeys("Password123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div/section/section/div[1]/button")).click();
        Thread.sleep(2000);
        String expected = "https://practicetestautomation.com/logged-in-successfully/";
        String actual = driver.getCurrentUrl();
        assertEquals(expected, actual);
    }
    @AfterAll
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
