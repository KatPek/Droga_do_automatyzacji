package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Closing_pop_up {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        String act_title = driver.getTitle();
        if (act_title.equals("Your Store")) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
        driver.close();
    }
}
