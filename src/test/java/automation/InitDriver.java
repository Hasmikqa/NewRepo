package automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class InitDriver {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--start-maximized"));
driver.get("https://www.sas.am/");
Thread.sleep(4000);
driver.findElement(By.cssSelector("[class='item-menu__link item-menu_2 item-menu_id_ ']")).click();



    }
}
