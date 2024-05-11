package testcases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Assignment2_registrationForm {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://qa.way2automation.com/");

        driver.findElement(By.xpath("//*[@name='name']")).sendKeys("FirstName");
        driver.findElement(By.xpath("(//*[@class='button' and @value='Submit'])[2]")).click();
    }

}
