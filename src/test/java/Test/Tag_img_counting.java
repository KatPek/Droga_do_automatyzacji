package Test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import java.util.List;

public class Tag_img_counting {
        public static void main(String[] args) {
            WebDriver driver = new ChromeDriver();

            driver.get("https://candymapper.com/");
            driver.manage().window().maximize();

            List<WebElement> images = driver.findElements(By.tagName("img"));
            System.out.println("total number of images:" + images.size());

            driver.close();
        }
    }