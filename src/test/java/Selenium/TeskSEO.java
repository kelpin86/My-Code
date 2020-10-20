package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TeskSEO {
    @BeforeMethod


    @Test
    public void CurrentLocation() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.propertypal.com/");

         WebElement Search = driver.findElement(By.xpath("/html/body/div[1]/div/article/article/div/div[2]/div/div/div[1]/div/form/div/div[1]/section/input"));
        Search.sendKeys("My Location" + Keys.ENTER);
        //Assert.assertEquals("");

    }
}
