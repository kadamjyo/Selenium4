package testcases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class Gmail_practice {
public static void main(String[] args){
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.manage().window().maximize();
    driver.get("https://www.google.co.in");
    driver.findElement(By.xpath("//*[@name='q']")).sendKeys("way2automation");
    driver.findElement(By.xpath("//*[@value='Google Search']")).click();
    driver.findElement(By.xpath("//*[@jsname='UWckNb']")).click();
    //driver.close();
    }
}
