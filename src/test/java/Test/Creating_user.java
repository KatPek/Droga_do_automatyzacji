package Test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import java.util.List;

public class Creating_user {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://candymapper.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("popup-widget238491-close-icon")).click();
        driver.get("https://candymapper.com/m/create-account");
        driver.findElement(By.name("nameFirst")).sendKeys("Julia");
        driver.findElement(By.name("nameLast")).sendKeys("Roberts");
        driver.findElement(By.name("email")).sendKeys("test@test.com");
        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        buttons.get(0).click();
        synchronized (driver) {
            driver.wait(3000);
        }
        List<WebElement> headers = driver.findElements(By.tagName("h4"));

        if(headers.get(0).getText().equals("Check your email"))
        {
            System.out.println("Test passed");
        }
        else
        {
            System.out.println("Test failed");
        }
        driver.close();
    }
}
