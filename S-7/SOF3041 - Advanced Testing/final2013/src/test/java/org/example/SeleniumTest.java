package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    void searching() throws InterruptedException {
        driver.get("http://vitimex.com.vn/");
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div[3]/div/div[1]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div[3]/div/div[1]/div/div/div[2]/form/div/input[2]")).sendKeys("AO");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div[3]/div/div[1]/div/div/div[2]/form/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div[2]/div[2]/div[2]/div[2]/div/div[1]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/main/div/div[2]/div[1]/div/div/div[2]/div[2]/div[3]/div/div[2]/div[2]/div[4]/label")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/main/div/div[2]/div[1]/div/div/div[2]/div[2]/div[5]/div[2]/button")).click();
        Thread.sleep(2000);
        assertEquals("https://vitimex.com.vn/products/atr5033", driver.getCurrentUrl());
    }
    @AfterAll
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
