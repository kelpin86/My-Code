package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.List;

public class BestSelenuim {
    @Test
    public void selenuim(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // for hover over or drag and drop
        Actions actions = new Actions(driver);
        WebElement x = driver.findElement(By.xpath("cbbbb"));
        WebElement y = driver.findElement(By.xpath("nnnnnnn"));
        actions.moveToElement(x).clickAndHold().moveToElement(y).release().build().perform();
        actions.moveToElement(x).doubleClick().build().perform();

        // for alert
        Alert alert= driver.switchTo().alert();
        alert.accept();
        alert.dismiss();

        // for  cookies
        driver.manage().getCookies();
        // driver.manage().deleteCookie(1);

        // for select
        Select select = new Select(driver.findElement(By.xpath("nknkm")));
        select.selectByVisibleText("ali");
        select.deselectByIndex(1);

        //for frame
        driver.switchTo().frame(1);
        driver.switchTo().frame(3);

        //How to find all links in the page?
        List<WebElement> list = driver.findElements(By.tagName("a"));

        //For Scroll down
        JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript("scroll(0,250);");

        //What is the syntax for uploading a file?
        WebElement uplaod = driver.findElement(By.id("q"));
        String file = "User/c/destop/file";
        uplaod.sendKeys(file);



    }
}
