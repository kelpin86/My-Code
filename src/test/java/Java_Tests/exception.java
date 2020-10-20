package Java_Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class exception {
    public static void main(String[] args) {
        try {
            int arr[] = {1,3,41,43,23,45,67};
            System.out.println(arr[1]);
            //System.out.println(arr[9]);
            System.out.println(arr[3]);
            System.out.println(arr[4]);

            System.out.println(arr[10]);
        }catch (Exception e){
            System.out.println("samething is wrong");
        } finally {
            System.out.println("the program is finish");
        }

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
         driver.get("https://amazon.com");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         Actions actions = new Actions(driver);
         driver.findElement(By.id("s")).submit();
         driver.manage().getCookies();







    }
}
